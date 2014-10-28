package in.pgupta.webservice.impl;

import in.pgupta.webservice.spec.rs.GreetServiceRest;
import in.pgupta.webservice.spec.rs.Message;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by prashant on 28/10/14.
 */

public class GreetServiceRestImpl implements GreetServiceRest {

    public Response greet(String message) {
        System.out.println("============= message ======== " + message);
        Message msg = new Message("Hello: " + message);
        return Response.ok(msg).type(MediaType.APPLICATION_XML).build();
    }

    @Override
    public Response add(Double a, Double b) {
        Message msg = new Message("Result: " + (a+b));
        return Response.ok(msg).type(MediaType.APPLICATION_JSON).build();
    }
}
