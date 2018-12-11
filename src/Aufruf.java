
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

        for (Book a:lieblingsbuecher)
        {
            System.out.println(a.getTitle()+ " hat "+ a.getPages()+ " Seiten und folgende ISBN: "+a.getIsbn());
        }


        //Aufgabe 5
        List<Paperbook> papierbuecher = new ArrayList<>();
        papierbuecher.add(new Paperbook(200, datum, "My Paperbook 1", "0000-000000-0000","...", "April"));
        papierbuecher.add(new Paperbook(210, datum, "My Paperbook 2", "0000-000000-0000","...", "April"));
        papierbuecher.add(new Paperbook(240, datum, "My Paperbook 3", "0000-000000-0000","...", "January"));
        papierbuecher.add(new Paperbook(100, datum, "My Paperbook 4", "0000-000000-0000","...", "March"));
        papierbuecher.add(new Paperbook(140, datum, "My Paperbook 5", "0000-000000-0000","...", "October"));

        for (Paperbook b:papierbuecher)
        {
            System.out.println(b.getTitle()+ " hat "+ b.getPages()+" Seiten und folgende ISBN: "+ b.getIsbn()+ " zusätzlich ist es im Monat "+b.getMonth()+" erschienen");
        }
    }
}
