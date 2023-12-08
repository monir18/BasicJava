public class AbstractionTest {
    public static void main(String[] args) {
        MobileUser ms;
        ms = new Rahim();
        ms.sendMessage();
        ms = new KarimAbstract();
        ms.sendMessage();
        ms.call();
    }
}
