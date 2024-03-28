
import java.util.*;
public class PrimeNumbers{

    public static boolean Prime(int n){
        if(n==0 || n==1){
            return false; 
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false; 
            }
        }
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 50; 
        for(int i=0;i<n;i++){
            if(Prime(i)){
                System.out.print(i+" ");
            }
            else {
                continue; 
            }
        }
        sc.close();
    }
}