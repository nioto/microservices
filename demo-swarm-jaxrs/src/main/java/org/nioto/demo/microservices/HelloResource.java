package org.nioto.demo.microservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	
	@Path("json")
	@GET
	@Produces( "application/json")
	public HelloBean helloWorld(){
		System.out.println( " in helloWorld");
		HelloBean h = new HelloBean();
		h.setMessage("Salut !!!");
		return h;
	}
	
	@Path("foo")
    @GET
    @Produces("text/plain")
    public String foo() {
        return "bar\n";
    }
}