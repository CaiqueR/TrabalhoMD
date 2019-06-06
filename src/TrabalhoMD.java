import java.util.ArrayList;
import java.util.List;

class TrabalhoMD {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.letraA();

    }
}

class Loja {
    private List<Integer> clientesCartao = new ArrayList<>();
    private List<Integer> clientesCheque = new ArrayList<>();
    private List<Integer> clientesDinheiro = new ArrayList<>();
    private List<Integer> Total = new ArrayList<>();

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
        for (int item : clientesCartao)
            if (clientesCheque.contains(item) && clientesDinheiro.contains(item))
                Total.add(item);

        System.out.println("Total de clientes que pagam em dinheiro, cheque e cartão: " + Total.size());
    }
}