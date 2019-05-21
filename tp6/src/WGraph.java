import java.util.ArrayList;

public class WGraph extends Graph<Node<Edge>, Edge, Integer> {
    public WGraph(Edge[] edges) {
        super();

        this.setEdges(edges);

        // create all nodes ready to be updated with the edges
        this.setNoOfNodes(calculateNoOfNodes());
        this.setNodes(new Node[this.getNoOfNodes()]);

        for (int n = 0; n < this.getNoOfNodes(); n++) {
            this.getNodes()[n] = new Node<Edge>();
        }

        // add all the edges to the nodes, each edge added to two nodes (to and from)
        this.setNoOfEdges(edges.length);

        for (int edgeToAdd = 0; edgeToAdd < this.getNoOfEdges(); edgeToAdd++) {
            this.getNodes()[edges[edgeToAdd].getFrom()].getEdges().push(edges[edgeToAdd]);
            this.getNodes()[edges[edgeToAdd].getTo()].getEdges().add(edges[edgeToAdd]);
        }
    }


    public int calculateNoOfNodes() {
        int noOfNodes = 0;

        for (Edge e : this.getEdges()) {
            if (e.getTo() > noOfNodes)
                noOfNodes = e.getTo();
            if (e.getFrom() > noOfNodes)
                noOfNodes = e.getFrom();
        }

        noOfNodes++;

        return noOfNodes;
    }

    public int getNodeShortestDistanced() {
        int nodeIndex = 0;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < this.getNodes().length; i++) {
            int currentDistance = this.getNodes()[i].getDistanceFromSource();

            if (!this.getNodes()[i].isVisited() && currentDistance < distance) {
                distance = currentDistance;
                nodeIndex = i;
            }
        }

        return nodeIndex;
    }

    public void printResult () {
        String output = "Number of nodes = " + this.getNoOfNodes();
        output += "\nNumber of edges = " + this.getNoOfEdges();

        for (int i = 0; i < this.getNodes().length; i++) {
            output += ("\nThe shortest distance from node 0 to node " + i + " is " + this.getNodes()[i].getDistanceFromSource());
        }

        System.out.println(output);
    }
}
