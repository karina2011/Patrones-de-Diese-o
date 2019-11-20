package UTN.TEMPLATE_METHOD;

public class ClaseConcreta1 extends ClaseAbstracta {
    @Override
    public int multiplicar(int num) {
        return num * 100;
    }
    @Override
    public int sumar(int num) {
        return num + 10;
    }
}
