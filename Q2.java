import java.util.*;

public class Q2  
{  
 
int partition (int a[], int start, int end)  
{  
    int pivot = a[end];  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
          
        if (a[j] < pivot)  
        {  
            i++; 
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  

void Q2(int a[], int start, int end)   
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);  
        Q2(a, start, p - 1);  
        Q2(a, p + 1, end);  
    }  
}  
  

void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 145, 68, 1, 7, 19, 25 };  
    int n = a.length;  
    System.out.println("\nBefore quick sorting - ");  
    Q2 q1 = new Q2();  
    q1.printArr(a, n);  
    q1.Q2(a, 0, n - 1);  
    System.out.println("\nAfter quick sorting  - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
} 
