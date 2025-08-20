package br.com.devisdoagi.POO.Heranca.Exerc03;

public class TransferenciaBancaria extends Transacao {
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria (String id, double valor, String data, String contaOrigem, String contaDestino){
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void resumoTransferencia(){
        System.out.println("Transferência de R$ " +getValor()+  " de " +contaOrigem+ " para " +contaDestino+ " na data " +getData());
    }

}
