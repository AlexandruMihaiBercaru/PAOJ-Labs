package ex1;
import java.util.Arrays;
import java.util.Scanner;

/*
1. Implementati o aplicatie Java in care:
a) cititi de la tastatura un numar intreg n cuprins intre [0, 5].
Nota: interactiunea cu userul va continua atat timp cat acesta nu a furnizat o valoare valida.
b) creati un tablou unidimensional de lungime n, ale carui elemente intregi le cititi de la tastatura.
c) implementati o metoda care realizeaza inversarea ordinii initiale a elementelor tabloului si afisarea lui in consola.
exemplu: Input: [2, 4, 1, 5, 3]
         Output: [3, 5, 1, 4, 2]
*/

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 0 si 5:");
        int n = scanner.nextInt();
        while (!(0<= n && n <=5)){
            System.out.println("Numarul introdus nu respecta conditia, mai incercati o data...");
            System.out.println("Introduceti un numar intre 0 si 5:");
            n = scanner.nextInt();
        }

        int[] v = new int[n];
        System.out.println("Introduceti " + n + " numere: ");
        for(int i = 0; i < v.length; i++){
            v[i] = scanner.nextInt();
        }

        System.out.println("Inainte de modificare: " +  Arrays.toString(v));
        rev(v);
        System.out.println("Dupa modificare:" + Arrays.toString(v));
    }
    static void rev(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }
    }
}
