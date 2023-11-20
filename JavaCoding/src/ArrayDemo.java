public class ArrayDemo {
    public static void main(String[] args) {
        int[] number = new int[5]; // declaration and creation
        number[0] = 99;
        number[1] = 199;
        number[2] = 1;
        number[3] = 19;
        number[4] = 33;

        System.out.println(number[4]);

        // how to find array size
        int len = number.length;
        System.out.println("Size of Array : "+len);

        // how to array summation
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Summation of array : "+sum);
    }
}
