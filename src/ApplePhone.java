public class ApplePhone extends Phone {
    String  name;
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


    @Override
    public void receiveCall() {
        System.out.printf("Звонит: %s ", name);
    }
}
