package oving1.UpOrDownCounter;

public class UpOrDownCounter {
    private int start;
    private int end;
    // private int current;

    public UpOrDownCounter(int start, int end) {
        if (start == end) {
            throw new IllegalArgumentException("start and end is the same.");
        }

        this.start = start;
        this.end = end;
    };

    public int getCounter() {
        return this.start;
    };

    public boolean count() {
        if (start == end) {
            return false;
        } else if (start < end) {
            this.start += 1;
            return true;

        } else {
            this.start -= 1;
            return true;
        }
    };



    public static void main(String[] args) {
        UpOrDownCounter newCounter = new UpOrDownCounter(20, 10);
        
        // Printing the counter:
        System.out.println(newCounter.getCounter());
        while(newCounter.count()){
            System.out.println(newCounter.getCounter());
        }
    }

}
