import java.util.ArrayList;
import java.util.List;

class TrabalhoMD {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.letraA();
        loja.letraB();
        loja.letraC();
        loja.letraD();

    }
}

class Loja {
    private List<Integer> clientesCartao = new ArrayList<>();
    private List<Integer> clientesCheque = new ArrayList<>();
    private List<Integer> clientesDinheiro = new ArrayList<>();

    Loja() {

        //Clientes ficticio
        clientesCartao.add(1434);
        clientesCartao.add(1235);
        clientesCartao.add(1239);

        clientesCheque.add(1238);
        clientesCheque.add(1434);
        clientesCheque.add(1239);

        clientesDinheiro.add(1238);
        clientesDinheiro.add(1584);
        clientesDinheiro.add(1239);
    }

    public void letraA() {
        List<Integer> Total = new ArrayList<>();
        for (int cliente : clientesCartao)
            if (clientesCartao.contains(cliente) && clientesCheque.contains(cliente) && clientesDinheiro.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro, cheque e cartão: " + Total.size());
    }

    public void letraB() {
        List<Integer> Total = new ArrayList<>();
        for (int cliente : clientesDinheiro)
            if (clientesDinheiro.contains(cliente) && clientesCheque.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e com cheque: " + Total.size());
    }

    public void letraC() {
        List<Integer> Total = new ArrayList<>();
        for (int cliente : clientesDinheiro)
            if (clientesDinheiro.contains(cliente) && clientesCartao.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e cartão de crédito: " + Total.size());
    }

    public void letraD() {
        List<Integer> Total = new ArrayList<>();
        for (int cliente : clientesCartao)
            if (clientesCartao.contains(cliente) && clientesCheque.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em cartão de crédito e cheque: " + Total.size());
    }
    
}