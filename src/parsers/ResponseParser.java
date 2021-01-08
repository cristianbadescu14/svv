package parsers;

import java.io.IOException;
import webserver.Request;

public class ResponseParser {

	private String rootDirectoryPath;
	private Request request;
	
	public ResponseParser(String rootDirectoryPath, Request request) {
		this.rootDirectoryPath = rootDirectoryPath;
		this.request = request;
	}
	
	public String getHttpVersion() {
		return request.getHttpVersion();
	}
	
	public String getrootDirectoryPath() {
		return rootDirectoryPath;
	}

	public Object getContentString()  throws IOException {
		String resultPath;
		
		if(request.getResourcePath().equals("/")||request.getResourcePath().isEmpty()) {
			resultPath = rootDirectoryPath + "/";
		}
		return null;
	}

	
	
}
