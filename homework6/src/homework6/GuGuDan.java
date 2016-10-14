package homework6;

import java.util.Scanner;

public class GuGuDan {
	GuGuDan() {
	}

	void guguCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력을 원하는 단을 입력하세요 : ");
		int a = sc.nextInt();
	
		for (int i = 1; i < 10; i++) {
			int result = a * i;
			System.out.println(a + "*" + i + "=" + result);
		}
	}
}