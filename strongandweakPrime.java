
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
         if(n % 2 == 0) return false;
        for(int i = 3;i*i<=n;i++){
            if(n%i == 0){
                
                return false;
            }
        }
        return true;
}

public static int nprime(int n , int t ){
    int i = (t == 0)? n-1 : n+1;
   
    while(!prime(i)&& i>0){
        if(t == 0){
            i--;
        }else{
            i++;
        }
    }
  //  System.out.println(i);
    return i;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number :");
        int n = sc.nextInt();
        
        if(!prime(n)){
            System.out.println("number is not a  prime");
            return;
        }
        
        if((nprime(n,1) + nprime(n,0))/2 < n){
            System.out.println("number is  a strong prime");
        }else{
            System.out.println("number is a weak Prime");
        }
        
        
           
        
        
        
    }
}
