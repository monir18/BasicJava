public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        //StringBuilder append() method
        sb.append("Java");//now original string is changed
        System.out.println("append method = "+sb);//Prints Hello Java

        //StringBuilder insert() method
        StringBuilder str = new StringBuilder("Hello ");
        str.insert(1,"Java");//now original string is changed
        System.out.println("insert method = "+str);//prints HJavaello

        //StringBuilder replace() method
        StringBuilder srb = new StringBuilder("Hello");
        srb.replace(1,3,"Java");
        System.out.println("replace method = "+srb);//prints HJavalo

        //StringBuilder delete() method
        StringBuilder d = new StringBuilder("Hello");
        d.delete(1,3);
        System.out.println("Delete method = "+d);//prints Hlo
    }
}
