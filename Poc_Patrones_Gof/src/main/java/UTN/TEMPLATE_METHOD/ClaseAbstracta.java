package UTN.TEMPLATE_METHOD;

public abstract class ClaseAbstracta {
    public int obtener( int num )
    {
        this.mensaje();
        int numero = this.multiplicar( num );
        numero = this.sumar( numero );
        return numero;
    }

    public void mensaje()
    {
        System.out.println("Vamos a realizar las operaciones...");
    }
    public abstract int multiplicar( int num );
    public abstract int sumar(  int num  );
}
