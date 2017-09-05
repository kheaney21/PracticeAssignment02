package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {
	
	private int max; 
	private int min = 0;
	private int mid;
	private int count = 0;

	public String searchName() {
		return "Binary Recursive";
	}
	
	private int getMax(int[] arr) {
		return arr.length;
	}
	
	private void setMid() {
		mid = (max + min)/2;
	}
	
	private void setMax(int newMax) {
		max = newMax;
	}
	
	private void setMin(int newMin) {
		min = newMin;
	}
	
	public int search(int[] arr, int target) {
		
		if (count == 0) {
			max = getMax(arr);
		}
		count++;
		
		//base case
		if ((max - 1) < min) {
			return -1;
		}
		
		setMid();
		
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			setMin(mid + 1);
			return search(arr, target);
		} else {
			setMax(mid - 1);
			return search(arr, target);
		}
	}

}