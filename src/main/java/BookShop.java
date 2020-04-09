import english.EnglishBook;
import english.EnglishDepth;
import english.EnglishFactory;

public class BookShop {

    public static void main(String[] args) {
        EnglishBook book = EnglishFactory.getEnglishBookInstance(EnglishDepth.MEDIUM);
        book.read();
    }
}