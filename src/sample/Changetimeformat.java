package sample;
import java.util.*;
import java.text.*;
public class Changetimeformat{
  public static void main(String args[]){
    Date date = new Date();
    DateFormat gmtFormat = new SimpleDateFormat();
    TimeZone gmtTime = TimeZone.getTimeZone("GMT");
    gmtFormat.setTimeZone(gmtTime);
    System.out.println("Current Time: "+date);
    System.out.println("GMT Time: " + gmtFormat.format(date));

  }
}