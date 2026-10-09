public abstract class Motorista {
    private final String nome;
    private final String placa;
    private int quantidadeCorridas;
    private double valorBruto;

    protected Motorista(String nome, String placa) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do motorista é obrigatório.");
        }
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa do veículo é obrigatória.");
        }

        this.nome = nome;
        this.placa = placa;
    }

    public void registrarCorrida(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor da corrida deve ser maior que zero.");
        }

        quantidadeCorridas++;
        valorBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBruto() {
        return valorBruto;
    }
}
