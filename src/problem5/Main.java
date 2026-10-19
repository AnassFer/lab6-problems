package problem5;

public class Main {
    public static void main(String[] args) {
        BookQueue queue = new BookQueue();
        BookStack stack  = new BookStack();

        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 2008);

        System.out.println("=== Stack Test ===");

        stack.push(b1);
        stack.push(b2);
        stack.push(b3);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());

        stack.display();

        System.out.println("=== Queue Test ===");

        queue.enqueue(b1);
        queue.enqueue(b2);
        queue.enqueue(b3);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());

        queue.display();
    }

}
