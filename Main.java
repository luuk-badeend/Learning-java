
import java.util.ArrayList;

public class Main {
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String args[]) {
        boolean exit = false;
        while (exit != true) {
            String cm = Helper.getString("Command: ");
            switch (cm) { // swtich case syntax :D
                case "exit" -> exit = true;
                case "add" -> tasks = Task.addTasks(tasks);
                case "ls" -> listTasks();
                case "rm" -> tasks = Task.deleteTask(tasks);
            }
        }
    }

    static void listTasks() {
        listTasks("List is empty.");
    }

    static void listTasks(String message) {
        if (tasks.isEmpty()) {
            System.out.println(message);
        } else {
            int i = 0;
            for (Task task : tasks) {
                System.out.print(i + ": ");
                task.showTitle();
                i++;
            }
        }
    }
}