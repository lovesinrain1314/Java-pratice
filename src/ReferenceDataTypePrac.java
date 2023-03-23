public class ReferenceDataTypePrac {
    // reference data type (Non-primitive data type)
    // 1. method's actual parameter
    // 2. assign operator
    // Java => copy by reference

    // primitive data type
    // Java => copy by value

    //例外：String is non-primitive data type but use COPY BY VALUE
    /*
        String並非primitive data type，但會copy by value，因為C++語言的設計關係，在比較原始的語言中，
        是沒有String這種資料類型的，反而都需要從char這種資料類型來製作。
        因此，在Java中的String其實也是char array，但包裝成String這種資料類型。
        為了方便我們使用，才會做成copy by value，但本質上還是non primitive data type。
     */

    static int i = 100;

    public void setI(){
        i = 50;
    }

    public static void changeValue(int a, int[] arr, String s){
        a = 100;
        arr[0]=1000;
        s = "Changed";
    }


    public static void main(String[] args){

        int t =9;
        int[] trr = {9,10,5};
        String tt = "Unchanged";

        System.out.println("before change: t = "+t);
        for (int i:trr){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("tt = "+tt);

        changeValue(t,trr,tt);
        System.out.println();
        System.out.println("after change: t = "+t);
        for (int i:trr){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("tt = "+tt);
        System.out.println();

        //assign operator
        String s1 = "aa";
        String s2 = s1;
        s1 = "bb";
        System.out.println("s1 = "+s1+"  ,s2 = "+s2);

        System.out.println("before setA, i = "+i);
        ReferenceDataTypePrac r = new ReferenceDataTypePrac();
        r.setI();
        System.out.println("after setA, i = "+i);
    }
}
