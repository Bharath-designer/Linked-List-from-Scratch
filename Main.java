public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.addLast(4);
        list.addLast(5);

        list.removeFirst();

        list.removeLast();

    }
}
