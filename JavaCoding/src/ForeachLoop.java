public class ForeachLoop {
    public static void main(String[] args) {
        /*
        String[] names = new String[4];
        names[0] = "Rudaba";
        names[1] = "Monir";
        names[2] = "Kalam";
        names[3] = "Asfar";
         */
        String[] names = {"Rudaba", "Monir", "Kalam", "Asfar"};
        System.out.println(names.length);
        System.out.println();
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
        // for each loop
        System.out.println();
        System.out.println("Foreach loop");
        for (String x:names) {
            System.out.println(x);
        }

        int[] numbers = {11,55,33,36,5};
        int sum = 0;
        for (int items:numbers) {
            System.out.println(items);
            sum = sum+items;
        }
        System.out.println("Summation of array numbers = "+sum);
    }
}
