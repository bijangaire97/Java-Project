package majjaley;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumbers {
    
    public static int[] ar(int n){
    	Scanner input = new Scanner(System.in);
    	String duplicate = "";
    	int [] array = new int[n+2];
        
        for(int i = 0; i<n+2; i++){
            
         array[i] = input.nextInt();
             }
        
        for (int i=0; i< array.length; i++) {
        	
        }
        input.close();
        return array;
    }

     public static void main(String []args){
       //Find two repeating numbers.
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the highest number in the list: ");
       
       int high = input.nextInt();
       
      int [] arr = DuplicateNumbers.ar(high);
       
        System.out.println(Arrays.toString(arr));
        input.close();
       
     }
}

