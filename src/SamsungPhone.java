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
    public void info(String model) {
        System.out.printf("Samsung Модель: %s  ", getModel());
    }


    @Override
    public void receiveCall(String name) {
        System.out.printf("Звонит: %s \n", name);
    }

}