package org.qualitune.naoservice.client.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Test;
import org.qualitune.naoservice.client.NaoConstants;
import org.qualitune.naoservice.client.NaoData;
import org.qualitune.naoservice.client.NaoJointID;
import org.qualitune.naoservice.client.NaoJointInfo;
import org.qualitune.naoservice.client.NaoJointInfos;
import org.qualitune.naoservice.client.NaoUtil;
import org.qualitune.naoservice.client.NaoUtilException;

/**
 * Test cases for the {@link NaoUtil} class.
 * 
 * @author Claas Wilke
 */
public class TestNaoUtil {

	/** A data holder object for storing IP and PORT for Nao proxies used for testing. */
	protected static NaoData nao = new NaoData("192.168.0.139", 8070);

	@AfterClass
	public static void tearDown() {

		NaoUtil.sitDown(nao);
		NaoUtil.setStiffness(nao, 0.0f);
		nao = null;
	}

	@Test
	public void testGetActuatorSummary01() throws NaoUtilException {

		System.out.println(NaoUtil.getActuatorSummary(nao));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetJointInfoNegative01() throws NaoUtilException,
			InterruptedException {

		NaoUtil.getJointInfo(null, NaoJointID.HeadPitch);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetJointInfoNegative02() throws NaoUtilException,
			InterruptedException {

		NaoUtil.getJointInfo(nao, null);
	}

	@Test
	public void testGetJointInfoPositive01() throws NaoUtilException,
			InterruptedException {

		NaoJointInfo result = NaoUtil.getJointInfo(nao, NaoJointID.HeadPitch);
		assertEquals(NaoJointID.HeadPitch, result.getJointID());
	}

	@Test
	public void testGetJointInfosPositive01() throws NaoUtilException,
			InterruptedException {
		NaoJointInfos result = NaoUtil.getJointInfos(nao);

		for (NaoJointID id : NaoJointID.values())
			assertNotNull(result.getJointInfo(id));
		// end for.
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetJointInfosNegative01() throws NaoUtilException,
			InterruptedException {
		NaoUtil.getJointInfos(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSensorValueNegative01() throws NaoUtilException {

		NaoUtil.getSensorValue(null, "id");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSensorValueNegative02() throws NaoUtilException {

		NaoUtil.getSensorValue(nao, null);
	}

	@Test
	public void testGetSensorValuePositive01() throws NaoUtilException {

		String result = NaoUtil.getSensorValue(nao,
				NaoConstants.SENSOR_NAME_BATTERY_CELL_VOLTAGE_MAX);

		assertNotNull(result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSensorValuesNegative01() throws NaoUtilException {

		List<Integer> ids = new ArrayList<Integer>();
		ids.add(303);
		NaoUtil.getSensorValues(null, ids);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSensorValuesNegative02() throws NaoUtilException {

		NaoUtil.getSensorValues(nao, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSensorValuesNegative03() throws NaoUtilException {

		List<Integer> ids = new ArrayList<Integer>();
		NaoUtil.getSensorValues(nao, ids);
	}

	@Test
	public void testGetSensorValuesPositive01() throws NaoUtilException {

		List<Integer> ids = new ArrayList<Integer>();
		ids.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CELLVOLTAGEMAX);
		ids.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CELLVOLTAGEMIN);

		Map<String, String> result = NaoUtil.getSensorValues(nao, ids);

		assertNotNull(result);
		assertEquals(3, result.size());
		assertNotNull(result
				.get(NaoConstants.SENSOR_NAME_BATTERY_CELL_VOLTAGE_MAX));
		assertNotNull(result
				.get(NaoConstants.SENSOR_NAME_BATTERY_CELL_VOLTAGE_MIN));
		assertNotNull(result.get(NaoConstants.TIME_STAMP));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSayNegative01() {

		NaoUtil.say(null, "Test");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSayNegative02() {

		NaoUtil.say(nao, null);
	}

	@Test
	public void testSayPositive01() {

		NaoUtil.say(nao, "Test");
	}

	@Test
	public void testSayPositive02() {

		NaoUtil.say(nao, "Test?");
	}

	@Test
	public void testSayPositive03() {

		NaoUtil.say(nao, "Test, test");
	}

	@Test
	public void testSayPositive04() {

		NaoUtil.say(nao, "Test' test");
	}

	@Test
	public void testSayPositive05() {

		NaoUtil.say(nao, "Test\ntest");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetStiffnessNegative01() {

		NaoUtil.setStiffness(null, 0.0f);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetStiffnessNegative02() {

		NaoUtil.setStiffness(nao, -0.1f);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetStiffnessNegative03() {

		NaoUtil.setStiffness(nao, 1.1f);
	}

	@Test
	public void testSetStiffnessPositive01() {

		NaoUtil.setStiffness(nao, 1.0f);

		assertEquals(1.0f, NaoUtil.getAvgStiffness(nao), 0.0f);
	}

	@Test
	public void testSetStiffnessPositive02() {

		NaoUtil.setStiffness(nao, 0.5f);

		assertEquals(0.5f, NaoUtil.getAvgStiffness(nao), 0.0f);
	}

	@Test
	public void testSetStiffnessPositive03() {

		NaoUtil.setStiffness(nao, 0.0f);

		assertEquals(0.0f, NaoUtil.getAvgStiffness(nao), 0.0f);
	}

	@Test
	public void testSitDownPostive01() {

		assertTrue(NaoUtil.sitDown(nao));
	}

	@Test
	public void testStandUpPostive01() {

		assertTrue(NaoUtil.standUp(nao));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWalkToNegative01() {

		NaoUtil.walkTo(null, 0f, 0.1f);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWalkToNegative02() {

		NaoUtil.walkTo(nao, 0f, 0f);
	}

	@Test
	public void testWalkToPositive01() {

		NaoUtil.standUp(nao);
		NaoUtil.walkTo(nao, 0.5f, 0f);
		NaoUtil.walkTo(nao, -0.5f, 0f);
	}

	@Test
	public void testWalkToPositive02() {

		NaoUtil.standUp(nao);
		NaoUtil.walkTo(nao, 0f, 0.5f);
		NaoUtil.walkTo(nao, 0f, -0.5f);
	}

	@Test
	public void testWalkToPositive03() {

		NaoUtil.standUp(nao);
		NaoUtil.walkTo(nao, 0.5f, 0.5f);
		NaoUtil.walkTo(nao, -0.5f, -0.5f);
	}

	@Test(timeout = 12000)
	public void testParallelExecution() {

		SaySomethingTest run = new SaySomethingTest();
		run.start();
		NaoUtil.standUp(nao);
		/*
		 * If executed in parallel, test case should not last longer than 12
		 * seconds.
		 */
	}

	private class SaySomethingTest extends Thread {

		@Override
		public void run() {
			NaoUtil.say(nao,
				"Test parallel execution of talking and getting up.");
		}
	}
}
