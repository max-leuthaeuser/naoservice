String result = null;
try {
	result = URLEncoder.encode(aURLFragment, "UTF-8");
	result = result.replaceAll("\\+", "%20");
}
catch (Exception ex){
	throw new RuntimeException("UTF-8 not supported", ex);
}
return result;
