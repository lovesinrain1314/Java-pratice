public class StringAndMathPrac {

    public static void main(String[] args){

        String s1 = "Master bless me";

        //String .split()
        String[] s2 = s1.split(" ");
        for (String s: s2)
            System.out.println(s);
        System.out.println();

        //String .substring()
        String s3 = s1.substring(1, s1.length()-1);
        System.out.println(s3);

        //Java Math class
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int a = 8;
        int b = 10;
        System.out.println(Math.max(a,b));

        double z = 1.2345;
        System.out.println("floor: "+Math.floor(z));
        System.out.println("ceil: "+Math.ceil(z));
        //find the closet integer
        System.out.println("the closet integer: "+Math.rint(z));

        System.out.println("square root of a: "+Math.sqrt(a));
        System.out.println("pow of (a,b): "+Math.pow(a,b));
        System.out.println("nature log of a: "+Math.log(a));
        System.out.println("log of a: "+Math.log10(a));

        //mod operator
        //可以用來判斷奇偶數
        int c = 501;
        if (c%2==0){
            System.out.println("c is an even number");
        }
        else {
            System.out.println("c is an odd number");
        }
    }
}
