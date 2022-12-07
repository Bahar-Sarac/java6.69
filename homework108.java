
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("m değerini giriniz: ");
        int m = input.nextInt();
        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        double t = Math.pow ((n+1),m);
        
        for (int i = 1; i <= n; i++) {
            int f1 = 1;
            int f2 = 1;
            int f3 =1;
            double c = f1 / (f2 * f3);
            t += Math.pow((-1), i) * c * Math.pow((n+1-i),m);
        }
        System.out.println("Eulerian sayısı: "+t);
    }
    
}
