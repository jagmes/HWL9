public class Main {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone(455, 0.1, "Galaxy");
        XiaomiPhone xiaomi = new XiaomiPhone();
        ApplePhone apple = new ApplePhone();
        xiaomi.receiveCall("баба Зина");
        xiaomi.info("Xiaomi 12T\n");

        samsung.receiveCall("баба Люба");
        samsung.info("Galaxy s40\n");
        samsung.receiveCall();
        apple.receiveCall("Яблоковод");
        apple.info("Яблоко 4s");
    }
}