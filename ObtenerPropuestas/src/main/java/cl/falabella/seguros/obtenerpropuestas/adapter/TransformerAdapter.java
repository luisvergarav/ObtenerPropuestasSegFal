package cl.falabella.seguros.obtenerpropuestas.adapter;



public interface TransformerAdapter<T> {
    public String transform(T dto);
    public T transform(String dto);
}
