public class WrapperClass {
    public static void main(String[] args) {
        //primitive -> object / autoboxing
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("Y = "+y);

        //automatic autoboxing
        Integer z = x;//Integer.valueOf(x);
        System.out.println("Z = "+z);

        //Object -> primitive
        Double d = 10.25;
        System.out.println(d);

        double de = d.doubleValue();//unboxing
        System.out.println(de);
        double e = d;
        System.out.println(e);
    }
}
