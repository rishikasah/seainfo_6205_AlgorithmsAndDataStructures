package midterm;

public class TreNode {

    public int val;
    public TreNode left, right, parent;

    public TreNode(int d) {
        val = d;
        left = right = parent = null;
    }
}
