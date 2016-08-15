package cl.falabella.seguros.obtenerpropuestas.model;
 

import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaRequest;
import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaResponse;
import cl.falabella.seguros.obtenerpropuestas.model.ws.ProductoAplicarSeguroClienteRemote;

import java.util.Hashtable;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    public static void main(String[] args) {
        try {
            final Context context = getInitialContext();

            ProductoAplicarSeguroClienteRemote productoAplicarSeguroClienteRemote =
                (ProductoAplicarSeguroClienteRemote)context.lookup("EJB-SEG#cl.falabella.seguros.obtenerpropuestas.model.ws.ProductoAplicarSeguroClienteRemote");

            PolizaRequest request = new PolizaRequest();

            request.setCodigoRamo(1);
            request.setEstado(1);
            request.setNumeroDocumento(1);
            request.setTipoCliente("Tipo Cliente");
            request.setTipoDocumento("TipoDocumento");

            List<PolizaResponse> lista =
                productoAplicarSeguroClienteRemote.obtenerPropuestasPolizas(request);

            for (PolizaResponse propuesta : lista) {

                System.out.println(propuesta.getCgRvMeaning());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, "t3://localhost:7001");
        return new InitialContext(env);
    }
}
