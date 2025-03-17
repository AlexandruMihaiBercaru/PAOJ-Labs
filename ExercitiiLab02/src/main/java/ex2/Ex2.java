package ex2;
import java.util.Arrays;
import java.util.Scanner;

/*
2. Implementati o aplicatie Java in care:
a) creati 2 tablouri unidimensionale de lungimi diferite, cu cate cel putin 5 elemente intregi.
b) implementati o metoda de sortare in ordine crescatoare a elementelor fiecarui tablou creat anterior.
Nota: se va folosi o implementare proprie, nu pe cea din clasa Arrays.
c) creati si afisati la consola un al treilea tablou in care veti insera in ordine crescatoare toate elementele din primele 2 tablouri.
Pentru eficienta si complexitate de timp liniara, utilizati o tehnica de implementare cu 2 pointeri (cate unul pt elementele fiecarui tablou initial).
exemplu:
   Array1 initial: [1, 7, 4, 3, 9, 1]
   Array1 sortat crescator: [1, 1, 3, 4, 7, 9]
   Array2 initial: [6, 4, 2, 8]
   Array2 sortat crescator: [2, 4, 6, 8]
   Output: [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]
 */

public class Ex2 {
    public static void main(String[] args) {

        int[] v1, v2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dimensiunea primului tablou: ");
        int n1 = scanner.nextInt();
        while(n1 < 5){
            System.out.println("Dimensiunea minima este 5 elemente, mai incercati o data...");
            System.out.println("Dimensiunea primului tablou: ");
            n1 = scanner.nextInt();
        }

        v1 = new int[n1];
        System.out.println("Introduceti " + n1 + " numere: ");
        for(int i = 0; i < v1.length; i++){
            v1[i] = scanner.nextInt();
        }

        System.out.println("Dimensiunea celui de-al doilea tablou: ");
        int n2 = scanner.nextInt();
        while(n2 < 5 || n2 == n1){
            System.out.println("Lungimea trebuie sa fie minim 5 si diferita de lungimea celuilalt tablou...");
            System.out.println("Dimensiunea celui de-al doilea tablou: ");
            n2 = scanner.nextInt();
        }

        v2 = new int[n2];
        System.out.println("Introduceti " + n2 + " numere: ");
        for(int i = 0; i < v2.length; i++){
            v2[i] = scanner.nextInt();
        }

        System.out.println("Array 1 initial: " + Arrays.toString(v1));
        mergeSort(v1, 0, n1-1);
        System.out.println("Array 1 sortat: " + Arrays.toString(v1));
        System.out.println("Array 2 initial: " + Arrays.toString(v2));
        mergeSort(v2, 0, n2-1);
        System.out.println("Array 2 sortat: " + Arrays.toString(v2));

        int[] mergedArr = new int[n1+n2];
        for(int i = 0; i < n1; i++){
            mergedArr[i] = v1[i];
        }
        for(int i = 0; i < n2; i++){
            mergedArr[i+n1] = v2[i];
        }
        merge(mergedArr, 0, n1-1, n1+n2-1);

        System.out.println("Dupa interclasare: " + Arrays.toString(mergedArr));
    }

    // interclasarea a doi vectori (folosita pentru afisarea de la final + etapa de "merge" din mergeSort)
    private static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; i++;
            }
            else {
                arr[k] = R[j]; j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i]; i++; k++;
        }

        while (j < n2) {
            arr[k] = R[j]; j++; k++;
        }
    }

    // sortarea prin interclasare
    private static void mergeSort(int[] arr, int l, int r)
    {
        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}
