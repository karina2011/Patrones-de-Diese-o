package UTN;

import UTN.ABSTRACT_FACTORY.clases.Computer;
import UTN.ABSTRACT_FACTORY.clases.ComputerFactory;
import UTN.ABSTRACT_FACTORY.clases.PcFactory;
import UTN.ABSTRACT_FACTORY.clases.ServerFactory;
import UTN.BUILDER.*;
import UTN.DECORATOR.clases.AireAcondicionado;
import UTN.DECORATOR.clases.Auto;
import UTN.DECORATOR.clases.FiatUno;
import UTN.DECORATOR.clases.Mp3Player;
import UTN.DECORATOR.interfaces.IVendible;
import UTN.FACTORY_METHOD.clases.ConcreteCreator;
import UTN.FACTORY_METHOD.interfaces.IProduct;
import UTN.OBSERVER.Producto;
import UTN.OBSERVER.Supermercado;
import UTN.STRATEGY.clases.Context;
import UTN.STRATEGY.clases.StrategyA;
import UTN.STRATEGY.clases.StrategyB;
import UTN.STRATEGY.interfaces.IStrategy;
import UTN.TEMPLATE_METHOD.ClaseConcreta1;
import UTN.TEMPLATE_METHOD.ClaseConcreta2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------------------CREACIONALES---------------------------------");
        System.out.println( "*************************Abstract Factory:***************************************" );
        ComputerFactory oneComputer= new ComputerFactory();
        Computer pc = oneComputer.getComputer(new PcFactory("RAM12","HDD10","CPU5"));
        System.out.println(pc.toString());
        Computer server = oneComputer.getComputer(new ServerFactory("RAM20","HDD20","CPU25"));
        System.out.println(server.toString());
        System.out.println("********************FIN Abstract Factoy******************************************");
        System.out.println("*************************Factoy Method********************************************");
        IProduct producto =new ConcreteCreator().factoryMethod();
        producto.operacion();
        System.out.println("*********************FIN Factoy Method********************************************");
        System.out.println("*************************Builder********************************************");
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
        cocina.setPizzaBuilder( hawai_pizzabuilder );
        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
        System.out.println(pizza.toString());
        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();
        pizza=cocina.getPizza();
        System.out.println(pizza.toString());
        System.out.println("*********************FIN Builder********************************************");
        System.out.println("----------------------COMPORTAMINETO---------------------------------");
        System.out.println("*********************Template Method****************************************");
        ClaseConcreta1 cc1 = new ClaseConcreta1();
        ClaseConcreta2 cc2 = new ClaseConcreta2();
        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
        int num1 = cc1.obtener(3);
        System.out.println( "num1: " + num1 );
        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
        int num2 = cc2.obtener(50);
        System.out.println( "num2: " + num2 );
        System.out.println("*********************FIN Template Method********************************");
        System.out.println("*********************Strategy********************************");
        //Usamos la estrategia A
        IStrategy estrategia_inicial = new StrategyA();
        Context context = new Context(estrategia_inicial);
        context.some_method();
        //Decidimos usar la estrategia B
        IStrategy estrategia2 = new StrategyB();
        context.setStrategy(estrategia2);
        context.some_method();
        //Finalmente,usamos de nuevo la estrategia A
        context.setStrategy(estrategia_inicial);
        context.some_method();
        System.out.println("*********************FIN Strategy********************************");
        System.out.println("*********************Observer***************************************");
        Producto oneProduct=new Producto(20,30,"pure tomate");
        Supermercado chino=new Supermercado("chino");
        Supermercado toledo=new Supermercado("toledo");
        oneProduct.addObserver(chino);
        oneProduct.addObserver(toledo);
        oneProduct.cambiarPrecio(40);
        oneProduct.cambiarPrecio(50);
        System.out.println("*********************FIN Observer***************************************");
        System.out.println("*********************Decorator***************************************");
        IVendible auto= new FiatUno();
        auto= new Mp3Player(auto);
        auto= new AireAcondicionado(auto);
        System.out.println(auto.getDescripcion());
        System.out.println(auto.getPrecio());
        System.out.println("*********************FIN Decorator************************************");
    }
}
