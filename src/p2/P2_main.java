package p2;

public class P2_main {
    public static void main(String[] args){
        System.out.println(ZweierlogarithmusR(16));
        System.out.println(ZweierlogarithmusI(16));
    }

    public static int ZweierlogarithmusR(int a){
        if(a == 1) return 0;
        return 1 + ZweierlogarithmusR(a/2);
    }

    public static int ZweierlogarithmusI(int a){
        if(a == 1) return 0;
        int result = 1;
        while(a/2 != 1){
            a /= 2;
            result++;
        }
        return result;
    }
}
