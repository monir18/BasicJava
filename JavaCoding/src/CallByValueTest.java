public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        int x = 10; //primitive data
        System.out.println("x before call : "+x);

        callByValue.change(x);
        System.out.println("x after call : "+x);
    }
}
