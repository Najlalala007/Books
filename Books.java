public class Books {
    private String Author;
    private String Title;
    private double Price;
    private int publisherNumber;

    public Books(String Author, String Title, double Price, int publisherNumber) {
        this.Author = Author;
        this.Title = Title;
        this.Price = Price;
        this.publisherNumber = publisherNumber;
    }

    public double getPrice() {
        return Price;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public int getPublisherNumber() {
        return publisherNumber;
    }

}
