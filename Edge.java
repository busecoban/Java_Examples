import java.util.Objects;

class Edge {
    public final int fromNode;
    public final int toNode;

    Edge(int fromNode, int toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    public int getFromNode() {
        return fromNode;
    }

    public int getToNode() {
        return toNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return fromNode == edge.fromNode && toNode == edge.toNode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromNode, toNode);
    }

    @Override
    public String toString() {
        return "From node : " + fromNode + " To node: " + toNode;
    }

    public int compareTo(Edge edge2) {
        if (edge2.fromNode == fromNode) {
            return Integer.compare(edge2.toNode, toNode);
        }
        return Integer.compare(edge2.fromNode, fromNode);
    }

    public static Edge createEdge(int fromNode, int toNode) {
        return new Edge(fromNode, toNode);
    }
}