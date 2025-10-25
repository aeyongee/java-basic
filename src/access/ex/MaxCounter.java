package access.ex;

public class MaxCounter {
    int count;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (validMax(count)) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    private boolean validMax(int count) {
        return count >= max;
    }

    public int getCount() {
        return count;
    }
}
