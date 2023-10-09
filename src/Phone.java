public abstract class Phone implements Callable, Informable,Cloneable {
    private int number;
    private double weight;
    private String model;

    // методы

    public abstract void info(String model); // System.out.printf("Model: %s number: %d  weight: %f  \n", model, number, weight);

   public void receiveCall(String name) {
      //  System.out.printf("Звонит: %s ", name);
    }
   //Геттер
    int getNumber() {
       // System.out.printf("номер: %d ", +number);
        return number;
    }

    // конструктор
    public Phone() {
        number = 6300;
        weight = 0.4f;
        model = "Nokia";
    }

    public Phone(String name) {
        model = name;
    }


    public void setModel(){
       this.model= model;
    }
    public String getModel(){
       return  model;
    }

    public Phone(int number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    // конструктор с двумя параметрами.
    public Phone(int number, double weight) {
        this.number = number;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                '}';
    }
        // клонирование.
    @Override
    public Phone clone() throws CloneNotSupportedException{
       return (Phone) super.clone();
    }

}

