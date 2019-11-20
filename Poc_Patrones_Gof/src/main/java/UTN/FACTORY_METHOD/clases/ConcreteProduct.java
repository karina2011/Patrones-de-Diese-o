package UTN.FACTORY_METHOD.clases;

import UTN.FACTORY_METHOD.interfaces.IProduct;

public class ConcreteProduct implements IProduct {
    public void operacion(){
        System.out.println("Una operación de este producto");
    }
}
