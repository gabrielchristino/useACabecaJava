class Books {
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books(); // Create a new Books object
        myBooks[0].title = "The Grapes of Java";
        myBooks[0].author = "Bob";

        myBooks[1] = new Books(); // Create a new Books object
        myBooks[1].title = "The Java Gatsby";
        myBooks[1].author = "Sandy";

        myBooks[2] = new Books(); // Create a new Books object
        myBooks[2].title = "The Java Cookbook";
        myBooks[2].author = "James";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
