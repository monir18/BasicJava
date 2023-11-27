import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        //Adding elements
        number.add(10);
        number.add(11);
        number.add(19);
        number.add(2,99);
        number.add(13);

        System.out.print("ArrayList contains : ");
        for (int items:number) {
            System.out.print(" "+items);
        }
        System.out.println();
        System.out.println("Size of Array List: "+number.size());

        boolean check = number.isEmpty();
        System.out.println("ArrayList empty : "+check);

        if (number.isEmpty()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        boolean contain = number.contains(19);
        System.out.println("19 is in the list : "+contain);

        int pos = number.indexOf(19);
        System.out.println("The index of 19 is : "+pos);

        number.set(2,33);//existing position replace values set
        System.out.println("After setting : "+number);

        int x = number.get(2);
        System.out.println("index 2 = "+x);

        number.clear();
        System.out.print("After clear ArrayList contains : "+number);
        System.out.println();

        if (number.isEmpty()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
