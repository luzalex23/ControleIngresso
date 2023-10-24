 abstract class AbstractIngresso implements ICalculaIngresso{
        private double valor;

    public AbstractIngresso(double valor) {
    this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    @Override
    public abstract double calcularPreco();

    @Override
    public abstract double calcularPrecomeia();
    // Sobrecarga de método
    public abstract double calcularPreco(double desconto);
}

