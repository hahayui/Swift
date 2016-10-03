


public class Task6 {
    
    public static void main(String[] args) {
       int sec= 1234567;
       int seconds = sec % 60;
       int minutes = sec % 3600 / 60;
       int hours = sec % 86400 / 3600;
       int days = sec / 86400;
 System.out.println(days + " Дни " + 
        hours +" Часа "+
        minutes + " Минути "+
        seconds + " Секунди ");
    
}
       
    }
