package ServerHttp;

import java.util.ArrayList;

public class HttpResponseImpl implements HttpResponse{
	
	private ArrayList<String> headers = new ArrayList<String>();
	private String allheaders = "";
	
	
	// write the http response
	@Override
	public String getStatus404(){
	return ("HTTP/1.1 404 Not Found\r\n");
	}
	@Override
	public String getStatus405(){
	return ("HTTP/1.1 405 Method Not Allowed\r\n");
	}
	@Override
	public String getStatus500(){
	return("HTTP/1.1 500 Internal Server Error\r\n");
	}
	@Override
	public String getStatus503(){
	return("HTTP/1.1 503 Service Unavailable\r\n");
	}
	@Override
	public void addHeader(String name, String value){
		headers.add(name+": "+value);		
	}
	@Override
	public String getHeaders(){
		for (String new_header : headers){
			allheaders+=new_header+"\r\n";			
		}
	return(allheaders);
	}
	@Override
	public String getResponseHeaderOK(){
		String tmp = "HTTP/1.1 200 OK\r\n"+getHeaders()+"\r\n";
	return(tmp);
	}
}
