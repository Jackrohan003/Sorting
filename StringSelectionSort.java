/*package whatever //do not write package name here */

import java.io.*;

class StringSelectionSort {
    
    void sort(String a[])
    {
        int len = a.length;
        
        for(int i=0;i<len-1;i++)
        {
            int min = i;
            for(int j=i+1;j<len;j++)
            {
                if(a[j].compareTo(a[min]) < 0)
                    min = j;
            }
            String temp = a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

	public static void main (String[] args) {
        SelectionSort ob = new SelectionSort(); 
        String arr[] = {"Rohan","Varun","Aayush","Smit"}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        
        for(String x:arr)
        System.out.println(x);
	
	}
}
