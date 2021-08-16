import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double comprimentoDaPista, consumoDoCombustivelKm;
        int totalDeVoltas, numeroDeReabastecimentos;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o comprimento da pista: ");
        comprimentoDaPista = ler.nextDouble();

        System.out.println("Informe o total de voltas: ");
        totalDeVoltas = ler.nextInt();

        System.out.println("Informe o número de reabastecimentos: ");
        numeroDeReabastecimentos = ler.nextInt();

        System.out.println("Informe o consumo do combustível em km por litro: ");
        consumoDoCombustivelKm = ler.nextDouble();

        System.out.println("Calculando o número mínimo de litros necessários para percorrer até o primeiro reabastecimento...");

        double numeroMinimoLitros = calculaNumeroMinimoLitrosAtePrimeiroReabastecimento(
                comprimentoDaPista,
                totalDeVoltas,
                numeroDeReabastecimentos,
                consumoDoCombustivelKm
        );

        System.out.println("O resultado é: " + numeroMinimoLitros + " litros");
    }

    private static double calculaNumeroMinimoLitrosAtePrimeiroReabastecimento(
            double comprimentoDaPista,
            int totalDeVoltas,
            int numeroDeReabastecimentos,
            double consumoDoCombustivelKm) {

        //comprimento = 100km
        //voltas = 10
        //n abastecimento = 5
        //10km / litro

        double comprimentoTotal = comprimentoDaPista * totalDeVoltas;
        //100 * 10 = 1000km
        double litrosNecessarios = comprimentoTotal / consumoDoCombustivelKm;
        //100L
        double resultado = litrosNecessarios / numeroDeReabastecimentos;
        //100 / 5
        //20
        return resultado;
    }
}
