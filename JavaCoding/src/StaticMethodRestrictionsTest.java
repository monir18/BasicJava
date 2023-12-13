public class StaticMethodRestrictionsTest {
    public static void main(String[] args) {
        StaticMethodRestrictions res = new StaticMethodRestrictions();
        res.display1();
        StaticMethodRestrictions.display2();
    }
}
