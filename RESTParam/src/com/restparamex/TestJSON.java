package com.restparamex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testjson")
public class TestJSON {
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Bean sendInfo(@PathParam("id") int id){
		Bean b = new Bean();
		b.setId(id);
		b.setName("Shefalee");
		b.setAge(37);
		return b;
	}

}
