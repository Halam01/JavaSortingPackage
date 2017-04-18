package sortPractice;

public class SortFunction {
	String[] data;
	int size;
	
	public SortFunction(String[] d_){
		this.data = d_;
		this.size = this.data.length;
	}
	
	//O(n^2), worst case must swap n elements n times
	public String[] insertionSort(){
		for (int i = 1; i < size; i++) {
			int j = i;
			while (j > 0 && (data[j - 1].compareTo(data[j]) > 0)) {
				String temp = data[j - 1];
				data[j - 1] = data[j];
				data[j] = temp;
				j = j - 1;
			}
		}	
		return data;
	}
	
	/*
	Complexity = O(n^2)
	Why?
	If statement + element swapping is O(1)
	Inner loop is O(i), where i = 1 + 2 + 3+...+(n-1)
	Outer loop is O(n)
	 */
	public String[] bubbleSort(){
		for (int i = (size - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (data[j - 1].compareTo(data[j]) > 0) {
					String temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
			}
		}
		return data;
	}
	
	//O(n^2), for each element, compare at most n times to see if it's the min, then swap
	public String[] selectionSort(){
		for (int i = 0; i < size; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (data[j].compareTo(data[min]) < 0) {
					min = j;
				}
			}

			if (min != i) {
				String temp = data[min];
				data[min] = data[i];
				data[i] = temp;
			}

		}
		return data;
	}
	
	//helper for quickSort
	public int partition(int low, int high){
		String pivot = data[high];
	    int i = low - 1;    
	    for (int j = low; j != high; j++){
	        if (data[j].compareTo(pivot) <= 0){
	            i = i + 1;
	            String temp = data[i];
	            data[i] = data[j];
	            data[j] = temp;
	        }
	    }
	    String temp2 = data[i+1];
	    data[i+1] = data[high];
	    data[high] = temp2;
	    return i + 1;
	}
	
	//Worst case O(n^2) if array is sorted or all same values, average case O(n log n)
	public String[] quickSort(int low, int high){
		if (low < high){
			int p = partition(low, high);
        	quickSort(low, p-1);
        	quickSort(p + 1, high);
		}
		return data;
	}

}
