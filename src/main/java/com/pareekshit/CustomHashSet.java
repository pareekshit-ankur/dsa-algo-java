package main.java.com.pareekshit;

public class CustomHashSet {
    SingleLinkedList head = new SingleLinkedList(1);

    public <T> void add(T n) {
        SingleLinkedList temp = head;
        boolean isPresent = false;
        while (!isPresent && temp.next != null) {
            if (temp.data.equals(n)) isPresent = true;
            temp = temp.next;
        }
        if (!isPresent) {
            SingleLinkedList node = new SingleLinkedList(n);
            node.next = null;
            temp.next = node;
        }
    }

    public <T> void remove(T n) {
        SingleLinkedList previous;
        SingleLinkedList current = head;
        while (current.next != null) {
            previous = current;
            if (current.data == n) {
                previous.next = current.next;
            }
            current = current.next;
        }

    }

}

class SingleLinkedList<T> {
    T data;
    SingleLinkedList next;

    public SingleLinkedList(T data) {
        this.data = data;
    }
}
