package cl.falabella.seguros.obtenerpropuestas.adapter;


import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class JsonAdapter<T> implements MediaAdapter<T> {
    public JsonAdapter() {
        super();
    }

    public T transform(String dto) {
        
        JSONObject jsonObject =  (JSONObject) JSONSerializer.toJSON(dto);        
        T javaObject = (T)JSONSerializer.toJava(jsonObject);
            
        return javaObject;
    }

    public String transform(T dto) {
        JSONObject jsonObject = (JSONObject)JSONSerializer.toJSON(dto);
        String stringObject = jsonObject.toString();
        return stringObject;
    }
}
