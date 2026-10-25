package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        // insert your code here
        for(int i = 0 ; i < OPERATIONS ; i++) {
            list.add(random.nextInt(list.size()), random.nextInt());
            list.remove(random.nextInt(list.size()));
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();
        Random random = new Random();

        // Insertions at beginning and end

        // add your code here

        // Deletions at beginning and end

        // add your code here

        for(int i = 0 ; i < OPERATIONS ; i ++){
            if(list instanceof LinkedList<Integer>){
                ((LinkedList<Integer>) list).addFirst(random.nextInt());
                ((LinkedList<Integer>) list).addLast(random.nextInt());
                ((LinkedList<Integer>) list).removeFirst();
                ((LinkedList<Integer>) list).removeLast();
            }else{
                list.add(0,random.nextInt());
                list.add(random.nextInt());
                list.remove(0);
                list.remove(list.size()-1);
            }
        }
        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
        for(int i = 0; i < list.size() ; i++){
            sum += list.get(i);
        }
       // insert your code here

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

