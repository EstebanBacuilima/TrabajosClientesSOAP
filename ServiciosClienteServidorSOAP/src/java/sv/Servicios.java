package sv;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicios")
public class Servicios {

    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "password") String password, @WebParam(name = "username") String username) {
        if (username.equals("Esteban1234") && password.equals("0105957922David")) {
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if (pago >= total) {
            // Es el vuelto del pago
            return pago-total;
        } else {
            // validar que es menos del total
            return -1;
        }
    }

}
