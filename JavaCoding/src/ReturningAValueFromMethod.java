public class ReturningAValueFromMethod {
    public static void main(String[] args) {
        ReturnValue returnValue = new ReturnValue();
        int result = returnValue.square(7);
        System.out.println("Square of 7 = "+result);
    }
}
