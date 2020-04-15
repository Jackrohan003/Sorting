/*package whatever //do not write package name here */

import java.io.*;

class SelectionSort {
    
    void sort(int a[])
    {
        int len = a.length;
        
        for(int i=0;i<len-1;i++)
        {
            int min = i;
            for(int j=i+1;j<len;j++)
            {
                if(a[j]<a[min])
                    min = j;
            }
            int temp = a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

	public static void main (String[] args) {
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        
        for(int x:arr)
        System.out.println(x);
	}
}
