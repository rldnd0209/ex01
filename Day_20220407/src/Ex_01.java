import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		
		System.out.println("main() 함수!!");
	
		int ca = 5;
		int b = 10;
		
		sub();
		
		System.out.println("결과 값은 : " + sub);
		
		//함수가 존재하면 반드시 다른곳에서 호출을 해야한다.
		//void 자리에는 반환형이 온다 --> void는 반환값이 없다는 것을 명시
		//sub는 함수 이름 --> 변수이름 중에서 명명 한다
	}
	
	public static int sub() {

		sub = a*b;
		
		System.out.println("sub() 함수...");
		
		return a*b;
			
	}
}

