package tasks;

public class CounterOutTask implements Task {

    private static int counter;

    @Override
    public void executeTask() {
        counter++;
        System.out.println("Counter: " + counter);
    }


}
