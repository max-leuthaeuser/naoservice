package org.qualitune.naoservice.client;

public class NaoData {
	private String ip;
	private int port;
	
	public NaoData(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public String getIP() {
		return ip;
	}
	
	public int getPort() {
		return port;
	}
}
