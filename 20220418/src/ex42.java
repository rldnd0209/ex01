public class ex42 {

   public static void main(String[] args) {
      //ex42의 클래스를 초기화 하여서 이용하기 용이하게 만들기
      ex42 s=new ex42();
      //sum함수값을 불러오기
      s.sum();
      //multi값의 함수를 불러오기
      s.multi();
   }
   
   //void의 형태로 리턴의 값을 보내기보다는 프린트 문에서 값을 출력
   static void sum() {
      int a=1;
      for(int i=0; i<100; i++)
            a+=i;
      System.out.println("총합:"+a);
      System.out.println("평균:"+(a/100));
      
   }
   //이하 동문
   static void multi() {
      int count=0;
      int a=0;
      for(int i=0; i<100;i++) {
         if(i%2==0 && i%7==0) {
         count++;
         a+=i;
         }
      }
      System.out.println("총합은 :"+a+"갯수는:"+count);
      
   }
}