package containers;

import tasks.Task;

public abstract class TasksContainer implements  Container {

    protected int maxSize;
    protected Task[] taskList;

    public TasksContainer(int maxSize) {
        if (maxSize > 0) {
            this.maxSize = maxSize;
            this.taskList = new Task[maxSize];
        }
        else{
            throw new IllegalArgumentException("Container size must be greater than 0");
        }
    }

    @Override
    public void addElem(Task task) {}

    @Override
    public Task removeElem() {
        return null;
    }

    public abstract boolean isFull();

    public abstract boolean isEmpty();

    @Override
    public void executeTask() {}
}
