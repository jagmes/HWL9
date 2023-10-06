public class ApplePhone extends Phone {
    String model;

    public ApplePhone(int number, double weight, String model ) {
        super(number, weight, model);
        this.model = model;
    }

    public String getModel(){
        return model;
    }


    @Override
    public void receiveCall(String name)  {
        System.out.printf("Звонит: %s \n", name);
    }


    @Override
    public void info(String model) {
        System.out.printf(" Модель Apple: %s  ", getModel());
    }
}
