import java.util.*;
public class ex1 {
   public static void main(String[] args) {
	   
	   int sum = 0;
	   int sum2 = 0;
	   int  sum3 = 0;
	   
	   for (int i = 0; i <= 100; i++) {
		   sum += i;
	   }
	   for (int j = 0; j <= 100; j++) {
		   if(j%2==0 && j%7==0) {
			   sum2 += j;
		   	   sum3++;
		   }
	   }
	   System.out.println("합계 = " + sum);
	   System.out.println("평균 = " + sum/100);
	   System.out.println("2의배수이면서 7의 배수의 갯수 = " + sum3);
	   System.out.println("2의배수이면서 7의 배수의 합계 = " + sum2);
      }
}