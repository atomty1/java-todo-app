public class NewTodo {
    String task;
    boolean done;
    public NewTodo(String task) {
        this.task = task;
        this.done = false;
    }
    public void completed(){
        this.done = true;
    }

    @Override
    public String toString() {
        return "task='" + task + '\'' +
                ", done=" + done;
    }

    public void setTask(String task) {
        this.task = task;
    }



}
