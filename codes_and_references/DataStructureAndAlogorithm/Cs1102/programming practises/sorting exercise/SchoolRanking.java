import java.util.*;
 
public class SchoolRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of students
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
 
        //apply the appropriate sorting algorithm
        SortingAlgorithm sorter = null;
        int s = sc.nextInt(); //sorting method to use
        switch (s) {
            case 1: sorter = new InsertionSort();
            case 2: sorter = new MergeSort();
            case 3: sorter = new QuickSort();
        }
        sorter.sort(scores);
 
        int q = sc.nextInt(); //number of queries
        while (q-- > 0) {
            int score = sc.nextInt();
            int pos = binarySearch(scores, score);
            if (pos < 0) {
                System.out.println("Not found!");
            } else {
                System.out.println(scores.length - pos);
            }
        }
    }
 
    //returns the largest p such that A[p] = v
    static int binarySearch(int[] A, int v) {
        int l = 0;
        int h = A.length - 1;
        while (l <= h) {
            int m = (l + h)/2;
            if (A[m] <= v) {
                l = m + 1;
            } else { //A[m] > v
                h = m - 1;
            }
        }
        return (h >= 0 && A[h] == v) ? h : -1;
    }
}
 
abstract class SortingAlgorithm {
    void sort(int[] A) {
        sort(A, 0, A.length - 1);
    }
 
    abstract void sort(int[] A, int s, int e);
 
    static void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}
 
class InsertionSort extends SortingAlgorithm {
    void sort(int[] A, int s, int e) {
        for (int i = s + 1; i <= e; i++) {
            for (int j = i - 1; j >= s && A[j] > A[j + 1]; j--) {
                swap(A, j, j + 1);
            }
        }
    }
}
 
class QuickSort extends SortingAlgorithm {
    void sort(int[] A, int s, int e) {
        if (s >= e) {
            //single element, already sorted
        } else {
            int m = partition(A, s, e);
            sort(A, s, m-1);
            sort(A, m+1,e);
        }
    }
 
    static int partition(int[] A, int s, int e) {
        //select a random pivot
        Random rng = new Random();
        swap(A, s, rng.nextInt(e - s + 1) + s);
 
        int p = A[s];
        int k = s + 1;
 
        //invariant: A[s+1..k-1] are elements <= p, A[k..i-1] are elements > p
        for (int i = s + 1; i <= e; i++) {
            if (A[i] <= p) {
                swap(A, i, k);
                k++;
            } 
        }
 
        swap(A, s, k-1);
        return k-1;
    }
}
 
class MergeSort extends SortingAlgorithm {
    void sort(int[] A, int s, int e) {
        if (s >= e) {
            //single element, already sorted
        } else {
            int m = (s + e) / 2;
            sort(A, s, m);
            sort(A, m + 1,e);
            merge(A, s, m, m + 1, e);
        }
    }
 
    static void merge(int[] A, int s1, int e1, int s2, int e2) {
        int n = e2 - s1 + 1;
        int[] B = new int[n];
        int p = s1;
        int q = s2;
        for (int i = 0; i < n; i++) {
            int l = (p <= e1) ? A[p] : Integer.MAX_VALUE;
            int r = (q <= e2) ? A[q] : Integer.MAX_VALUE;
            if (l < r) {
                B[i] = l;
                l++;
            } else {
                B[i] = r;
                r++;
            }
        }
        for (int i = 0, j = s1; i < n; i++, j++) {
            A[j] = B[i];
        }
    }
}