public class sortDemo {
	public static void main(String[] args){
		
	}
	public void selectionSort(int[] array){ // O(N^2)
		int length, startI, minI, findMinI, temp;
		length = array.length;
		
		if(length <= 1) return;
		for(startI = 0; startI < length; startI++){
			minI = startI;
			for(findMinI = startI + 1; findMinI < length; findMinI++){ // finding min
				if(array[findMinI] < array[minI])
					minI = findMinI;
			}
			temp = array[startI];
			array[startI] = array[minI];
			array[minI] = temp;
		}
	}
	
	public void insertionSort(int[] array){ //O(N^2)
		int length, startI, findSpotI, temp;
		length = array.length;
		
		if(length<=1) return;
		
		for(startI = 1; startI < length; startI++){
			temp = array[startI];
			findSpotI = startI + 1;
			while(findSpotI >= 0 && array[findSpotI] > array[startI]){ // shifting to the right, to find the right spot to land
				array[findSpotI+1] = array[findSpotI];
			}
			array[findSpotI+1] = temp;
		}
	}
	
	public void bubbleSort(int[] array){ // Stability Sort O(N^2)
		int length, startI, iterateI, temp;
		length = array.length;
		
		if(length<=1) return;
		
		for(iterateI = 0; iterateI < length; iterateI++){
			for(startI = length-1; startI>=0; startI--){ // lighter bubble floating upward to the beginning of array
				if(array[startI] < array[startI-1]){
					temp = array[startI-1];
					array[startI-1] = array[startI];
					array[startI] = temp;
					
				}
			}
		}
	}
	
	public void heapSort(int[] array){
		
	}
	
	public void quickSort(int[] array){
		
	}
	
	public void mergeSort(int array){
		
	}
	
	public void shellSort(int array) {
		
	}
}
