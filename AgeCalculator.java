package ok;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class AgeCalculator {
	public static int[] calculateAge(String birth) throws ParseException {
		int[] arr = new int[2];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dob = sdf.parse(birth);
		Date today = sdf.parse("01/04/2019");
		if (today.compareTo(dob) > 0) {
			LocalDate date1 = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate date2 = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Period age = Period.between(date1, date2);
			arr[0] = age.getYears();
			arr[1] = age.getMonths();
			return arr;
		} else {
			return null;
		}

	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		if (calculateAge(st) == null) {
			System.out.println("Invalid date of birth");
		} else {
			int[] age = calculateAge(st);
			if (age[0] == 0)
				System.out.println("Months: " + age[1]);
			else if (age[1] == 0)
				System.out.println("Years: " + age[0]);
			else
				System.out.println("Years: " + age[0] + ", Months: " + age[1]);
		}
	}
}
