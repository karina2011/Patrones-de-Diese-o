package UTN.DECORATOR.clases;


import UTN.DECORATOR.interfaces.IVendible;

public class Mp3Player extends AutoDecorador {
    public Mp3Player (IVendible vendible){
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion()+" mp3 player";
    }

    @Override
    public Integer getPrecio() {
        return getVendible().getPrecio()+2000;
    }
}
