import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入你的身高(公分):");
        double height = scanner.nextDouble() / 100;

        System.out.print("請輸入你的體重(公斤):");
        double weight = scanner.nextDouble();

        System.out.println("你的BMI為:"+ Double.parseDouble(DF.format(weight/(height*height))));

        int age = 17;
        if (age<14) {
            System.out.println("你屬於 無行為能力人");
        }
        else if((age>=14 && age<18) || age>=80){
            System.out.println("你屬於 限制行為能力人");
        }
        else {
            System.out.println("你屬於 完全行為能力人");
        }

        System.out.println(15+"15");
        System.out.println(("15"+15).getClass());
        System.out.println(("15"+15).getClass().getName());

        System.out.println(15+15+"15"+15+15);

        String name = "Huang";
        System.out.println(name.indexOf("ua"));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));



        System.out.println("Master bless me");
        System.out.println(3+7);
        System.out.println(8/3);
        System.out.println('a');
        char lastName = 'R';
        String myLastName = "Huang";
        System.out.println(lastName);
        System.out.println(myLastName);
    }
}
