package rekru.rozmowy.Tibco;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewWebService")
public class WebService {

    @WebMethod(operationName = "something we want")
    public String sayHello(@WebParam(name = "name") String name) {
        return "Text+ " + name + "!";
    }
}