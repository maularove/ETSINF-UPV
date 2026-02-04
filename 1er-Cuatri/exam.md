```java

public class Reservations24 {

    public static final int MAX_DAYS_IN_YEAR = 366;
    private Reservation[] schedule;
    private int[] numPerType;

    public Reservations24() {
        schedule = new Reservation[MAX_DAYS_IN_YEAR + 1];
        numPerType = new int[3];
    }

    public boolean addReservation(Reservation r) {
        for(i = 1; i < schedule.lenght; i++) {
            if (schedule[i].getDayOfYear().equals(r.getDayOfYear()) && r.getDt().getYear() == 2024) {
                return false;
            } else {
                schedule[i] = r;
                numPerType[i] = r;
                return true;
            }
        }   
    }

    public boolean removeReservation(int day) {
            if ( day >= 1 && day < MAX_DAYS_IN_YEAR && schedule[i].getDayOfYear().equals(day)) {
                schedule[day] = null;
                numPerType[schedule[day].getType()]--;
                return true
            }
        return false:
        }
    }
```