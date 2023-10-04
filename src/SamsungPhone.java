public class SamsungPhone extends Phone {

    private String model;

    public SamsungPhone(int number, double weight, String model) {
        super(number, weight, model);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    void info() {

    }

    @Override
    public void info(String model) {
        System.out.printf("Модель: %s  ", model);
    }


    @Override
    public String receiveCall(String name) {
        return super.receiveCall(name);
    }
}