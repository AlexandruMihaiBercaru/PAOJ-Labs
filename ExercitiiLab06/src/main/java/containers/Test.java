package containers;

import tasks.CounterOutTask;
import tasks.OutTask;
import tasks.RandomOutTask;
import tasks.Task;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Introduceti numarul de task-uri");
        Scanner sc = new Scanner(System.in);
        int taskCount = sc.nextInt();
        Task[] tasks = new Task[taskCount];
        System.out.println("Alegeti un numar intre 1 si 3:");
        for (int i = 0; i < taskCount; i++) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Introduceti mesajul de afisat:");
                    String mess = sc.next();
                    tasks[i] = new OutTask(mess);
                    break;
                case 2:
                    System.out.println("Limita inferioara:");
                    int limit1 = sc.nextInt();
                    System.out.println("Limita superioara");
                    int limit2 = sc.nextInt();
                    tasks[i] = new RandomOutTask(limit1, limit2);
                    break;
                case 3:
                    tasks[i] = new CounterOutTask();
                    break;
            }
            System.out.println("Alegeti un numar intre 1 si 3:");
        }

        Stack myStack = new Stack(taskCount);
        Queue myQueue = new Queue(taskCount);
        for(var task : tasks){
            myStack.addElem(task);
            myQueue.addElem(task);
        }

        System.out.println("\nOrdine executie stiva:\n");
        for(int idx = 0; idx < taskCount; idx++){
            Task temp = myStack.removeElem();
            temp.executeTask();
            System.out.println("-------------------\n");
        }

        System.out.println("\nOrdine executie coada:\n");
        for(int idx = 0; idx < taskCount; idx++){
            Task temp = myQueue.removeElem();
            temp.executeTask();
            System.out.println("-------------------\n");
        }
    }
}
