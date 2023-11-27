import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size of Array List : "+number.size());

        //Adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(90);
        number.add(0,50);
        /*
        System.out.println(number);
        System.out.println("Size of Array List : "+number.size());
        */

        /*
        for (int numbers:number) {
            System.out.print(" "+numbers);
        }
         */


        System.out.println();
        System.out.print("Array List Contains : ");
        Iterator itr = number.iterator();
        while (itr.hasNext()){
            System.out.print(" "+itr.next());
        }

        System.out.println();
        number.remove(2);
        System.out.print("After Removing Array List Contains : "+number);

        System.out.println();

        number.removeAll(number);
        System.out.print("After ALl Removing Array List Contains : "+number);
    }
}
