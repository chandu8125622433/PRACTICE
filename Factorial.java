public class Factorial {
    int fact(int n){
        if (n==2||n==1){
            return n;
        }
        return n*fact(n-1);
    }
    
}
