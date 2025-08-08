package exercicios;

public class CalculadoraErrada {

	public static void main(String[] args) {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: divisão por zero.");
                operacaoValida = false;
            }
        } else {
            System.out.println("Operação inválida.");
            operacaoValida = false;
        }

        
        if (operacaoValida) {
            double erroPorcentagem = (rand.nextDouble() * 0.02) - 0.01; // entre -1% e +1%
            double resultadoComErro = resultado + (resultado * erroPorcentagem);

            System.out.printf("Resultado com erro mágico: %.2f%n", resultadoComErro);
        }

        sc.close();
    }
}
