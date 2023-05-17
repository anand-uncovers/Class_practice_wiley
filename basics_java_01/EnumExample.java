package basics_java_01;
enum WeekDay{
    MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY, SUNDAY
}
public class EnumExample {

	public static void main(String[] args) {
		 System.out.println("Printing only one day from weekday");
         WeekDay day = WeekDay.SUNDAY;
         System.out.println(day+"--------");
         
         System.out.println("Printing all days from weekday");
         for (WeekDay wd:WeekDay.values()){
           System.out.println(wd);
         }

	}

}
