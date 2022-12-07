
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework073 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         Random rand = new Random();
         char random;
         char tahmin;
         int sayac=0;
         random=(char) (rand.nextInt(25) + 65);
         while(true){
             
             System.out.println("Bir harf giriniz: ");
             tahmin = input.next().charAt(0);
             tahmin = Character.toUpperCase(tahmin);
             if (sayac == 10) {
                 System.out.println("Hakkınız bitti.");
                 break;
             }
             else if(random==tahmin){
             System.out.println(sayac+1+" hakta doğru bildiniz."); 
             break;
         }  
        sayac++;
            }
    }
    
}
