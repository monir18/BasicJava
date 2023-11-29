public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rudaba");
        System.out.println("Name : "+stringBuffer);

        stringBuffer.append(" Admin Akter Jui ");
        stringBuffer.append(30);
        System.out.println("Append Method : "+stringBuffer);

        stringBuffer.setLength(5);
        System.out.println("setLength Method = "+stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.delete(0, 2);
        System.out.println(stringBuffer);
    }
}
