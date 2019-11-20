package UTN.OBSERVER;


import java.util.Observable;
import java.util.Observer;

public class Supermercado implements Observer {
    private String nombre;
    public Supermercado(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Producto) {
            System.out.println ("Cambio el oprecio del producto: " +((Producto) o).getNombre()+"precio antiguo: "+((Producto) o).getPrecioAntiguo()+"precio actual: "+((Producto) o).getPrecioActual());
        }
    }
}
