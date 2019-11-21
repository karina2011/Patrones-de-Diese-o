package UTN.DECORATOR.clases;

import UTN.DECORATOR.interfaces.IVendible;

public abstract class AutoDecorador implements IVendible {
    private IVendible vendible;
    public AutoDecorador(IVendible vendible){
        setVendible(vendible);
    }

    public void setVendible(IVendible vendible) {
        this.vendible = vendible;
    }
    public IVendible getVendible(){
        return this.vendible;
    }
}
