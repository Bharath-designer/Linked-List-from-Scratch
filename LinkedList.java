import java.util.NoSuchElementException;

public class LinkedList {

    //creating a node
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    //inserting a new node at the end
    public void addLast(int item){
        Node node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
    }

    //inserting a new node at the beginning
    public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty()){
            head = tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    //removing the first item from the linked list
    public void removeFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        if (head == tail){
            head = tail = null;
            return;
        }

        var second = head.next;
        head.next = null;
        head = second;
    }

    //removing the last item from the linked list
    public void removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        if (head == tail){
            head = tail = null;
            return;
        }

        var previous = getPreviousNode(tail);
        tail = previous;
        tail.next = null;
    }

    //getting the index of an item in the linked list
    public int indexOf(int item){
        int index = 0;
        var current = head;
        while (current!=null){
            if (current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return  -1;
    }

    //check if the given item is in the list
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    private Node getPreviousNode(Node node){
        var current = head;
        while (current!= null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return head == null;
    }
}


