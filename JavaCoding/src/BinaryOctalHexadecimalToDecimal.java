public class BinaryOctalHexadecimalToDecimal {
    public static void main(String[] args) {
        //Binary to decimal
        String binary = "101011";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary = "+decimal);

        //Octal to decimal
        String oct = "675";
        Integer octalToDecimal = Integer.parseInt(oct, 8);
        System.out.println("Octal To Decimal Convert = "+octalToDecimal);

        //Hexadecimal to decimal
        String hexa = "F";
        Integer hexaToDecimal = Integer.parseInt(hexa, 16);
        System.out.println("Hexadecimal to decimal convert = "+hexaToDecimal);
    }
}
