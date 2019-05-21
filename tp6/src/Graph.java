import java.util.ArrayList;

public abstract class Graph<N, E, T> {
    private N[] nodes;
    private T noOfNodes;
    private E[] edges;
    private T noOfEdges;

    public Graph() {
    }

    public abstract int calculateNoOfNodes();
    public abstract int getNodeShortestDistanced();
    public abstract void printResult();

    public N[] getNodes() {
        return nodes;
    }

    public void setNodes(N[] nodes) {
        this.nodes = nodes;
    }

    public T getNoOfNodes() {
        return noOfNodes;
    }

    public void setNoOfNodes(T noOfNodes) {
        this.noOfNodes = noOfNodes;
    }

    public E[] getEdges() {
        return edges;
    }

    public void setEdges(E[] edges) {
        this.edges = edges;
    }

    public T getNoOfEdges() {
        return noOfEdges;
    }

    public void setNoOfEdges(T noOfEdges) {
        this.noOfEdges = noOfEdges;
    }
}
