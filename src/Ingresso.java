public class Ingresso extends AbstractIngresso{
    public Ingresso(double valor) {
        super(valor);
    }

    @Override
    public double calcularPreco() {
        return getValor();
    }
    // Sobrecarga do método para aplicar um desconto
    @Override
    public double calcularPreco(double desconto) {
        return getValor() * (1 - desconto);
    }
    @Override
    public double calcularPrecomeia() {
        return getValor() / 2;
    }

}
