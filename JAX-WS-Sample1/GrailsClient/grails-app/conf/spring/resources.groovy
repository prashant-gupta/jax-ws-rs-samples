// Place your Spring DSL code here

import grails.util.Holders
import in.pgupta.webservice.spec.GreetingService
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean


beans = {
    xmlns jaxws: "http://cxf.apache.org/jaxws"

    jaxws.'client'(id:'greetingService',
            address: (Holders.config.webservice.url+'/greet'),
            serviceClass:'in.pgupta.webservice.spec.GreetingService')



}
