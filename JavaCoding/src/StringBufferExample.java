public class StringBufferExample {
    public static void main(String[] args) {
        //StringBuffer append() Method
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//Now original string is changed
        System.out.println(sb);//Prints Hello Java

        //StringBuffer insert() Method
        StringBuffer stb = new StringBuffer("Hello ");
        stb.insert(6,"Java");
        System.out.println(stb);
        stb.insert(1,"Welcome");
        System.out.println(stb);

        //StringBuffer replace() Method
        StringBuffer replace = new StringBuffer("Hello");
        replace.replace(1,3,"Java");
        System.out.println(replace);

        //StringBuffer delete() Method
        StringBuffer dl = new StringBuffer("Hello");
        dl.delete(0,3);
        System.out.println(dl);

        //StringBuffer reverse() Method
        StringBuffer rev = new StringBuffer("Hello");
        rev.reverse();
        System.out.println(rev);

        //StringBuffer capacity() Method
        StringBuffer cap = new StringBuffer();
        System.out.println(cap.capacity());//default 16
        cap.append("Hello");
        System.out.println(cap.capacity());//now 16

        cap.append("java is my favorite language");
        System.out.println(cap.capacity());//now (16*2)+2=34 or (Old capacity*2)+2

        //StringBuffer ensureCapacity() method
        System.out.println("ensureCapacity");
        StringBuffer enCap = new StringBuffer();
        System.out.println(enCap.capacity());//default 16

        enCap.append("Hello");
        System.out.println(enCap.capacity());//now 16
        enCap.append("java is my favorite language");
        System.out.println(enCap.capacity());//now (16*2)+2=34 or (old capacity*2)+2=34

        enCap.ensureCapacity(10);//now no change
        System.out.println(enCap.capacity());//now 34
        enCap.ensureCapacity(50);//now (34*2)+2
        System.out.println(enCap.capacity());//now 70
    }
}
