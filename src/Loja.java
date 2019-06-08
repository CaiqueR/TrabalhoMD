import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Loja {
    //Criando lista de clientes da loja por tipo de pagamento
    private List<String> clientesCartao = new ArrayList<>();
    private List<String> clientesCheque = new ArrayList<>();
    private List<String> clientesDinheiro = new ArrayList<>();
    static int total=0;

    Loja() {
        //Le o arquivo.txt na raiz e preenche as listas de cliente de acordo com o txt
        LerArquivo.ler(clientesCartao, clientesCheque, clientesDinheiro);
    }

    public void letraA() {
        List<String> Total = clientesDinheiro.stream()
                .filter(x -> !clientesCartao.contains(x) && !clientesCheque.contains(x))
                .collect(Collectors.toList());

        System.out.println("Número de clientes que pagam somente em dinheiro: " + Total.size());
        total+=Total.size();

        Total.clear();
        Total = clientesCheque.stream()
                .filter(x -> !clientesCartao.contains(x) && !clientesDinheiro.contains(x))
                .collect(Collectors.toList());

        System.out.println("Número de clientes que pagam somente em cheque: " + Total.size());
        total+=Total.size();

        Total.clear();
        Total = clientesCartao.stream()
                .filter(x -> !clientesCheque.contains(x) && !clientesDinheiro.contains(x))
                .collect(Collectors.toList());
        total+=Total.size();

        System.out.println("Número de clientes que pagam somente em cartão: " + Total.size());
    }

    public void letraB() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesDinheiro)
            if (clientesCheque.contains(cliente) && !clientesCartao.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e com cheque: " + Total.size());
        total-=Total.size();
    }

    public void letraC() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesDinheiro)
            if (clientesCartao.contains(cliente) && !clientesCheque.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em dinheiro e cartão de crédito: " + Total.size());
        total-=Total.size();
    }

    public void letraD() {
        List<String> Total = new ArrayList<>();
        for (String cliente : clientesCartao)
            if (clientesCheque.contains(cliente) && !clientesDinheiro.contains(cliente))
                Total.add(cliente);

        System.out.println("Número de clientes que pagam em cartão de crédito e cheque: " + Total.size());
        total-=Total.size();
    }

    public void letraE() {
        List<String> Total = clientesCartao.stream()
                .filter(x -> clientesCartao.contains(x) && clientesCheque.contains(x) && clientesDinheiro.contains(x))
                .collect(Collectors.toList());

        System.out.println("Número de clientes que pagam em dinheiro, cheque e cartão: " + Total.size());
        total+=Total.size();
    }

    public void letraF() {
        List<String> Total = new ArrayList<>();

        for (String x : clientesDinheiro) {
            if(!Total.contains(x))
                Total.add(x);
        }

        for (String x : clientesCheque) {
            if(!Total.contains(x))
                Total.add(x);
        }

        for (String x : clientesCartao) {
            if(!Total.contains(x))
                Total.add(x);
        }



        System.out.println("Número total de clientes: " + Total.size());
        //System.out.println(total);
    }
}