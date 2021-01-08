package test;

//import org.junit.Test;

public class TestStringProvider {

	
	public void parseRequestMethodIncorrect() {
        String mockedPostRequest = "POST /cgi-bin/process.cgi HTTP/1.1\n" +
                "User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)\n" +
                "Host: www.tutorialspoint.com\n" +
                "Content-Type: application/x-www-form-urlencoded\n" +
                "Content-Length: length\n" +
                "Accept-Language: en-us\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Connection: Keep-Alive\n" +
                "\n" +
                "licenseID=string&content=string&/paramsXML=string";
        //RequestFactory requestFactory = new RequestFactory();
        //Request r = requestFactory.parseRequest(mockedPostRequest);
        //assertTrue(r instanceof  InvalidRequest);

	}
}
