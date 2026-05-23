

public class Functions {
     public static void A(){
        System.out.println("upadhyay");
    }
    public static void main(String[] args) {
        B();

    }
    public static void B(){
        System.out.println("piyu");
        C();
    }
    public static void C(){
        System.out.println("c print kr");
        A();
    }
    
}
