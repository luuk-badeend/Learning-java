import java.util.ArrayList;

public class Task {
    String title;

    public Task(String newTitle) {
        title = newTitle;
    }

    public void showTitle() {
        System.out.println(title);
    }

    public static ArrayList<Task> addTasks(ArrayList<Task> tasks) {
        int amount = Helper.getInt("Amount of tasks: ");

        for (int i = 0; i < amount; i++) {
            String taskName = Helper.getString("Task name " + (i + 1) + ": ");
            tasks.add(new Task(taskName));
        }

        return tasks;
    }

    public static ArrayList<Task> deleteTask(ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            Main.listTasks("Nothing to delete");
        } else {
            Main.listTasks();
            int i = Helper.getInt("ID to delete: ");
            if (i >= 0 && i <= tasks.size()) {
                System.out.println("Deleting task: " + tasks.get(i).title);
                tasks.remove(i);
            } else {
                System.out.println("Task ID: " + i + " does not exist");
            }

        }

        return tasks;
    }
}
