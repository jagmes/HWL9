public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungPhone(455, 0.1, "Galaxy");
        phone.info("Galaxy");
        phone.receiveCall("баба Зина");
        System.out.println("--------------");
        Phone apple = new ApplePhone(2232, 2.2,  "4s");
        //apple.getModel();
        apple.info("4S");
        apple.receiveCall("Lyuba");
        System.out.println("--------------");
        Phone xiaomi = new XiaomiPhone(45444, 3.3, "12T");

        xiaomi.info("redmi 12T");
        xiaomi.receiveCall("Oleg");

//        XiaomiPhone xiaomi = new XiaomiPhone();
//        ApplePhone apple = new ApplePhone();
//        xiaomi.receiveCall("баба Зина");
//        xiaomi.info("Xiaomi 12T\n");
//
//        samsung.receiveCall("баба Люба");
//        samsung.info("Galaxy s40\n");
//       // samsung.receiveCall();
//        apple.receiveCall("Яблоковод");
//        apple.info("Яблоко 4s");
    }
}