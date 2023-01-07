
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework095 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("y: ");
        int y = input.nextInt();
     
        System.out.println("Leynad sayıları: "); 
        for (int i = 2; i < x; i++) {
            for (int j = 2; j < y; j++) {
                a = (int) (Math.pow(i, j)+Math.pow(j, i));
                 System.out.println(+n);    
            }
        }
    }
    
}
