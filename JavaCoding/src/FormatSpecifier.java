public class FormatSpecifier {
    public static void main(String[] args){
        //Format specifier
        boolean b = true; //dynamic initialization
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.28955;

        System.out.print(b+"\n");
        System.out.println("Boolean b = "+b);
        System.out.printf("Boolean b = %b",b);
        System.out.printf("\nCharacter c = %c",c);
        System.out.printf("\nShort s = %d",s);
        System.out.printf("\nInteger i = %d",i);
        System.out.printf("\nFloat f = %f",f);
        System.out.printf("\nFloat f = %.1f",f);
        System.out.printf("\nDouble d = %f",d);
        System.out.printf("\nDouble d = %.2f",d);
    }
}
