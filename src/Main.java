import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Ana Souza", "ABC-1234");
        iniciante.registrarCorrida(40.00);
        iniciante.registrarCorrida(35.50);
        iniciante.registrarCorrida(52.00);

        Motorista premium = new MotoristaPremium("Bruno Lima", "DEF-5678");
        premium.registrarCorrida(80.00);
        premium.registrarCorrida(65.00);
        premium.registrarCorrida(92.50);
        premium.registrarCorrida(48.00);
        premium.registrarCorrida(70.00);

        Motorista frotista = new MotoristaParceiroFrotista("Carla Mendes", "GHI-9012");
        frotista.registrarCorrida(250.00);
        frotista.registrarCorrida(310.00);
        frotista.registrarCorrida(275.00);
        frotista.registrarCorrida(340.00);

        imprimirExtrato(iniciante);
        imprimirExtrato(premium);
        imprimirExtrato(frotista);
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("========================================");
        System.out.println("Extrato do motorista");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlaca());
        System.out.println("Corridas no mês: " + motorista.getQuantidadeCorridas());
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Valor bruto: R$ %.2f%n", motorista.getValorBruto());
        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Valor líquido a receber: R$ %.2f%n",
                motorista.calcularPagamentoLiquido()
        );
    }
}
