package buoi5bt;

public class BookManagement {
    private int n;
    private Book[] books;

    public BookManagement(Book[] books) {
        this.books = books;
        this.n = this.books.length;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int demBestSeller() {
        int d = 0;
        for (int i = 0; i < n; i++) {
            if(books[i].bestSeller() == true) {
                ++d;
            }
        }
        int demBestSeller = d;
        return demBestSeller;
    }

    public Book topBestSeller() {
        long max = 0;
        Book topBestSeller = null;
        for (int i = 0; i < n; i++) {
            if (books[i].bestSeller() == true) {
                if (max < books[i].getTotalSold()) {
                    max = books[i].getTotalSold();
                   topBestSeller = books[i];
                }
            }
        }
        return topBestSeller;
    }

}
