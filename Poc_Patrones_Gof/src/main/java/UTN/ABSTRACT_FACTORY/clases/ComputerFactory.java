package UTN.ABSTRACT_FACTORY.clases;

import UTN.ABSTRACT_FACTORY.interfases.IComputerAbstractFactory;

public class ComputerFactory {
    public static Computer getComputer(IComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
