package com.restbasics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restcore")
public class RESTCore {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testHello(){
		System.out.println("Running as text");
		return "Hello";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String xmlHello(){
		System.out.println("Running as xml");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello " + "</hello>"; 

	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String htmlHello(){
		System.out.println("Running as html");
		return "<html> " + "<title>" + "Hello" + "</title>" + "<body><h1>" 
						+ "Hello" + "</body></h1>" + "</html>";
  
	}

}
