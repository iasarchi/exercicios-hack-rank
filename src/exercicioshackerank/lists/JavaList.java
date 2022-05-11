package exercicioshackerank.lists;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Quantidade de elementos: ");
        int n = scanner.nextInt();
        System.out.println("Digite os elementos: ");
         List<Integer> numeros = new ArrayList<>(Arrays.asList());
        while (numeros.size() < n) {
            int l = scanner.nextInt();
            numeros.add(l);
        }
        System.out.println("Digite o elemento e a posiçao a ser adicionado: ");
        int numeroAdicionado = scanner.nextInt();
        int index = scanner.nextInt();
        if (numeros.size() > n)
        numeros.add(numeroAdicionado,index);

        System.out.println("Digite o elemento a ser deletado: ");
        int delete = scanner.nextInt();
        numeros.remove(delete);
        for (Integer percorrer : numeros) {
            System.out.print(percorrer + " ");
        }
    }
}











