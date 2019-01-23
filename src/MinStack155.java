/**
 * Consider each node in the stack having a minimum value.
 */
public class MinStack155 {
    Node top = null;

    public void push(int x) {
        if (top == null) {
            top = new Node(x, x, null);
        } else {
            top = new Node(x, x < top.minValue ? x : top.minValue, top);
        }
    }

    public void pop() {
        top = top.next;
    }

    public Integer top() {
        return top.value;
    }

    public Integer getMin() {
        return top.minValue;
    }

    class Node {
        Integer value;
        Integer minValue;
        Node next;

        Node(Integer value, Integer minValue, Node next) {
            this.value = value;
            this.minValue = minValue;
            this.next = next;
        }
    }
}
