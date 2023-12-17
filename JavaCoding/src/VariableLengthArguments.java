public class VariableLengthArguments {
    /*
    void add(int x, int y){
        System.out.println(x+y);
    }

    void add(int x, int y, int z){
        System.out.println(x+y+z);
    }

    void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
     */
//variable length arguments
    void add(int ... num){
        int sum = 0;
        for (int x : num) {
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
