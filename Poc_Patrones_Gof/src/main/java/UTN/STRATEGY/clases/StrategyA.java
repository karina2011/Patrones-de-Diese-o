package UTN.STRATEGY.clases;

import UTN.STRATEGY.interfaces.IStrategy;

public class StrategyA implements IStrategy {
    @Override
    public void behaviour() {
        System.out.println("Estrategia A");
    }
}
