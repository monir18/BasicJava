public class PolymorphismExample {
    public static void main(String[] args) {
        PolymorphismPerson person = new PolymorphismPerson();
        person.display();
        /*
        PolymorphismTeacher teacher = new PolymorphismTeacher();
        PolymorphismStudent student = new PolymorphismStudent();
        */

        /*
        teacher.display();
        student.display();
         */
        person = new PolymorphismTeacher();
        person.display();
        person = new PolymorphismStudent();
        person.display();

        System.out.println("Second Example Polymorphism");
        /*
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10,20);
        Triangle triangle = new Triangle(10,20);

        System.out.println(shape.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
         */
        /*
        Shape shape = new Shape();
        System.out.println(shape.area());
        shape = new Rectangle(10,20);
        System.out.println(shape.area());
        shape = new Triangle(10,20);
        System.out.println(shape.area());
         */

        /*
        Shape shape = new Shape();
        Shape shape1 = new Rectangle(10,20);
        Shape shape2 = new Triangle(10,20);

        System.out.println(shape.area());
        System.out.println(shape1.area());
        System.out.println(shape2.area());
         */

        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Triangle(10,20);
        shapes[2] = new Rectangle(10,20);
        for (int i = 0; i < 3; i++) {
            System.out.println(shapes[i].area());
        }
    }
}
