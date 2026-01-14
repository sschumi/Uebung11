package h1;


public class H1_main {
    public static void main(String[] args){
        Node a, b, c, d, e;
        a = new Node(b = new Node(c = new Node(d = new Node(e = new Node(null)))));
        System.out.println(distance(a, b));
    }

    public static int distance(Node x, Node y) {
       if(x.getNext() == null || x == y){
           return 0;
       }
       return 1+distance(x.getNext(), y);
    }
}
