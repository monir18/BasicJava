public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference callByReference = new CallByReference();
        callByReference.name = "Rudaba";
        System.out.println("Before calling : "+callByReference.name);

        callByReference.change(callByReference);
        System.out.println("After calling : "+callByReference.name);
    }
}
