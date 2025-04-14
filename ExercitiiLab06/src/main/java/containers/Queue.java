package containers;

import tasks.Task;

public class Queue extends  TasksContainer{
    private int front, rear;

    public Queue(int maxSize) {
        super(maxSize);
        front = -1;
        rear = -1;
    }

    @Override
    public void addElem(Task task) {
        if(!isFull()) {
            if(front == -1){
                front = 0;
            }
            rear++;
            taskList[rear] = task;
            System.out.println("Task added.");
        }
        else {
            throw new RuntimeException("Queue is full, cannot add a new element!!");
        }
    }

    @Override
    public Task removeElem() {
        if(!isEmpty()){
            Task tempTask = taskList[front];
            // daca am un singur element in coada si il elimin, inseamna ca s-a golit din nou
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("Task removed: " + tempTask.getClass().getSimpleName());
            return tempTask;
        }
        else{
            throw new RuntimeException("Queue is empty, can't remove an element from an empty container!!");
        }
    }

    @Override
    public boolean isFull() {
        return rear == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

}
