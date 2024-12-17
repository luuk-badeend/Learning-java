
public class Task {
    int id;
    String title;

    public Task(int setId, String setTitle) {
        id = setId;
        title = setTitle;
    }

    public void showTitle() {
        System.out.println(title);
    }

    public int getId() {
        return id;
    }

    

    // public static ArrayList<Task> editTask(ArrayList<Task> tasks) {
    //     int i = Helper.getInt("ID to edit: ");
    //     for (Task task : tasks) {
    //         task.
    //     }
    //     // check if task exist
    //     // edit task
    //     // add to tasks 
    //     return tasks;
    // }
}
