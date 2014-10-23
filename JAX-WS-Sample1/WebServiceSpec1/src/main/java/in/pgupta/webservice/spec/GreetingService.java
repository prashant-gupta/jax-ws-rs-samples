package in.pgupta.webservice.spec;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by prashant on 22/10/14.
 */

@WebService
public interface GreetingService {

    @WebMethod
    public String greet(String message);

    @WebMethod(operationName = "echoMessage")
    public String echo(String message);

    @WebMethod
    public GreetReply doQuery(GreetQuery query);
}
