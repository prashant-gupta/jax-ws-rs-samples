package in.pgupta.webservice.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;

/**
 * Created by prashant on 23/10/14.
 */
public class GreetingServiceOutInterceptor extends AbstractSoapInterceptor {

    public GreetingServiceOutInterceptor() {
        super(Phase.WRITE);
        this.addBefore(SoapOutInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        System.out.println("========= GreetingServiceOutInterceptor ======== ");

    }
}