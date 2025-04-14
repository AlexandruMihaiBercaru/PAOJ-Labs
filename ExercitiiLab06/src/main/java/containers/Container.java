package containers;

import tasks.Task;

public interface Container extends Task {

    void addElem(Task task);

    Task removeElem();

}
