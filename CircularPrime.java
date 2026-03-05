
import java.util.*;
import java.lang.*;


class Main {
    public static boolean prime(int n){
     if(n == 2){
            return true;
        }
        if(n == 1){
            System.out.println("number is prime");
            return true;
        }
        for(int i = 3;i*i<=n;i++){
            if(n%i == 0){
                
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number :");
        String s = sc.nextLine();
        
        if(!prime(Integer.parseInt(s))){
            System.out.println("number is not circular prime");
            return;
        }
        
        String n = s+s;
        
        for(int i=0;i<n.length();i++){
            int t;
            if(i+s.length() < n.length()){
            t =Integer.parseInt(n.substring(i, i+s.length()));
          if(!prime(t)) {
              System.out.println("number is not circular prime");
            return;
          }}
        }
       
        System.out.println("number is  circular prime");
           
        
        
        
    }
}
