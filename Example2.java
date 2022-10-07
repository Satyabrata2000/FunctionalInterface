package FunctionalInterface;


public class Example2 implements  Example1{

    public void use(String msg){
    System.out.println(msg);
        }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.use("Hello World");
    }

}

