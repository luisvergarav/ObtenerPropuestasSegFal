package cl.falabella.seguros.obtenerpropuestas.adapter;




public interface MediaAdapter<T> {
    
    public String transform(T dto);
    public T transform(String dto);
     
}
