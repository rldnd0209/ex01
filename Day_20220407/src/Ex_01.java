import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		
		System.out.println("main() �Լ�!!");
	
		int ca = 5;
		int b = 10;
		
		sub();
		
		System.out.println("��� ���� : " + sub);
		
		//�Լ��� �����ϸ� �ݵ�� �ٸ������� ȣ���� �ؾ��Ѵ�.
		//void �ڸ����� ��ȯ���� �´� --> void�� ��ȯ���� ���ٴ� ���� ���
		//sub�� �Լ� �̸� --> �����̸� �߿��� ��� �Ѵ�
	}
	
	public static int sub() {

		sub = a*b;
		
		System.out.println("sub() �Լ�...");
		
		return a*b;
			
	}
}

