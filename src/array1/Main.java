//first school assignment with arrays 

package array1;

/**
 * @author Kim Vammen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] numbers = new int [100];
        for (int index = 0; index < numbers.length; index++){
           numbers[index] = index + 1;
        } 
        
        for (int index = 0; index < numbers.length; index++){
            System.out.println(numbers[index] + " ");
           
        } 
    }
}

