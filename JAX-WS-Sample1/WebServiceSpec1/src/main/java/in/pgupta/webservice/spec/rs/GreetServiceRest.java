package in.pgupta.webservice.spec.rs;

/**
 * Created by prashant on 28/10/14.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/greetRS")
public interface GreetServiceRest {

    @GET
    @Path(value = "/message/{message}")
    @Produces({"application/xml"})
    public Response greet(@PathParam(value = "message") String message);

    @GET
    @Path(value = "/add/{a}/{b}")
    @Produces({"application/xml"})
    public Response add(@PathParam(value = "a") Double a, @PathParam(value = "b") Double b);
}
