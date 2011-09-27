try {
    String a = forURL(action);

    URL request = new URL("http://" + ip + ":" + port
            + "/proxy/run/" + a);
    URLConnection response = request.openConnection();
    BufferedReader rd = new BufferedReader(new InputStreamReader(
            response.getInputStream()));

    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
        sb.append((char) cp);
    }

    JSONObject result = new JSONObject(sb.toString());
    rd.close();
    return result;
}

catch (MalformedURLException e) {
    throw new IllegalStateException(
            "Cannot connect to the Nao. (MalformedURLException)", e);
}

catch (IOException e) {
    throw new IllegalStateException(
            "Cannot connect to the Nao. (IOException)", e);
}

catch (JSONException e) {
    throw new IllegalStateException(
            "Unable to create JSON object from request", e);
}
