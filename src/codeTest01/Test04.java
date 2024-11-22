package codeTest01;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 탑의 개수를 입력 받음
		int N = sc.nextInt();

		// 탑의 높이들을 입력받음
		// 입력받는 높이는 한 줄로 받음
		int[] datas = new int[N];

		for (int i = 0; i < N; i++) {
			datas[i] = sc.nextInt();
		}

		// 수신받는 탑의 위치 리스트
		int[] result = new int[N];

		// index 0은 왼쪽 데이터가 없으므로 무조건 0
		result[0] = 0;

		// 수신받는 탑의 위치 리스트는 1번부터 입력되어야 하므로
		// index 1번째 탑부터 시작
		// 왼쪽으로 이동하므로 해당 index-1부터 0까지
		for (int i = 1; i < N; i++) {
			for (int j = i - 1; j >= 0; j--) {
				// 만약에 자신보다 높은 탑이 있다면 해당 인덱스의 번호를 알아야함
				// 인덱스 번호를 알아내어 차례로 보관해야 됨
				if (datas[i] < datas[j]) {
					result[i] = j+1;
					break;
				}
				// 자신보다 낮으면 레이저 신호는 계속 나아가야 함
				else {
					result[i] = 0;
				}
			}
		}

		// 한 줄로 출력
		for (int i = 0; i < N; i++) {
			System.out.print(result[i]);
		}

	}

}
