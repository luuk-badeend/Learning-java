
import java.util.ArrayList;

public class Main {
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String args[]) {
        boolean exit = false;
        TaskManager taskManager = new TaskManager();
        while (exit != true) {
            String command = Helper.getString("Command: ");
            switch (command) { // swtich case syntax :D
                case "exit" -> exit = true;
                case "add" -> taskManager.addTasks();
                case "ls" -> taskManager.listTasks();
                case "rm" -> taskManager.deleteTask();
            }
        }
    }
}