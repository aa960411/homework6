package homework6;

import java.util.Scanner;

public class GuGuDan {
	GuGuDan() {
	}

	void guguCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���ϴ� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
	
		for (int i = 1; i < 10; i++) {
			int result = a * i;
			System.out.println(a + "*" + i + "=" + result);
		}
	}
}