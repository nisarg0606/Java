package assign1;

import java.util.LinkedList;

public class PriorityQueue<E extends Comparable<E>> {
    private LinkedList<E> list;

    public PriorityQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(E item) {
        int index = 0;
        for (E current : list) {
            System.out.println(current.compareTo(item));
            /*
             * returns 1 if item is less than the compared item (eg. current = 1 and item = 0)
             * return 0 if both are same (eg. current = 0 and item = 0)
             * returns -1 if item is greater than the compared item (eg. current = 3 and item = 5)
             */
            if (current.compareTo(item) < 0) {
                break;
            }else if(current.compareTo(item) == 0){
                list.remove(index);
                break;
            }
            index++;
        }
        list.add(index, item);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.enqueue(3);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
