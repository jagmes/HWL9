public class ApplePhone extends Phone {

    @Override
    public String receiveCall(String name) {
        return super.receiveCall(name);
    }

    @Override
    void info() {

    }

    @Override
    public void info(String model) {
        System.out.printf("Модель: %s  " , model);
    }
}
