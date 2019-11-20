package UTN.STRATEGY.clases;

import UTN.STRATEGY.interfaces.IStrategy;

public class Context {
    private IStrategy c;

    public Context( IStrategy c )
    {
        this.c = c;
    }

    public void setStrategy(IStrategy c) {
        this.c = c;
    }

    //Método de estrategia 'c'
    public void some_method()
    {
        c.behaviour();
    }
}
