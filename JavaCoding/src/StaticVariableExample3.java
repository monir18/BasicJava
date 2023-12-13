public class StaticVariableExample3 {
    static int count = 0;

    StaticVariableExample3(){
        count++;
    }

    void totalStudent(){
        System.out.println("Total Student = "+count);
    }
}
