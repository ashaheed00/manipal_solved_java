package ok;
import java.util.Scanner;
public class Marks {
	
	    public static void main(String[] args) {
		// Start Code
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a>=0 && a<=100)&&(b>=0 && b<=100)&&(c>=0 && c<=100)){
		int avg = (a+b+c)/3 ;
		if(avg>=70){
		    System.out.println("DISTINCTION");
		}else if(avg>=60){
		    System.out.println("FIRST");
		}else if(avg>=50){
		    System.out.println("SECOND");
		}else if(avg>=40){
		    System.out.println("THIRD");
		}else{
		    System.out.println("FAIL");
		}
		}else{
		    System.out.println("INVALIDMARKS");
		}
		// End Code

	    }
	}

