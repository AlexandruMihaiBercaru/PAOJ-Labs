package tasks;

public class OutTask implements Task {
    String outputMessage;

    public OutTask(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    public void executeTask(){
        System.out.println(outputMessage);
    }

}
