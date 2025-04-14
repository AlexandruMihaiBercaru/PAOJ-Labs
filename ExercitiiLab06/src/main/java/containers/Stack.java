package containers;

import tasks.Task;

public class Stack extends TasksContainer{
    int tos ; //top-of-stack

    public Stack(int maxSize) {
        super(maxSize);
        this.tos = -1;
    }

    @Override
    public void addElem(Task task) {
        if(!isFull()) {
            tos++;
            taskList[tos] = task;
            System.out.println("Task added.");
        }
        else{
            throw new RuntimeException("Stack is full, can't add a new element!!");
        }
    }

    @Override
    public Task removeElem() {
        if(!isEmpty()){
            Task tempTask = taskList[tos];
            tos--;
            System.out.println("Task removed: " + tempTask.getClass().getSimpleName());
            return tempTask;
        }
        else{
            throw new RuntimeException("Stack is empty, can't remove!!");
        }
    }

    @Override
    public boolean isFull() {
        return tos == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return tos == -1;
    }

    @Override
    public void executeTask() {}
}
