package main.java.com.pareekshit.scaler.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            insert_node(i + 1, i + 1);
        }*/
        insert_node(1, 23);
        insert_node(2, 24);
        print_ll();
        System.out.println();
        delete_node(1);
        print_ll();
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static int length = 0;

    public static void insert_node(int position, int value) {
        Node temp = head, prev = null;
        if (position == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            length++;
            return;
        }
        int count = 1;
        while (temp != null && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(value);
        newNode.next = temp;
        prev.next = newNode;
        length++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        Node temp = head, prev = null;
        if (position == 1) {
            head = head.next;
            length--;
            return;
        }
        int count = 1;
        while (temp != null && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (prev != null && temp != null) {
            prev.next = temp.next;
            length--;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        if (temp == null) {
            return;
        }
        int count = 1;
        while (temp != null) {
            if (count == length) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
            count++;
        }
    }


    /*public static void insert_node(int position, int value) {
        Node nn=new Node(value);
        Node temp=head;
        if(position==1)
        {
            nn.next=head;
            head=nn;
        }else{
            for(int i=1;i<position-1;i++)
            {
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }

    public static void delete_node(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null)
                temp.next = temp.next.next;
        }
    }

    public static void print_ll() {
        Node temp = head;
        if(temp==null) return;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }*/
}

