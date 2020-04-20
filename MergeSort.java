/*package whatever //do not write package name here */

import java.io.*;

class MergeSort {


 public static void mergeSort(int[] array, int low, int high){
	if(low < high){
		int middle = (low + high) / 2;
		mergeSort(array, low, middle);
		mergeSort(array, middle+1, high);
		merge(array, low, middle, high);
	}	
}

public static void merge(int[] array, int low, int middle, int high){
	int[] helper = new int[array.length];
	for (int i = low; i <= high; i++) {
		helper[i] = array[i];
	}
	
	int helperLeft = low;
	int helperRight = middle+1;
	int current = low;
	
	while (helperLeft <= middle && helperRight <=high) {
		if(helper[helperLeft] <= helper[helperRight]){
			array[current++] = helper[helperLeft++];
			
		}else{
			array[current++] = helper[helperRight++];
		}

	}
	
	int remaining = middle - helperLeft;
	for (int i = 0; i <= remaining; i++) {
		array[current+i] = helper[helperLeft+ i];
	}
}


	public static void main (String[] args) {

    int[] list = {8,3,6,2,7,1,9,4,10,5};

        mergeSort(list,0,9);
        for(int i:list)
        System.out.println(i);
    
    

	}
}
