package sortPractice;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sortDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	    Scanner inFile1 = new Scanner(new File("input.txt")).useDelimiter(" ");
	    
	    List<String> temps = new ArrayList<String>();

	    // while loop
	    while (inFile1.hasNext()) {
	      // find next line
	      String token1 = inFile1.next();
	      temps.add(token1);
	    }
	    inFile1.close();
	    
	    String[] d = new String[temps.size()]; 
	    d = temps.toArray(d);
	    
	    System.out.print("Insertion Sort: ");
	    SortFunction s1 = new SortFunction(d);
	    String[] isd = s1.insertionSort();
	    for(int i = 0; i < isd.length; i++){
	    	System.out.print(isd[i]);
	    }
	    
	    System.out.println();
	    System.out.print("Bubble Sort: ");
	    SortFunction s2 = new SortFunction(d);
	    String[] bsd = s2.bubbleSort();
	    for(int i = 0; i < bsd.length; i++){
	    	System.out.print(bsd[i]);
	    }
	    
	    System.out.println();
	    System.out.print("Selection Sort: ");
	    SortFunction s3 = new SortFunction(d);
	    String[] ssd = s3.selectionSort();
	    for(int i = 0; i < ssd.length; i++){
	    	System.out.print(ssd[i]);
	    }
	    
	    System.out.println();
	    System.out.print("Quick Sort: ");
	    SortFunction s4 = new SortFunction(d);
	    String[] qsd = s4.quickSort(1, d.length-1);
	    for(int i = 0; i < qsd.length; i++){
	    	System.out.print(qsd[i]);
	    }
	    
	    
	    
	    
	  }

}
