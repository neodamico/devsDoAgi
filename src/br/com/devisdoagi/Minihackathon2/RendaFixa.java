package br.com.devisdoagi.Minihackathon2;

public class RendaFixa extends Investimento {

    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return getValorInicial() * 1.05;
    }
}
