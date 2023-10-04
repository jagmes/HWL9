public interface Callable {

    static   void receiveCall(String name){
        System.out.printf("Звонит: %s ", name);
    }
}
