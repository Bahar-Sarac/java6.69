
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class basamaktoplamifibonaccisayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int s = i+j;
                if ((s==1) || (s==2) || (s==3) || (s==5) || (s==8) || (s==13)) {
                    System.out.println("Basamklar toplamı fibonacci olan sayılar:"+(10*i+j));
                }
            }
        }
    }
   
}
