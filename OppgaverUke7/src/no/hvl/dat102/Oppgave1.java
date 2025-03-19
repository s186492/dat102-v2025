package no.hvl.dat102;

import java.util.Random;

public class Oppgave1 {
    public static void insertionSort(int[] a) {
        int n = a.length;
        
        // Flytter minste element fremst
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        swap(a, minIndex, 0);
        
        // Sortering med innsetting av to elementer om gangen
        for (int i = 2; i < n; i += 2) {
            int smallest = a[i - 1];
            int largest = a[i];
            
            if (smallest > largest) {
                int temp = smallest;
                smallest = largest;
                largest = temp;
            }
            
            int j = i - 2;
            while (j >= 0 && a[j] > largest) {
                a[j + 2] = a[j];
                j -= 1;
            }
            
            a[j + 2] = largest;
            
            while (j >= 0 && a[j] > smallest) {
                a[j + 1] = a[j];
                j -= 1;
            }
            
            a[j + 1] = smallest;
        }
    }
    
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String[] args) {
        int n = 1000000; // Antall elementer
        int[] array = new int[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(n);
        }
        
        long startTime = System.currentTimeMillis();
        insertionSort(array);
        long endTime = System.currentTimeMillis();
        
        System.out.println("Sorteringstid: " + (endTime - startTime) / 1000.0 + " sekunder");
    }
}