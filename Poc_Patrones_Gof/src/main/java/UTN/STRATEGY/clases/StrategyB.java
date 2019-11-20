package UTN.STRATEGY.clases;

import UTN.STRATEGY.interfaces.IStrategy;

public class StrategyB implements IStrategy {
    @Override
    public void behaviour() {
        System.out.println("Estrategia B");
    }
}
