package tasks;

import org.w3c.dom.css.Counter;

public class TaskTest {
    public static void main(String[] args) {

        OutTask task1 = new OutTask("Do this");
        task1.executeTask();

        OutTask task2 = new OutTask("Do that");
        task2.executeTask();

        RandomOutTask genereazaNumar2Cifre = new RandomOutTask(10, 100);
        genereazaNumar2Cifre.executeTask();

        CounterOutTask contor = new CounterOutTask();
        contor.executeTask();
        contor.executeTask();

    }
}
