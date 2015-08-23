package javap1;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,25,45,60,15,75,30};
		int temp = array[0];
		
		for (int i=1 ; i<array.length ; i++){

			if(temp > array[i]){

			temp = array[i];
			
		}
		
		}

		System.out.println(temp);

	}

}

