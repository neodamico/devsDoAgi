package br.com.devisdoagi.Minihackathon2;

public class RendaVariavel extends Investimento {
    public RendaVariavel (double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return getValorInicial() * 1.10;
    }
}
