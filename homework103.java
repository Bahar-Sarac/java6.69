
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Pozitif tam sayı giriniz: ");
        int sayi = input.nextInt();
        int s = 0;
        int t = 0;
        
        for (int i = 1; i <= sayi; i++) {
            if(sayi % i == 0){
                s ++ ;
                t+= 1 / i ;
            }
        }
        int h = s / t;
        if(h == Math.round(h)){
            System.out.println("Ore sayısıdır. ");
        }
        else if(h != Math.round(h)){
            System.out.println("Ore sayısı değildir. ");
        }
        
    }
  
}
