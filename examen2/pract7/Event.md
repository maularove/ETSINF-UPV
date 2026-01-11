```java

package pract7;
import pract5.DateTime;

public class Event {
    public static final int CONGRESS = 1, SHOW = 2, EXHIBITION = 3;    
    private String title;
    private int type;
    private int ticketsOnSale;
    private DateTime startTime, endTime;

    /* ------------------------------------------------------------------------ */
    /* CONSTRUCTOR */
    public Event(DateTime start, DateTime end, String tit, int num, int type) {
        startTime = start;
        endTime = end;
        title = tit;
        ticketsOnSale = num;
        this.type = type;
    }
    
    /* GETTERS Y SETTERS */
    public DateTime getStartTime() { return startTime; }
    public DateTime getEndTime() { return endTime; }
    public String getTitle() { return title; }  
    public int getTicketsOnSale() { return ticketsOnSale; }
    public int getType() { return type; }  
    
    public void setStartTime(DateTime d) { startTime = d; }
    public void setEndTime(DateTime d) { endTime = d; }
    public void setTitle(String t) { title = t; }
    public void setTicketsOnSale(int n) { ticketsOnSale = n; }
    public void setType(int t) { type = t; }
        
    /* ------------------------------------------------------------------------ */    
    /* TO STRING METHOD */
    public String toString() {
        String res = title + " [" + ticketsOnSale + "]\n" + startTime + " - " + endTime + "\n";
        switch (type) {
            case CONGRESS: 
                res += "(CONGRESSES)\n"; break;
            case SHOW: 
                res += "(SHOWS)\n"; break; 
            default:
                res += "(EXHIBITIONS)\n";
        }
        return res;
    }
    
    /* ------------------------------------------------------------------------ */
    /* EQUALS METHOD */
    public boolean equals(Object o) {
        return o instanceof Event
            && title.equals(((Event) o).title)
            && type == ((Event) o).type
            && startTime.equals(((Event) o).startTime)
            && endTime.equals(((Event) o).endTime);
    }
    
    /* COMPARE TO METHOD */
    public int compareTo(Event e) {
        int res = this.getEndTime().compareTo(e.getStartTime()); 
        if (res < 0) { return res; }
        else {
            res = this.getStartTime().compareTo(e.getEndTime());
            if (res > 0) { return res; }
            else { return 0; }
        }
    }
}
```