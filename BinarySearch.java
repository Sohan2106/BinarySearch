import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
		
		int noOfElements = 0;
		int[] arrayOfElements = {};
		int key = 0;
		
		takeInputs(arrayOfElements, key, noOfElements);
		binarySearch(arrayOfElements, key, noOfElements);
	}
	
	public static void binarySearch(int[] array, int key, int noOfElements){
	
		int firstElement = 0;
		int lastElement = noOfElements-1;
		
		while(lastElement >= firstElement){
			int midElement = ( firstElement + lastElement ) / 2;
			if(key == array[midElement]){
				System.out.println("Key found at position " + midElement+1);
				break;
			}
			else if(key < array[midElement]){
				lastElement = midElement-1;
			}
			else{
				firstElement = midElement+1;
			}
		}
		if(lastElement < firstElement){
			System.out.println(key + " element is not in the list");
		}
	}
	
	public static void takeInputs(int[] array, int key, int noOfElements){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements");
		noOfElements = in.nextInt();
		
		array = new int[noOfElements];
		System.out.println("Enter the elements to be searched in ascending order");
		
		for(int index = 0; index < noOfElements; index++){
			array[index] = in.nextInt();
		}
		
		System.out.println("Enter the key");
		key = in.nextInt();
	}
}
