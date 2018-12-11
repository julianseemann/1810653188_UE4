
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main (String[]args) {
        Date datum = new Date(118, 9, 2, 14, 9, 54); //(year + 1900, month, date, hrs, min, sec)
        Book EinBuch = new Book(200, datum, "My Book", "isbn");

        System.out.println("Das Buch hat " + EinBuch.getPages() + " Seiten, wurde am " + EinBuch.getReleased() + " veröffentlicht und hat den Titel " + EinBuch.getTitle());


        //Aufgabe 4
        List<Book> lieblingsbuecher = new ArrayList<>();

        lieblingsbuecher.add(new Book(200, datum, "My Book 1", "125215-12521-73473"));
        lieblingsbuecher.add(new Book(200, datum, "My Book 2", "6437-623623-24254"));
        lieblingsbuecher.add(new Book(200, datum, "My Book 3", "26326-734737-732473"));
        lieblingsbuecher.add(new Book(200, datum, "My Book 4", "745854-124412-3487438348"));
        lieblingsbuecher.add(new Book(200, datum, "My Book 5", "672-5236236-123483475125"));

        for (Book item:lieblingsbuecher)
        {
            System.out.println(item.getTitle()+ " hat "+ item.getPages()+ " Seiten und folgende ISBN: "+item.getIsbn());
        }

    }
}
