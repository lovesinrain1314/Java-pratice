import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {

    public static void main(String[] args){
        int[][] my2DArray = {{1,2,3},{3,6,7}};
        int[][] my2DArray1 = new int[4][3];  //自動初始值0
        my2DArray1[2][1] = 10;
        System.out.println(my2DArray1[2][0]);

        //ArrayList<non-primitive data type>
        ArrayList<Integer> intList2 = new ArrayList<Integer>();

        String[] friend1 = {"Mike","May","Hally"};

        String[] friend2 = new String[5];

        int[] intList = new int[10];

        //ArrayList
        ArrayList<String> friend3 = new ArrayList<>();
        friend3.add("apple");
        friend3.add("banana");
        friend3.add("aana");
        System.out.println("friend size: "+friend3.size());
        System.out.println(friend3.get(2));

        //Collections.sort()
        Collections.sort(friend3);
        System.out.println(friend3);
        friend3.clear();
        System.out.println("after friend3.clear: "+friend3);
    }
}
