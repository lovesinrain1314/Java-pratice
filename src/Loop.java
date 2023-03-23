import java.util.Random;
import java.util.Scanner;

public class Loop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int low = 0;
        int high = 100;
        Random r = new Random();
        int secret = r.nextInt(high-low)+low;


        while (true){
            System.out.print("Make a guess between "+low+"~"+high+" : ");
            int guess = scanner.nextInt();

            if (guess>high || guess<low) {
                System.out.println("It not a valid guess.");
                continue;
            }

            if (guess==secret){
                System.out.println("You win! The secret is "+secret);
                break;
            }
            else if (guess>secret){
                high = guess;
                System.out.println("It too high!");
            }
            else if (guess<secret){
                low = guess;
                System.out.println("It too low!");
            }
        }


        //自己寫的
//        Scanner s = new Scanner(System.in);
//        int min = 0;
//        int max = 100;
//        Random r = new Random();
//        int ans = r.nextInt(max-min)+min;
//        int input;
//
//        System.out.print("數字介於"+min+"~"+max);
//        do {
//            input = s.nextInt();
//            if(input==ans)
//                System.out.println("恭喜你猜對了！");
//            else if (input>ans) {
//                max = input;
//                System.out.println("太大囉");
//                System.out.println("數字介於"+min+"~"+max);
//            }
//            else {
//                min = input;
//                System.out.println("太小囉");
//                System.out.println("數字介於"+min+"~"+max);
//            }
//        }while(input!=ans);


//        for(int i=0;i<10;i++){
//            for(int j=3;j>0;j--){
//                if(j==2)
//                    break;
//                System.out.println(i+" "+j);
//            }
//        }

//        String[] friend = {"apple","banana","cana","Wison","Jason"};
//
//        for(String name:friend){
//            System.out.println(name + "is his friend.");
//        }

//        for(int i =0;i<friend.length;i++){
//            System.out.println(friend[i]+" is my friend.");
//        }

    }
}
