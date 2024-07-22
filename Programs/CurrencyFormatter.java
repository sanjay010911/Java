import java.util.*;
import java.text.*;
import java.lang.*;


public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale in=new Locale("en","in");
         NumberFormat usdFormatter 
            = NumberFormat.getCurrencyInstance(Locale.US); 
            NumberFormat indFormatter 
            = NumberFormat.getCurrencyInstance(in); 
             NumberFormat chiFormatter 
            = NumberFormat.getCurrencyInstance(Locale.CHINA); 
            NumberFormat frFormatter 
            = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
         String currUs = usdFormatter.format(payment); 
         String currIn = indFormatter.format(payment); 
         String currCh = chiFormatter.format(payment); 
         String currFr = frFormatter.format(payment); 
        // Write your code here.
        
        System.out.println("US: " + currUs);
        System.out.println("India: " + currIn);
         System.out.println("China: " + currCh);
         System.out.println("France: " + currFr);
    }
}
