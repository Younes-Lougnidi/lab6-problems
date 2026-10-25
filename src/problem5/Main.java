package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Stack Test ===");
        Book b1 = new Book("Clean Code", "Rober C.Martin" , 2008);
        Book b2 = new Book("1984","George Orwell",1949);
        Book b3 = new Book("The Hobbit","J.R.R",1937);
        BookStack bookStack = new BookStack();
        bookStack.push(b3);
        bookStack.push(b2);
        bookStack.push(b1);
        bookStack.display();
        System.out.println("Popped: " + bookStack.pop());
        System.out.println("Top: " + bookStack.peek());
        bookStack.display();
        System.out.println("=== Queue Test ===");
        BookQueue bookQueue = new BookQueue();
        bookQueue.enqueue(b3);
        bookQueue.enqueue(b2);
        bookQueue.enqueue(b1);
        bookQueue.display();
        System.out.println("Dequeued: " + bookQueue.dequeue());
        System.out.println("Front: " + bookQueue.peek());
        bookQueue.display();

    }
}
