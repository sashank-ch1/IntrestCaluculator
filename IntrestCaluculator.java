package codes;
import java.util.*;

public class InterestCalculator {
    
    public static void main(String[] args) {
        int actualamt;
        float interest; // Fixed the spelling
        int tenure;
        float ans;
        float total;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter actual amount:");
        actualamt = sc.nextInt();
        
        System.out.println("Enter interest rate (rupees per 100):");
        interest = sc.nextFloat();
        
        System.out.println("Enter tenure in months:");
        tenure = sc.nextInt();
        ans = (actualamt / 100.0f) * interest * tenure; 
        total=actualamt+ans;
        System.out.println("The total intrest amount is: " + ans);
        System.out.println("The  total amount is:"+total);
    }
}
