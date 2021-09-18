package task;

public class Task {
    private int first_number;
    private int second_number;

    public Task() {
    }

    public Task(int first_number) {
        this.first_number = first_number;
    }

    public Task(int first_number, int second_number) {
        this(first_number);
        this.second_number = second_number;
    }

    @Override
    public String toString() {
        return "Task{" +
                "first_number=" + first_number +
                ", second_number=" + second_number +
                '}';
    }
}
