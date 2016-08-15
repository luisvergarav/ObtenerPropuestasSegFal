package cl.falabella.seguros.obtenerpropuestas.invoker;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;





public class WSInvoker {
    public WSInvoker() {
        super();
    }
    
    public String processMessage(String uri,String sourceMessage) throws Exception {
                String xslPath = null;
                String url = uri;
                String wsPropValue = null;
                //ClientConfig config = new ClientConfig();
                Client client = ClientBuilder.newClient(/*(Configuration)config*/);
                
                    try {
                        
                      
                        
                                //Se lee el recurso RestWS
                                wsPropValue = url;
                                   
                                           
                                   
                                                client = ClientBuilder.newClient();
                          
                          

                                               WebTarget vtexTarget = client.target(wsPropValue);
                                                
                                                                                                  
                         
                                                    


                                               Invocation vtexInvocation = vtexTarget.request().buildPost(Entity.entity(sourceMessage,MediaType.APPLICATION_JSON));

                                               Response response = vtexInvocation.invoke();

                        
                                              
                                               if (response.getStatus() != 200) {
                                                                   throw new Exception("Failed : HTTP error code : "
                                                                          + response.getStatus());
                                                               }

                                                

                                            
                                                String wsResponse = response.readEntity(String.class);
                        
                                                //log.debug("[[DEBUG]] --> Output from Server .... \n");
                                                //log.debug("[[DEBUG]] -->"  + wsResponse);                        
                                                
                                                //if (!wsResponse.contains("OK")) throw new Exception(wsResponse);

                                                client.close();    
                                                return wsResponse;
                                  
                                          }  catch (Exception e) {
                                  
                                                 throw e;
                                  
                                          } finally{
                                              client.close();
                                          }                                  
            }
}
