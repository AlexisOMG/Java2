public class Fibonacci implements Comparable<Fibonacci> {
    private int number, nearFib, dist;
    public Fibonacci(int numb) {
        this.number = numb;
    }
    public int getNearFib() {
        return this.nearFib;
    }
    public int getDist() {
        return this.dist;
    }
    public int searchDist() {
        int a = 0, b = 1;
        while (b <= this.number) {
            int c = a + b;
            a = b;
            b = c;
        }
        if (Math.abs(this.number - a) < Math.abs(this.number - b)) {
            this.nearFib = a;
        }
        else {
            this.nearFib = b;
        }
        this.dist = Math.min(Math.abs(this.number - a), Math.abs(this.number - b));
        return Math.min(Math.abs(this.number - a), Math.abs(this.number - b));
    }
    public int compareTo(Fibonacci obj) {
        return this.searchDist() - obj.searchDist();
    }
    public String toString() {
        return String.valueOf(this.number);
    }
}
