import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int[] notas = {200, 100, 50, 20, 10, 5, 2};
    static int[] moedas = {100, 50, 25, 10, 5, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor deseja sacar?");
        Float valorSaque = sc.nextFloat();

        int valorNotas = valorSaque.intValue();
        int valorCentavos = (int) ((valorSaque - valorNotas) * 100);

        if (temMoedaUm(valorNotas)) {
            valorCentavos += 100;
        }

        System.out.println("\nQuantidade a ser sacada\n");
        List<Integer> resultadoNotas = quantidadeTroco(valorNotas, notas);
        devolveQuantidade(resultadoNotas, " nota(s) de ", notas);

        List<Integer> resultadoMoedas = quantidadeTroco(valorCentavos, moedas);
        devolveQuantidade(resultadoMoedas, " moeda(s) de ", moedas);
    }

    //Verifica a lista com a quantidade de notas/moedas necessárias e faz o print no formato solicitado
    public static void devolveQuantidade(List<Integer> listaverificacao, String texto, int[] lista) {
        for (int posilista = 0; posilista < listaverificacao.size(); posilista++) {
            if (lista == moedas && listaverificacao.get(posilista) > 0) {
                System.out.printf(listaverificacao.get(posilista) + texto + lista[posilista] / 100.0 + "\n");
            } else if (listaverificacao.get(posilista) > 0) {
                System.out.printf(listaverificacao.get(posilista) + texto + lista[posilista] + "\n");
            }
        }
    }


    //Vai dividindo o valor total moedas/notas pelas existentes no caixa, ao final,
    //retorna a quantidade necessária de cada moedas/notas.
    public static List<Integer> quantidadeTroco(int valor, int[] notas) {
        List<Integer> resultado = new ArrayList<>();

        for (int nota : notas) {
            int qtd = valor / nota;
            resultado.add(qtd);
            valor %= nota;
        }
        return resultado;
    }

    //Verifica se o saque necessita de moeda de 1 real.
    public static boolean temMoedaUm(int quantidade) {
        for (int nota : notas) {
            int qtd = quantidade / nota;
            quantidade %= nota;
        }
        if (quantidade == 1) {
            return true;
        } else {
            return false;
        }
    }
}