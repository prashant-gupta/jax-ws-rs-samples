package in.pgupta.webservice;

import in.pgupta.webservice.spec.GreetingService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by prashant on 23/10/14.
 */
public class Main {

    public static void main(String... args){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(GreetingService.class);
        factoryBean.setAddress("http://localhost:8080/wssample/greet");
        GreetingService service = (GreetingService)factoryBean.create();
        System.out.println("=============== service ======== "+service);
        String message = service.greet("world");
        System.out.println("=============== message ======== "+message);
    }
}
