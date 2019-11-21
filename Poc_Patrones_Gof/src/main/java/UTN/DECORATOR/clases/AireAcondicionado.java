package UTN.DECORATOR.clases;

import UTN.DECORATOR.interfaces.IVendible;

public class AireAcondicionado extends AutoDecorador {
    public AireAcondicionado(IVendible vendible){
        super(vendible);
    }
    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion()+" aire acondicionado";
    }

    @Override
    public Integer getPrecio() {
        return getVendible().getPrecio()+2000;
    }
}
