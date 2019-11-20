package UTN.FACTORY_METHOD.clases;

import UTN.FACTORY_METHOD.interfaces.IProduct;

public class ConcreteCreator extends Creator {
    public IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
