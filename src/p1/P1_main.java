package p1;

public class P1_main {
    public static void main(String[] args){
        System.out.print(potenzR(2,0));
    }

    public static double potenzR(double a, int b){
        if(b == 0){
            return a;
        }
        return a * potenzR(a, b-1);
    }

    public static double potenzI(double a, int b){
        double result = a;
        while(b > 1){
            result *= a;
            b--;
        }
        return result;
    }
}
