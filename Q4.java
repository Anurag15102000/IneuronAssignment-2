import java.util.*;

public class Q4 {  
  

void Q4(int a[], int beg, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      

        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
      

    for (i = 0; i < n1; i++)    
    LeftArray[i] = a[beg + i];    
    for (j = 0; j < n2; j++)    
    RightArray[j] = a[mid + 1 + j];    
      
    i = 0;   
    j = 0;   
    k = beg;   
      
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }    
}    
  
void Q4Sort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
        int mid = (beg + end) / 2;  
        Q4Sort(a, beg, mid);  
        Q4Sort(a, mid + 1, end);  
        Q4(a, beg, mid, end);  
    }  
}  
  

void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
  
public static void main(String args[])  
{  
    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
    int n = a.length;  
    Q4 m1 = new Q4();  
    System.out.println("\nBefore Merge sorting: - ");  
    m1.printArray(a, n);  
    m1.Q4Sort(a, 0, n - 1);  
    System.out.println("\nAfter Merge sorting:  - ");  
    m1.printArray(a, n);  
    System.out.println("");  
}  
  
  }  