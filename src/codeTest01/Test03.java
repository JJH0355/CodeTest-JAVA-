package codeTest01;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// N마리의 소
		int N = sc.nextInt();

		// N개의 배열
		int[] datas = new int[N];

		// 소의 키를 배열에 저장
		for (int i = 0; i < N; i++) {
			datas[i] = sc.nextInt();
		}
		
		// 확인 가능 횟수
		int count= 0;

		// 0 부터 N까지의 분명한 범위가 있기 때문에 for을 사용함
		// 이중 반복문은 뉘양스 차이
		// index 0 --> N 헤어를 확인
		for (int i = 0; i < N; i++) {
			// 1) 범위가 정해져있다
			// 나의 다음부터 비교하므로 i+1
			for (int j = i+1; j < N; j++) {
				// datas[0] <= datas[1] 헤어 확인이 불가능
				if(datas[i] <= datas[j]) {
					// 더 이상 확인 불가능
					break;
				}
				// 계속 확인 가능
				count++;
			}
			// 2) 정확한 반복횟수를 모른다.
			//datas[0]의 키가 비교대상보다 더 크다면
//			int j = i+1;
//			// j 값에도 제한을 준다.
//			while(datas[i] > datas[j] && j<N) {
//				count++;
//				j++;
//			}
		}

		// 확인 횟수를 출력
		System.out.println(count);
	}

}
