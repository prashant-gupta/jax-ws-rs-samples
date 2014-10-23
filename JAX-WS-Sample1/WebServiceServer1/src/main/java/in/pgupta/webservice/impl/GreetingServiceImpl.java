package in.pgupta.webservice.impl;

import in.pgupta.webservice.spec.GreetQuery;
import in.pgupta.webservice.spec.GreetReply;
import in.pgupta.webservice.spec.GreetingService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by prashant on 22/10/14.
 */
@WebService(endpointInterface = "in.pgupta.webservice.spec.GreetingService")
public class GreetingServiceImpl implements GreetingService {

    public String greet(String message) {
        System.out.println("========== message received : "+message);
        return "Hello "+message;
    }

    public String echo(String message
    ) {
        System.out.println("========== message received : "+message);
        return message;
    }


    public GreetReply doQuery(GreetQuery query) {
        GreetReply reply = new GreetReply();
        System.out.println("Message: "+query.getMessage()+" received from: "+query.getSenderName());
        reply.setReply("Message: "+query.getMessage()+" received from: "+query.getSenderName());
        return reply;
    }
}
