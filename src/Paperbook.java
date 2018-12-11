import java.util.Date;

public class Paperbook extends Book
{
    private String series;
    private String month;


    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public String getMonth()
    {
        return month;
    }

    public void setmonth(String month)
    {
        this.month = month;
    }


    public Paperbook(int pages, Date released, String title, String isbn, String series, String month)
    {
        super (pages, released, title, isbn); //mit super wird Konstruktor der Basisklasse aufgerufen (Vererbung)
        this.series = series;
        this.month = month;
    }



}
