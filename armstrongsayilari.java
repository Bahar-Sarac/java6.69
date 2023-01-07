

import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class armstrongsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        double a;
        System.out.println("Armstrong sayılar: ");
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    n = 100*i+10*j+k;
                    a = Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3);
                    if (n == a) {
                        System.out.println("Armstrong sayıların listesi: "+n);
                    } 
                    else {     
                    }
                }
            }
        }
    }
    
}
