package UTN.ABSTRACT_FACTORY.clases;

import UTN.ABSTRACT_FACTORY.interfases.IComputerAbstractFactory;

public class PcFactory implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PcFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer(){
        return new Pc(ram,hdd,cpu);
    }
}
