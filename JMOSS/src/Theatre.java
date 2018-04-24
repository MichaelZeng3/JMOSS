
import java.util.ArrayList;


public class Theatre {
     public static void main(String args[]) {
     ArrayList<String> movie_loc=new ArrayList<String>();
     System.out.println("****MOVIE PLAZA THEATRE****");

     movie_loc.add("St.Kilda");
     movie_loc.add("Fitzroy");
     movie_loc.add("Melbourne CBD");
     movie_loc.add("Sunshine");
     movie_loc.add("Lilydale");
     String[] array = new String[movie_loc.size()];
     array = movie_loc.toArray(array);
     for (String item : array) {
         System.out.println(item);
     }
     ArrayList<String> movie_name=new ArrayList<String>();
     movie_name.add("Avenger:Infinity war");
     movie_name.add("Blockers");
     movie_name.add("Love,Simon");
     movie_name.add("Truth or dare");
     movie_name.add("The shape of water");
     String[] array1 = new String[movie_name.size()];
     array1 = movie_name.toArray(array1);
     for (String item1 : array1) {
         System.out.println(item1);
     }
     ArrayList<String> movie_days=new ArrayList<String>();
     movie_days.add("Sunday");
     movie_days.add("Monday");
     movie_days.add("Tuesday");
     movie_days.add("Wednesday");
     movie_days.add("Thursday");
     movie_days.add("Friday");
     movie_days.add("saturday");
     String[] array2 = new String[movie_days.size()];
     array2 = movie_days.toArray(array2);
     for (String item2 : array2) {
         System.out.println(item2);
     }
     ArrayList<String> movie_session=new ArrayList<String>();
     movie_session.add("Session1:9 AM");
     movie_session.add("Session2:12 PM");
     movie_session.add("Session3:3 PM");
     movie_session.add("Session4:6 PM");
     movie_session.add("Session5:9 PM");
     String[] array3 = new String[movie_session.size()];
     array3 = movie_session.toArray(array3);
     for (String item3 : array3) {
         System.out.println(item3);
     }
   }
 }
  