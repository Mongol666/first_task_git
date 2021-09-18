package task;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return first_number == task.first_number &&
                second_number == task.second_number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_number, second_number);
    }


    private void setSecond_number(int second_number) {
        this.second_number = second_number;

        private void setFirst_number ( int first_number){
            this.first_number = first_number;
        }
    }
}
