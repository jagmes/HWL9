public interface Informable {

    default   void info(String model){

            System.out.printf("Model: %s   \n",  model);
        }
    }

