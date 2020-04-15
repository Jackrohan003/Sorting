/*package whatever //do not write package name here */

import java.io.*;

class StringBubbleSort {
    
    void sort(String arr[])
    {
        int len = arr  .length;
        String temp;
        boolean swapped;
        for(int i=0;i<len-1;i++)
        {
            swapped=false;
            for(int j=0;j<len-1-i;j++)
            {
               if (arr[j].compareTo( arr[j + 1]) > 0)  
                { 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
              // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        }
    }

	public static void main (String[] args) {
        BubbleSort ob = new BubbleSort(); 
         String arr[] = { "Rohan","Varun","Aayush","Siddharth" };
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        
        for(String x:arr)
        System.out.println(x);
	
	}
}
