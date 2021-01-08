package test;

//import static org.junit.Assert.assertEquals;

import java.io.IOException;
import exceptions.parsers_exceptions.InvalidRequestException;
import handlers.RequestHandler;
import parsers.RequestParser;
import parsers.ResponseParser;

public class ResponseParserTest {
	
	ResponseParser validResponse_html;
	String rootDir;
	ResponseParser val1_html, val2_html, homePageResponse, pageNotFoundResponse;
	
	public void testValidResponseContent() throws IOException {
		String expected ="<html lang=\"en\">\r\n"
				+ "	<body>\r\n"
				+ "	  <h1>This is my index.htm</h1>"
				+ "	  <h3>by Cristian Badescu</h3>"
				+ "	 </body>\r\n"
				+ "</html>";
	}
	
	
	public void testPageNotFoundResponseContent() throws IOException {
		String expected ="<html>\r\n"
				+ " <p>Page was not found!</p>\r\n"
				+ "</html>";
	}
	
	public void testHttpVersion(){
		//assertEquals("HTTP/1.1",val1_html.getHttpVersion());
		//assertEquals("HTTP/1.1",val2_html.getHttpVersion());
		//assertEquals("HTTP/1.1",homePageResponse.getHttpVersion());
		//assertEquals("HTTP/1.1",pageNotFoundResponse.getHttpVersion());
	}

}
