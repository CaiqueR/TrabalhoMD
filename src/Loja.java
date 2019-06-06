import java.util.ArrayList;
import java.util.List;

class Loja {
    //Criando lista de clientes da loja por tipo de pagamento
    private List<String> clientesCartao = new ArrayList<>();
    private List<String> clientesCheque = new ArrayList<>();
    private List<String> clientesDinheiro = new ArrayList<>();

    Loja() {
        //Le o arquivo.txt na raiz e preenche as listas de cliente de acordo com o txt
        LerArquivo.ler(clientesCartao, clientesCheque, clientesDinheiro);
    }

    public void letraA() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesCartao)
            if (clientesCartao.contains(cliente) && clientesCheque.contains(cliente) && clientesDinheiro.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro, cheque e cartão: " + Total.size());
    }

    public void letraB() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesDinheiro)
            if (clientesDinheiro.contains(cliente) && clientesCheque.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e com cheque: " + Total.size());
    }

    public void letraC() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesDinheiro)
            if (clientesDinheiro.contains(cliente) && clientesCartao.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e cartão de crédito: " + Total.size());
    }

    public void letraD() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesCartao)
            if (clientesCartao.contains(cliente) && clientesCheque.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em cartão de crédito e cheque: " + Total.size());
    }

}