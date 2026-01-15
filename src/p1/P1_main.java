package p1;

public class P1_main {
    public static void main(String[] args){
        System.out.print(potenzR(2,2));
    }

    public static double potenzR(double a, int b){
        if(b == 0){
            return 1.0;
        }
        return a * potenzR(a, b-1);
    }

    public static double potenzI(double a, int b){
        double result = a;
        if(b == 0) return 1.0;
        while(b > 1){
            result *= a;
            b--;
        }
        return result;
    }
}
