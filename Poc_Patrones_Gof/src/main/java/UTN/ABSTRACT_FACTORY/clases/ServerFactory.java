package UTN.ABSTRACT_FACTORY.clases;

import UTN.ABSTRACT_FACTORY.interfases.IComputerAbstractFactory;

public class ServerFactory implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
