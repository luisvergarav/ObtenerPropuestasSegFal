package cl.falabella.seguros.obtenerpropuestas.model.util;

import cl.falabella.seguros.obtenerpropuestas.model.Constants.Constants;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configurator {
    
    private static Configurator instance = null;
    
    private Properties properties = null;
    
    private Configurator() throws Exception{
        InputStream inputStream = null;
        
        try{
            
            inputStream = new FileInputStream(Constants.RESOURCES_PATH + 
                                            Constants.RESOURCE_PROPERTIES_DIR + 
                                            Constants.RESOURCE_PROPERTIES_FILE);
            properties = new Properties();
            properties.load(inputStream);
            
        } catch(Exception e){
        	throw new Exception("Error en properties, verificar configuracion " + e.getLocalizedMessage());
        }
    }
    
    public static Configurator getInstance() throws Exception{
        if(instance == null){
            instance = new Configurator();
        }
        return instance;
    }
    public String getPropertyValue(String key) throws Exception {
        if (properties != null) {
            if (properties.containsKey(key)) {
                String valor = properties.getProperty(key, null);
                if(valor != null){
                    return valor;
                }
            }
        }
        throw new Exception("Error en properties, verificar configuracion - " + key);
    }

}

