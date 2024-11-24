package codeTest02;

public class Test03 {
	public static int solution(int array[], int n) {
		// 결과를 담을 정수 변수
		int result = 0;
		
		// 배열의 인덱스 0부터 인덱스 배열 길이 -1 까지의 값을 차례로 가져옴
		// n과 값이 같은지 비교
		// 만약 같다면 결과 값에 1 추가
		for(int i = 0; i < array.length; i++) {
			if(array[i] == n) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2, 3, 4, 5 };
		int n = 1;
		int[] numbers2 = { 0, 2, 3, 4 };
		int n2 = 1;

		System.out.println(solution(numbers, n));
		System.out.println(solution(numbers2, n2));
	}
}
