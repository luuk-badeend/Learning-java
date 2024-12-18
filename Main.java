
public class Main {
    public static void main(String args[]) {
        User usr = new User();
        boolean exit = false;
        while (exit == true) {
            TaskManager taskManager = new TaskManager();
            String command = Helper.getString("Command: ");
            switch (command) {
                case "exit" -> exit = true;
                case "add" -> taskManager.addTasks();
                case "ls" -> taskManager.listTasks();
                case "rm" -> taskManager.deleteTask();
            }
        }
    }
}