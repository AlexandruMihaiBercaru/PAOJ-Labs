package tasks;

public class RandomOutTask implements Task{

    double limInf, limSup;
    private double randomNumber;

    public RandomOutTask(float limInf, float limSup) {
        this.limInf = limInf;
        this.limSup = limSup;

        // generez un numar in intervalul specificat la initializare
        randomNumber = (limSup - limInf) * Math.random() + limInf;
    }

    public void executeTask() {
        System.out.println("Numarul aleator: " + (int)randomNumber);
    }
}
