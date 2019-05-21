import java.util.ArrayList;

public class Node<T> {

    private int name;
    private int distanceFromSource = Integer.MAX_VALUE;
    private boolean visited;
    private T[] edges; // now we must create edges

    public boolean isVisited() {
        return visited;
    }

    public int getDistanceFromSource() {
        return distanceFromSource;
    }

    public void setDistanceFromSource(int distanceFromSource) {
        this.distanceFromSource = distanceFromSource;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public T[] getEdges() {
        return edges;
    }

    public void setEdges(T[] edges) {
        this.edges = edges;
    }

}