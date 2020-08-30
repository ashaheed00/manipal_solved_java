package ok;

import java.util.*; 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date;
public class DayOfDate { 
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in); 
        String input=sc.nextLine(); 
        sc.close();
        System.out.println(getDayOfDate(input)); 
    } 
    public static String getDayOfDate(String date) throws ParseException{ 
        Date dt=new Date(); 
        SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
        dt=sdf.parse(date); 
        String day=new SimpleDateFormat("EEEEE G").format(dt);
        return day; 
    }
}
