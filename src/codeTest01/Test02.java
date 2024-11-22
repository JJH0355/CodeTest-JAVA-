package codeTest01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 명령 수를 입력받을 변수
		int orderNum = 0;
		// 명령을 입력받을 배열
		ArrayList<Integer> orderList = new ArrayList<Integer>();

		// 점수의 총 합 변수
		int result = 0;

		// 첫 번째로 명령 횟수가 입력되어야만 함
		Scanner sc = new Scanner(System.in);
		// 입력값은 1와 100000사이여야 함

		// 알맞은 명령 횟수를 입력받을 때까지 반복
		while (true) {
			System.out.println("명령 횟수를 입력해주세요(1 ~ 100000) : ");
			// 입력값을 받음
			// 입력값을 잘못 넣을 것을 대비하여 try-catch문 사용
			try {
				orderNum = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 값을 입력해주세요.");
				// 버퍼 정리
				sc.nextLine();
				// 값 초기화
				orderNum = 0;
			}

			// 만약 숫자가 1과 100000 사이라면
			if (orderNum >= 1 && orderNum <= 100000) {
				// 반복문을 나감
				break;
			}
			System.out.println("알맞은 범위 값을 입력해주세요");
		}
		
		// 횟수를 알기 위한 변수
		int step = 0;

		// 명령 횟수에 알맞은 명령 수가 입력될 때까지 반복
		while (true) {

			// 명령 횟수와 올바른 명령 갯수가 같다면
			if (step == orderNum) {
				break;
			}

			// 명령을 임시로 받을 점수 변수
			int order = 0;

			System.out.println((orderList.size() + 1) + "숫자를 입력해주세요(1~100) : ");
			// 입력값을 받음
			// 입력값을 잘못 넣을 것을 대비하여 try-catch문 사용
			try {
				order = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 값을 입력해주세요.");
			}

			// 알맞은 범위의 값을 입력했다면
			if (order >= 1 && order <= 100) {
				// 리스트에 넣기
				orderList.add(order);
				step++;
			} 
			// 0을 입력했다면
			else if(order == 0) {
				// 리스트 마지막 값 제거
				orderList.remove(orderList.size()-1);
				step++;
			}
			else {
				System.out.println("알맞은 범위 값을 입력해주세요");
			}
		}
		
		// orderList 크기 만큼 반복해서 더함
		for(int i = 0 ; i < orderList.size(); i++) {
			result += orderList.get(i);
		}
		
		// 결과 출력
		System.out.println(result);

	}
}
