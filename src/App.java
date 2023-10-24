public class App {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa("Alice", 25);
            Ingresso ingresso;

            if (pessoa.getIdade() < 18) {
                throw new MenorIdadeException("Menores de idade não podem comprar ingresso.");
            } else {
                ingresso = new Ingresso(50.0);
            }

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Preço do Ingresso (Inteira): " + ingresso.calcularPreco());

            // Utilizando a sobrecarga de método para aplicar um desconto
            double desconto = 0.1; // 10% de desconto
            System.out.println("Preço do Ingresso com Desconto: " + ingresso.calcularPreco(desconto));
        } catch (MenorIdadeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
