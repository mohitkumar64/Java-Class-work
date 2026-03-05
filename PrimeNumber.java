
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("number is prime");
            return;
        }
        if(n == 1){
            System.out.println("number is prime");
            return;
        }
         if(n % 2 == 0) {
             System.out.println("number is prime");
             return ;}
        for(int i = 3;i<n-1;i++){
            if(n%i == 0){
                System.out.println("number is not prime");
                return;
            }
        }
        
        System.out.println("number is prime");
    }
}
