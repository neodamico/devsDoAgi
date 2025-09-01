package br.com.devisdoagi.Hackathon_bancoDigital_Colecoes;

import java.util.*;

public class BancoDigitalHackaton {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1: cadastrarCliente(sc); break;
                case 2: cadastrarConta(sc); break;
                case 3: deposito(sc); break;
                case 4: saque(sc); break;
                case 5: transferencia(sc); break;
                case 6: consultarSaldo(sc); break;
                case 7: extrato(sc); break;
                case 8: listarClientes(); break;
                case 9: rodando = false; break;
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    // ==================== MÉTODOS (a serem implementados) =

    private static void cadastrarCliente(Scanner sc) {
        // Dica: pedir nome e CPF, criar objeto Cliente
        // Adicionar no Set de clientes
        // Garantir que CPF não esteja duplicado (Set já ajuda nisso)

        System.out.println("Nome:");
        String nome = sc.nextLine();
        System.out.println("CPF:");
        String cpf = sc.nextLine();
        Cliente c = new Cliente(nome, cpf);
        if (clientes.add(c)) System.out.println("Cliente cadastrado!");
        else System.out.println("Cliente já existe!");
    }

    private static void cadastrarConta(Scanner sc) {
        // Dica: solicitar CPF do cliente
        // Verificar se cliente existe no Set
        // Criar Conta e adicionar no Map de contas usando numeroConta como chave

        System.out.println("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente c : clientes){
            if(c.getCpf().equals(cpf)){
                clienteEncontrado = c;
                break;
            }
        }

        if(clienteEncontrado != null){
            Conta conta = new Conta(numeroConta++, clienteEncontrado);
            contas.put(conta.getNumero(), conta);
            System.out.println("Conta criada. Número: " +conta.getNumero());

        }else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void deposito(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar se conta existe
        // Adicionar valor ao saldo da conta
        // Registrar transação no extrato da conta

        try {
            System.out.print("Número da conta: "); int num = Integer.parseInt(sc.nextLine());
            System.out.print("Valor: "); double valor = Double.parseDouble(sc.nextLine());
            Conta conta = contas.get(num);
            if (conta != null) conta.depositar(valor);
            else System.out.println("Conta não encontrada!");
        } catch (NumberFormatException e) { System.out.println("Entrada inválida!"); }

    }

    private static void saque(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar saldo suficiente
        // Subtrair valor do saldo
        // Registrar transação no extrato da conta

        try {
            System.out.print("Número da conta: "); int num = Integer.parseInt(sc.nextLine());
            System.out.print("Valor: "); double valor = Double.parseDouble(sc.nextLine());
            Conta conta = contas.get(num);
            if (conta != null) conta.sacar(valor);
            else System.out.println("Conta não encontrada!");
        } catch (NumberFormatException e) { System.out.println("Entrada inválida!"); }

    }

    private static void transferencia(Scanner sc) {
        // Dica: solicitar conta origem, conta destino e valor
        // Verificar saldo na conta origem
        // Atualizar saldos de ambas as contas
        // Registrar transação em ambas contas

        try {
            System.out.print("Conta origem: "); int origemNum = Integer.parseInt(sc.nextLine());
            System.out.print("Conta destino: "); int destinoNum = Integer.parseInt(sc.nextLine());
            System.out.print("Valor: "); double valor = Double.parseDouble(sc.nextLine());
            Conta origem = contas.get(origemNum);
            Conta destino = contas.get(destinoNum);
            if (origem != null && destino != null) origem.transferir(valor, destino);
            else System.out.println("Conta origem ou destino não encontrada!");
        } catch (NumberFormatException e) { System.out.println("Entrada inválida!"); }

    }

    private static void consultarSaldo(Scanner sc) {
        // Dica: solicitar número da conta
        // Exibir saldo atual

        try {
            System.out.print("Número da conta: "); int num = Integer.parseInt(sc.nextLine());
            Conta conta = contas.get(num);
            if (conta != null) System.out.println("Saldo: " + conta.getSaldo());
            else System.out.println("Conta não encontrada!");
        } catch (NumberFormatException e) { System.out.println("Entrada inválida!"); }

    }

    private static void extrato(Scanner sc) {

        // Dica: solicitar número da conta
        // Listar todas as transações registradas na conta

        try {
            System.out.print("Número da conta: "); int num = Integer.parseInt(sc.nextLine());
            Conta conta = contas.get(num);
            if (conta != null) conta.mostrarExtrato();
            else System.out.println("Conta não encontrada!");
        } catch (NumberFormatException e) { System.out.println("Entrada inválida!"); }

    }

    private static void listarClientes() {
        // Dica: percorrer Set de clientes e exibir informações
        System.out.println("=== CLIENTES ===");
        for (Cliente c : clientes) System.out.println(c);

    }

}
