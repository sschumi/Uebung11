package p3;

public class P3__main {
    public static void main(String[] args){
        System.out.println(kapitalanlage(1004, 1));
    }

    public static int kapitalanlage(int k, int j){
        if(j==0) return k;
        return kapitalanlage((int)(k*1.05), j-1);
    }
}
