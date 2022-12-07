

import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework098 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s;
        double a;
        System.out.println("Armstrong sayılar: ");
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    s = 100*i+10*j+k;
                    a = Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3);
                    if (s == a) {
                        System.out.println("s: "+s);
                    } 
                    else {     
                    }
                }
            }
        }
    }
    
}
