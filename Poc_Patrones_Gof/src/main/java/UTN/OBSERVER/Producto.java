package UTN.OBSERVER;

import java.util.Observable;

public class Producto extends Observable {
    private Integer precioActual;
    private Integer precioAntiguo;
    private String nombre;
    public Producto(Integer precioAntiguo,Integer precioActual,String nombre){
        this.precioActual=precioActual;
        this.precioAntiguo=precioAntiguo;
        this.nombre=nombre;
    }
    public void cambiarPrecio(Integer nuevo){
        precioAntiguo=precioActual;
        precioActual=nuevo;
        setChanged();
        notifyObservers();
    }
    public Integer getPrecioActual(){
        return precioActual;
    }
    public Integer getPrecioAntiguo(){
        return precioAntiguo;
    }
    public String getNombre(){
        return nombre;
    }
}
