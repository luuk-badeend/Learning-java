
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TaskManager {
    int nextId;
    ArrayList<Task> tasks;

    TaskManager() {
        nextId = 1;
        tasks = new ArrayList<>();
    }

    public Task getTask(int id) {
        for (Task task : tasks) {
            if (id == task.id) {
                return task;
            }
        }
        throw new NoSuchElementException("Task does not exist");
    }

    public void listTasks() {
        listTasks("List is empty.");
    }

    public void listTasks(String message) {
        if (tasks.isEmpty()) {
            System.out.println(message);
        } else {
            for (Task task : tasks) {
                System.out.print(task.id + ": ");
                task.showTitle();
            }
        }
    }

    public void addTasks() {
        int amount = Helper.getInt("Amount of tasks: ");

        for (int i = 0; i < amount; i++) {
            String taskName = Helper.getString("Task name " + (i + 1) + ": ");
            Task newTask = new Task(nextId, taskName);
            nextId++;
            tasks.add(newTask);
        }
    }

    public boolean taskExists(int i) {
        for (Task task : tasks) {
            if (i == task.id) {
                return true;
            }
        }
        return false;
    }

    public void deleteTask() {
        if (tasks.isEmpty()) {
            listTasks("Nothing to delete");
        } else {
            listTasks();
            int id = Helper.getInt("ID to delete: ");
            if (taskExists(id)) {
                Task taskToDelete = getTask(id);
                System.out.println("Deleting task: " + taskToDelete.title);

                tasks.removeIf(task -> task.id == taskToDelete.id);
            } else {
                System.out.println("Task ID: " + id + " does not exist");
            }
        }
    }
}