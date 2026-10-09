public class MotoristaIniciante extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.25;
    private static final int LIMITE_CORRIDAS_PARA_INATIVIDADE = 5;
    private static final double TAXA_INATIVIDADE = 50.00;

    public MotoristaIniciante(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBruto() * (1 - TAXA_PLATAFORMA);
        if (getQuantidadeCorridas() < LIMITE_CORRIDAS_PARA_INATIVIDADE) {
            pagamentoLiquido -= TAXA_INATIVIDADE;
        }
        return pagamentoLiquido;
    }
}
