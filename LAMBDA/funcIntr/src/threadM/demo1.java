package threadM;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the current date (yyyy-MM-dd) format
		LocalDate date = LocalDate.now();
		System.out.println("the current date is :"+ date);

		// the current time hh:mm:ss.nanosec
		LocalTime time = LocalTime.now();
		System.out.println("the current time is "+ time);
		// will give us the current time and date combined with "T"
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : "+ current);
		
		LocalDate dob = LocalDate.of(1985, 02, 20);//(yyyy-MM-dd)
		
		System.out.println("current date and time : "+ dob);
		
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Today date: "+date);
		System.out.println("Yesterday date: "+yesterday);
		System.out.println("Tomorrow date: "+tomorrow);
		
		LocalDate date1 = LocalDate.of(2017, 1, 13);
		System.out.println(date1.isLeapYear());
		LocalDate date2 = LocalDate.of(2016, 9, 23);
		System.out.println(date2.isLeapYear());
		
		LocalDateTime datetime = date.atTime(1,50,9);
		System.out.println(datetime);
		
		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String udf= current.format(formatObj);
		System.out.println("current date and time in userdefined format: "+ udf);
	}

}
