/*package whatever //do not write package name here */

import java.io.*;

class BubbleSort {
    
    void sort(int arr[])
    {
        int len = arr  .length;
        int temp=0;
        boolean swapped;
        for(int i=0;i<len-1;i++)
        {
            swapped=false;
            for(int j=0;j<len-1-i;j++)
            {
               if (arr[j] > arr[j + 1])  
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
         int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        
        for(int x:arr)
        System.out.println(x);
	
	}
}
