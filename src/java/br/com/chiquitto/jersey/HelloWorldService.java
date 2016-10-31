package br.com.chiquitto.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String helloworld() {
        return "Hello World";
    }
}
