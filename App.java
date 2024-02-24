public class App {
    public static void main(String[] args) {
        // Book objects
        Books book1 = new Books("Multatuli", "Max Havelaar", 83.99, 342);
        Books book2 = new Books("Murray Stein", "Jungs Map of The Soul", 72.50, 876);
        Books book3 = new Books("Sohn Won Pyung", "Almond", 88.50, 732);
        Books book4 = new Books("Toshikazu Kawaguchi", "Funiculi Funicula", 79.50, 227);
        Books book5 = new Books("Baek Se Hee", "I want To Die But I Want To Eat Tteokpokki", 99.90, 560);
        
        // Array of books
        Books[] booksArray = {book1, book2, book3, book4, book5};

        // Calculating total Price of all books
        double totalPrice = 0;
        for (Books book : booksArray) {
            totalPrice += book.getPrice();
        }

        // Output total Price
        System.out.println("Total Price of all books: $" + totalPrice);
    }
}
