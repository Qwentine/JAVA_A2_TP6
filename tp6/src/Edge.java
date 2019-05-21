public class Edge {

    private int from;
    private int to;
    private int length;

    public Edge(int from, int to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public int getNeighbourIndex(int nodeIndex) {
        if (this.from == nodeIndex) {
            return this.to;
        } else {
            return this.from;
        }
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}