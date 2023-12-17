public class MethodOverloading {
    void add(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    void add(double a, double b){
        double result = a + b;
        System.out.println(result);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(){
        System.out.println("Nothing to add");
    }
}
