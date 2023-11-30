public class ConversionStringAndPrimitiveDatatype {
    public static void main(String[] args) {
        //primitive -> String
        int i = 1000;
        String s = Integer.toString(i);
        System.out.println("s = "+s);

        double d = 10.25;
        String sd = Double.toString(d);
        System.out.println("sd = "+sd);

        boolean b = false;
        String bl = Boolean.toString(b);
        System.out.println("bl = "+bl);

        //String -> primitive
        String ss = "32";
        int ii = Integer.parseInt(ss);
        System.out.println("ii = "+ii);

        String dd = "99";
        double di = Double.parseDouble(dd);
        System.out.println("di = "+di);

        String val = "81";
        int value = Integer.valueOf(val);
        System.out.println("value = "+value);
    }
}
