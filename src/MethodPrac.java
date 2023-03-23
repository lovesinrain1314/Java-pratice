public class MethodPrac {

    public MethodPrac(){}

    public void sayHello(){
        System.out.println("Master bliss me");
    }

//    public int multiply(int a, int b){
//        return a*b;
//    }

    //overloading
    public void multiply(int a, int b){
        System.out.println(a*b);
    }

    public void multiply(String a, String b){
        System.out.println(a+b);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        MethodPrac m = new MethodPrac();
        m.sayHello();
//        System.out.println(m.multiply(7,8)+m.multiply(9,10));
        m.multiply(7,8);
        m.multiply("apple","pen");

        //Only static method can be referenced from a static context
        System.out.println(add(8,9));
    }
}
