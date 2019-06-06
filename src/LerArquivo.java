import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class LerArquivo {
    LerArquivo() {
    }

    public static void ler(List<String> clientesCartao, List<String> clientesCheque, List<String> clientesDinheiro) {
        //Le os arquivos do texto separado por virgula
        try {
            FileReader arq = new FileReader("arquivo.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            int op = 1;
            String linha = lerArq.readLine();
            while (linha != null) {
                String[] dados = linha.split(",");
                //Variavel auxiliar pq o primeiro elemento ficaria cliente cheque:Joao
                //Como quero só o Joao, fiz mais outro split para separar por : e pegar o Joao
                String[] aux = dados[0].split(":");
                dados[0] = aux[1];
                linha = lerArq.readLine();
                switch (op) {
                    case 1:
                        for (String cliente : dados)
                            clientesCartao.add(cliente);
                        break;
                    case 2:
                        for (String cliente : dados)
                            clientesCheque.add(cliente);
                        break;
                    case 3:
                        for (String cliente : dados)
                            clientesDinheiro.add(cliente);
                        break;
                    default:
                        System.out.println("Algo deu errado.");
                }
                op++;
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
}