package cl.falabella.seguros.obtenerpropuestas.model.ws;

import cl.falabella.seguros.obtenerpropuestas.adapter.ClientePropuestasPolizasTransformer;
import cl.falabella.seguros.obtenerpropuestas.adapter.JsonAdapter;
import cl.falabella.seguros.obtenerpropuestas.adapter.PropuestasPolizasTransformer;
import cl.falabella.seguros.obtenerpropuestas.invoker.WSInvoker;
import cl.falabella.seguros.obtenerpropuestas.model.Constants.Constants;
import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaRequest;
import cl.falabella.seguros.obtenerpropuestas.model.entities.PolizaResponse;

import cl.falabella.seguros.obtenerpropuestas.model.util.Configurator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;



public class ProductoAplicarSeguroClienteBean implements ProductoAplicarSeguroClienteRemote,
                                                         ProductoAplicarSeguroClienteLocal {



    public ProductoAplicarSeguroClienteBean() {
    }


    public List<PolizaResponse> obtenerPropuestasPolizas(PolizaRequest polizaRequest) throws Exception {

        ClientePropuestasPolizasTransformer clienteTrans =
            new ClientePropuestasPolizasTransformer(new JsonAdapter<PolizaRequest>());
        PropuestasPolizasTransformer propuestasTrans =
            new PropuestasPolizasTransformer(new JsonAdapter<List<PolizaResponse>>());

        String jsonRequest = clienteTrans.transform(polizaRequest);

        List<PolizaResponse> listaPropuestas = new ArrayList<PolizaResponse>();


        try {
            
            String remoteUri = Configurator.getInstance().getPropertyValue(
                                                    new StringBuffer(Constants.ROOT).append(Constants.ENTITY)
                                                                    .append(Constants.PARAM).toString());
            
            WSInvoker invoker = new WSInvoker();
            
            String jsonResponse =
                invoker.processMessage(remoteUri, jsonRequest);

           
                    JSON jsonObject =  JSONSerializer.toJSON(jsonResponse);
                    
                    JSONArray jsonArray = JSONArray.fromObject( jsonObject );  
                                    
                    PolizaResponse childCommand = (PolizaResponse) JSONObject.toBean(jsonArray.getJSONObject(0),
                        PolizaResponse.class);
            
                    listaPropuestas.add(childCommand);
           
              
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }


        return listaPropuestas;

    }

}
