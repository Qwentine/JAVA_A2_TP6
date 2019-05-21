import java.util.ArrayList;

public class DijkstraSP {
    private boolean[] marked;
    private int[] previous;
    private int[] distance;
    private int VERTICES;

    public void verifyNonNegative(Graph weightedGraph) {

    }

    public void DikstraSP (WGraph weightedGraph, int rootVertex) {
        weightedGraph.getNodes()[rootVertex].setDistanceFromSource(0);
        int nextNode = 0;

        for (int i = 0; i < weightedGraph.getNodes().length; i++) {
            Edge[] currentNodeEdges = weightedGraph.getNodes()[nextNode].getEdges();

            for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) {
                int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);

                if (!weightedGraph.getNodes()[neighbourIndex].isVisited()) {
                    int tentative = weightedGraph.getNodes()[nextNode].getDistanceFromSource() + currentNodeEdges.get(joinedEdge).getLength();

                    if (tentative < weightedGraph.getNodes()[neighbourIndex].getDistanceFromSource()) {
                        weightedGraph.getNodes()[neighbourIndex].setDistanceFromSource(tentative);
                    }
                }
            }

        }

    }

    public boolean hasPathTo (int vertex) {
        return false;
    }

    public int distTo (int vertex) {
        return 0;
    }

    public boolean[] getMarked() {
        return marked;
    }

    public void setMarked(boolean[] marked) {
        this.marked = marked;
    }

    public int[] getPrevious() {
        return previous;
    }

    public void setPrevious(int[] previous) {
        this.previous = previous;
    }

    public int[] getDistance() {
        return distance;
    }

    public void setDistance(int[] distance) {
        this.distance = distance;
    }

    public int getVERTICES() {
        return VERTICES;
    }

    public void setVERTICES(int VERTICES) {
        this.VERTICES = VERTICES;
    }
}
