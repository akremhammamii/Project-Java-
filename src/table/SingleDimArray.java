package table;

public class SingleDimArray {

	public static void main(String[] args) {
		
		// Declare array with 5, starting index is 0 last index is 4
		//int a[] = new int [5];
		
		// Storing / inserting values into array
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 50;
//		a[3] = 30;
//		a[4] = 40;
		
		
		// Declare array list without specifying size
		int a[] = {10, 20, 50, 30, 40};
		
		System.out.println("Length of an array is: " + a.length); //print length / size of array
		
		//Read specific value
		System.out.println(a[2]); //50
		
		
		// Read value from array
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		//Read values using enhanced for loop
		for(int i : a) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		

	}

}
