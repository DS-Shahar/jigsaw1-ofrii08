class Main {
  package recursion;

public class RemoveDuplicates {

    public static Node<Integer> removeDuplicates(Node<Integer> l) {
        if (l == null) {
            return null; }

        Node<Integer> current = l;  
        while (current != null) {
            Node<Integer> runner = current;  
            while (runner.getNext() != null) {
                if (current.getValue().equals(runner.getNext().getValue())) {
                    runner.setNext(runner.getNext().getNext());  
                } else {
                    runner = runner.getNext();  
                }
            }
            current = current.getNext();  
        }
        return l; 
    }

   public static Node<Integer> removeEvenPositions(Node<Integer> l) {
        if (l == null || l.getNext() == null) {
            return l;  
        }

        Node<Integer> current = l;
        Node<Integer> prev = null;

        int position = 1;

        while (current != null) {
            if (position % 2 == 0) {  
                if (prev != null) {
                    prev.setNext(current.getNext());  
                }
            } else {
                prev = current;  
            }

            current = current.getNext();  
            position++;  
        }
        return l;
    }


    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(7);
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(1);
        Node<Integer> c = new Node<>(2);
        Node<Integer> d = new Node<>(1);

        l1.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        Node<Integer> result = removeDuplicates(l1);
        printList(result);
    }

    public static void printList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("None");
    }
   Node<Integer> l1 = new Node<>(7);
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);

        l1.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        Node<Integer> result = removeEvenPositions(l1);
        printList(result);
    }

    public static void printList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("None");
    }
}
}


