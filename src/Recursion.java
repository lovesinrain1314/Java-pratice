public class Recursion {
    // recursive method 遞迴函數
    // a method that calls itself

    public static void sayHi(int i){
        if (i==0){
            return;
        }
        System.out.println("Enter sayHi with i = "+i);
        sayHi(i-1);
        System.out.println("We finished running with sayHi with i = "+i);
    }

    public static void main(String[] args){
        sayHi(10);
    }
}
