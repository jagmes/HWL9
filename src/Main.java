public class Main {
    public static void main(String[] args) {
        try {
            Phone phone = new SamsungPhone(455, 0.1, "Galaxy");
            phone.info("Galaxy");
            phone.receiveCall("баба Зина");
            System.out.println("--------------");
            Phone apple = phone.clone(); // Клонирование самсунга
            System.out.println(apple.toString());
            System.out.println("--------------");
            Phone[] phones= new Phone[2];
            for (int i = 0; i <phones.length; i++) { //Проходимся по массиву и клнируем его.
                phones[i]= phone.clone();
            }
            for (Phone p: phones) {
                p.info(p.getModel());   //Выводим клонированные телефоны...
                System.out.println("\nClone...");
            }


//            Phone apple = new ApplePhone(2232, 2.2, "4s");
//            apple.info("4S");
//            apple.receiveCall("Lyuba");
//            System.out.println("--------------");
//            Phone xiaomi = new XiaomiPhone(45444, 3.3, "12T");
//            xiaomi.info("redmi 12T");
//            xiaomi.receiveCall("Oleg");

        }
        catch (CloneNotSupportedException exception){
           System.out.println("not support!");
        }

    }
}