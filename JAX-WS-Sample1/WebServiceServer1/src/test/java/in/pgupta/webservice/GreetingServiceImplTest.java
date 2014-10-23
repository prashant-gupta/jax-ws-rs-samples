package in.pgupta.webservice;

import in.pgupta.webservice.impl.GreetingServiceImpl;
import org.junit.Test;

/**
 * Created by prashant on 22/10/14.
 */
public class GreetingServiceImplTest {

    @Test
    public void testGreet(){
        GreetingServiceImpl service = new GreetingServiceImpl();

        assert service.greet("world").equals("Hello world");
    }
}
