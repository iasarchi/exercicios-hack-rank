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
        List <Integer> listaB= new ArrayList<>(numeros);
            System.out.println("Digite a posição e o elemento: ");
            int index = scanner.nextInt();
            int numero = scanner.nextInt();
            listaB.add(index,numero);

        System.out.println("Digite a posição que deseja deletar: ");
        int delete = scanner.nextInt();
        listaB.remove(delete);
        for (Integer percorrer : listaB) {
            System.out.print(percorrer + " ");
        }
    }
}











