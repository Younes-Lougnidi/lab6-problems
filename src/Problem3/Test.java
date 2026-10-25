package Problem3;

import javax.print.Doc;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of documents in the library: ");
        n = scanner.nextInt();
        Library lib = new Library(n);
        Book book = new Book("Crime and Punishment","Fyodor Dostoevsky" , 1000,lib);
        Magazine mag = new Magazine("The politician", lib,"july",2015);
        lib.add(book);
        lib.add(mag);
        String cont = "y";
        while(cont.equals("y")){
            System.out.println("The library Menu: ");
            System.out.println("1. Add a document to the library");
            System.out.println("2. display the documents of the library");
            System.out.println("3. delete a document from the library");
            System.out.println("4. Search the library by the record number");
            System.out.println("5. display all the authors of the library");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter which type of document you want to add: ");
                    String type = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    Document newDoc = null;
                    switch (type){
                        case "book":
                            System.out.print("Enter the author: ");
                            String bAuthor = scanner.nextLine();
                            System.out.print("Enter the number of pages: ");
                            int bPages = scanner.nextInt();
                            scanner.nextLine();
                            newDoc = new Book(title, bAuthor, bPages,lib);
                            break;

                        case "novel":
                            System.out.print("Enter the author: ");
                            String nAuthor = scanner.nextLine();
                            System.out.print("Enter the number of pages: ");
                            int nPages = scanner.nextInt();
                            System.out.print("Enter the price: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine();
                            newDoc = new Novel(title, nAuthor, nPages, lib,price);
                            break;

                        case "textbook":
                            System.out.print("Enter the author: ");
                            String tAuthor = scanner.nextLine();
                            System.out.print("Enter the number of pages: ");
                            int tPages = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter the academic level: ");
                            String level = scanner.nextLine();
                            newDoc = new Textbook(title, tAuthor, tPages,lib, level);
                            break;

                        case "magazine":
                            System.out.print("Enter the month: ");
                            String month = scanner.nextLine();
                            System.out.print("Enter the year: ");
                            int year = scanner.nextInt();
                            scanner.nextLine();
                            newDoc = new Magazine(title,lib, month, year);
                            break;

                        case "dictionary":
                            System.out.print("Enter the language: ");
                            String language = scanner.nextLine();
                            newDoc = new Dictionary(title,lib, language);
                            break;

                        default:
                            System.out.println("Invalid document type!");
                            break;
                    }
                    if (newDoc != null) {
                        if (lib.add(newDoc)) {
                            System.out.println("Document added successfully!");
                        } else {
                            System.out.println("Failed to add document.");
                        }
                    }
                    break;
                case 2 :
                    lib.displayDocuments();
                    break;

                case 3 :
                    System.out.print("Enter the record number of the document you want to delete: ");
                    int numRec = scanner.nextInt();
                    scanner.nextLine();
                    Document doc = lib.document(numRec);
                    lib.delete(doc);
                    break;
                case 4:
                    System.out.print("Enter the record number of the document you want: ");
                    int numRec2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(lib.document(numRec2));
                    break;
                case 5 :
                    lib.displayAuthors();
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;

            }
            System.out.print("\nDo you want to continue?(y/n) ");
            cont = scanner.nextLine();
        }
    }
}
