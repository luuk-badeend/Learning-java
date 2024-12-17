
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
}
