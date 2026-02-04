```java

package pract7;
import java.util.Scanner;
import pract5.DateTime;

public class Test7 {

    /* NO OBJECTS INITIALIZED */
    private Test7() { } 
    
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner(System.in);    
        Calendar c = new Calendar();
                
        DateTime start = new DateTime(18, 0, 16, 3, 2024);
        DateTime end = new DateTime(21, 0, 20, 3, 2024);
        Event e = new Event(start, end, "CIRQUE DU SOLEIL", 500, Event.SHOW);        
        boolean res = c.add(e);
        
        start = new DateTime(8, 30, 29, 11, 2024);
        end = new DateTime(13, 30, 29, 11, 2024);
        e = new Event(start, end, "JIDINF'24", 250, Event.CONGRESS);        
        res = c.add(e);
        
        start = new DateTime(9, 0, 1, 1, 2024);
        end = new DateTime(20, 30, 6, 1, 2024);
        e = new Event(start, end, "PLAYMOBIL", 650, Event.EXHIBITION);        
        res = c.add(e);
        
        System.out.println("\nThere are " + c.getNumEvents() + " events in the calendar");
        
        int opc;
        do {
            opc = menu(kbd);
            switch (opc) {
                case 1: 
                    addEvent(c, kbd); 
                    System.out.println("\nThere are " + c.getNumEvents() + " events in the calendar");
                    break;                        
                case 2: 
                    deleteEvent(c, kbd);
                    System.out.println("\nThere are " + c.getNumEvents() + " events in the calendar");
                    break; 
                case 3:    
                    showAllEvents(c, kbd);        
                    break;       
                case 4:
                    showTopEvent(c, kbd);
                    break;
                case 5:
                    showEventType(c, kbd);
                    break;    
                default: 
                    System.out.println("\n*** Bye ***");
            }
        } while (opc != 0); 
    }
    
    /* ------------------------------------------------------------------------ */
    /*
     * Muestra por pantalla un menú con las operaciones que
     * se pueden realizar en un calendario. */
    private static int menu(Scanner t) {
        int opc;
        do {
            System.out.println("\n*********** CALENDAR ***********");
            System.out.println(" 1. Add event");
            System.out.println(" 2. Delete event");
            System.out.println(" 3. Show all events");
            System.out.println(" 4. Show event with most tickets on sale");
            System.out.println(" 5. Show events of certain type");
            System.out.println(" 0. Finish");
            System.out.println("********************************");
            System.out.print("Choose an option: ");
            opc = t.nextInt();
            t.nextLine();
            if (opc < 0 || opc > 5) {
                System.out.println("\nIncorrect option.\n");
            }
        } while (opc < 0 || opc > 5);
        return opc;
    }
    
    /* ------------------------------------------------------------------------ */
    /**
     * Menú con los tipos de eventos 
     * que se pueden encontrar en un calendario.*/
    private static int typeMenu(Scanner t) {
        int opc;
        do {
            System.out.println("\nType:");
            System.out.println(" 1. Congress");
            System.out.println(" 2. Show");
            System.out.println(" 3. Exhibition");            
            System.out.print("Choose an option: ");
            opc = t.nextInt();
            t.nextLine();
            if (opc < 1 || opc > 3) {
                System.out.println("\nIncorrect option.\n");
            }
        } while (opc < 1 || opc > 3);
        return opc;
    }
    
    /* ------------------------------------------------------------------------ */
    /* TO STRING METHOD */
    private static String getStringType(int type) { 
        String res = "";
        switch (type) {
            case Event.CONGRESS: 
                res += "congress"; break;
            case Event.SHOW: 
                res += "show"; break; 
            default:
                res += "exhibition";
        }
        return res;    
    }
    
    /* ------------------------------------------------------------------------ */
    /**
     * Método que AÑADE UN EVENTO al calendario dado. */ 
    private static void addEvent(Calendar c, Scanner kbd) {
        System.out.print("\nTitle? ");
        String title = kbd.nextLine().toUpperCase();
        
        int num; 
        do {
            System.out.print("\nTickets on sale? ");
            num = kbd.nextInt();
            kbd.nextLine();
            if (num < 1) {
                System.out.println("\nIncorrect value.\n");
            }
        } while (num < 1);
        
        int type = typeMenu(kbd);
        
        DateTime start = new DateTime(4, 7, 2023), end = new DateTime(4, 7, 2023); 
        boolean isCorrect, isPosterior;
        System.out.println("\nStart date:");
        do {
            System.out.print("Day? ");
            int day = kbd.nextInt();
            System.out.print("Month? ");
            int month = kbd.nextInt();
            System.out.print("Year? ");
            int year = kbd.nextInt();
            System.out.print("Hours? ");
            int hours = kbd.nextInt();
            System.out.print("Minutes? ");
            int minutes = kbd.nextInt();
            kbd.nextLine();    
            isCorrect = DateTime.isCorrect(hours, minutes, day, month, year);
            if (isCorrect) { start = new DateTime(hours, minutes, day, month, year); }
            else { System.out.println("\nStart date is incorrect.");}
        } while (!isCorrect);
        
        System.out.println("\nEnd date (posterior to " + start + "):");
        do {
            System.out.print("Day? ");
            int day = kbd.nextInt();
            System.out.print("Month? ");
            int month = kbd.nextInt();
            System.out.print("Year? ");
            int year = kbd.nextInt();
            System.out.print("Hours? ");
            int hours = kbd.nextInt();
            System.out.print("Minutes? ");
            int minutes = kbd.nextInt();
            kbd.nextLine();    
            isCorrect = DateTime.isCorrect(hours, minutes, day, month, year);
            end = new DateTime(hours, minutes, day, month, year);
            isPosterior = start.compareTo(end) < 0;
            if (!isCorrect || !isPosterior) { 
                System.out.println("\nEnd date is incorrect or no posterior to start date.");
            }
        } while (!isCorrect || !isPosterior);
        
        Event e = new Event(start, end, title, num, type);        
        if (c.add(e)) { System.out.println("\nAdded event."); }
        else { System.out.println("\nFailed to add."); }
    }
    
    /* ------------------------------------------------------------------------ */
    /**
     * Método que ELIMINA UN EVENTO del calendario dado. */ 
    private static void deleteEvent(Calendar c, Scanner kbd) {
        System.out.print("\nTitle? ");
        String title = kbd.nextLine().toUpperCase();             
        if (c.delete(title)) { System.out.println("\nDeleted event."); }
        else { System.out.println("\nFailed to delete."); }
    }  
    
    /* ------------------------------------------------------------------------ */
    /**
     * Método que muestra TODOS LOS ELEMENTOS DEL CALENDARIO dado. */ 
    private static void showAllEvents(Calendar c, Scanner kbd) {
        String res = c.toString();
        if (res.equals("")) { System.out.println("\nThere are no events."); }
        else { System.out.println("\n" + res); }
    }
    
    /* ------------------------------------------------------------------------ */
    /**
     * Método que muestra el EVENTO MÁS LARGO de un calendario dado. */ 
    private static void showTopEvent(Calendar c, Scanner kbd) {  
        if (c.getNumEvents() == 0) { System.out.println("\nThere are no events."); }
        else {
            Event res = c.getTopEvent();
            System.out.println("\n" + res.toString());            
        }
    }
    
    /* ------------------------------------------------------------------------ */
    /**
     * Método que muestra los EVENTOS DE UN TIPO DETERMINADO del calendario dado. */ 
    private static void showEventType(Calendar c, Scanner kbd) {
        int type = typeMenu(kbd);
        Event[] aux = c.filterByType(type);
        if (aux.length == 0) { System.out.println("\nThere are no " + getStringType(type) + "-type events."); }
        else {
            System.out.println();
            for (int i = 0; i < aux.length; i++) {
                System.out.println(aux[i].toString()); 
            }
        }
    }
}
```