
import java.util.*;


class Main {
    public static boolean prime(int n){
     if(n == 2){
            return true;
        }
        if(n == 1){
            System.out.println("number is prime");
            return true;
        }
         if(n % 2 == 0) return false;
        for(int i = 3;i<n-1;i++){
            if(n%i == 0){
                
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number :");
        int n = sc.nextInt();
        System.out.println("Enter the second number :");
        int s = sc.nextInt();
        
        if(Math.abs(s-n) !=2){
            System.out.println("(" + n +"," + s + ")");
            System.out.println("are not twin prime");
            return;
        }
        
         
        if(prime(s) && prime(n)){
            System.out.println("(" + n +"," + s + ")");
            System.out.println(" is twin prime");
        }else{
            System.out.println(" is  twin prime");
        }
        
    }
}
