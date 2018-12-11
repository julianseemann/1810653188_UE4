
import java.util.Date;

public class Aufruf
{
    public static void main (String[]args)
    {
        Date datum = new Date(118, 9, 2, 14, 9, 54 ); //(year + 1900, month, date, hrs, min, sec)
        Book EinBuch = new Book (200, datum, "My Book", "isbn");

        System.out.println("Das Buch hat " + EinBuch.getPages() + " Seiten, wurde am " + EinBuch.getReleased() + " veröffentlicht und hat den Titel " + EinBuch.getTitle());
    }
}
