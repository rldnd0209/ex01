import java.util.Scanner;

public class j {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int year,month,week,day,i;
      int monthday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
      
      System.out.print("원하는 년도를 입력하세요. ");
      year = sc.nextInt();
      System.out.print("원하는 달을 입력하세요. ");
      month = sc.nextInt();
      
      if(year%4 == 0 && year%100 != 0 || year%400 == 0) // 윤년에따른 2월 날수계산
         monthday[1] = 29;
      else
         monthday[1] = 28;
      
      day = ((year-1)*365)+((year-1)/4)-((year-1)/100)+((year-1)/400);
         //연도에따른 일수 + 4년마다 윤년+ 100년마다 윤년- 400년마다 윤년+ 
      
      for(i=0; i<month-1; i++) { //연도에 따른 날수 + 달수에 따른 날수
         day += monthday[i];
      }
      week = (day%7)+1;   //1를 찍을 위치확인
      System.out.printf("----------------------%d년 %d월----------------------%n",year,month);
      System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n","일","월","화","수","목","금","토");   
      for(i = 0; i < week; i++) {
         System.out.print("\t");   //1이 되기전 공백 넣음
      }
         for(i = 1; i <= monthday[month-1]; i++) {   //달의 일수만큼 찍음
            System.out.printf("%d\t", i);
            week++;
            if(week%7 == 0) 
            System.out.println();   //일주일 지나면 줄바꿈
      }
   }
}