
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework088 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("a: ");
        int a = input.nextInt();
        int b=2;
        
        while(a>1){
            if(a % b == 0){
                a = a / b;
                System.out.println(b);
            }
            else if(a % b != 0){
                b += 1; 
            }
        }
    }
    
}
