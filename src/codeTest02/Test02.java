package codeTest02;

public class Test02 {
	public static double solution(int numbers[]) {
		// 더한 수를 넣을 실수 변수
		double sum = 0;
		// 반환할 결과를 담을 실수 변수
		double result = 0.0;
		
		// 배열의 길이를 계산해 놓음
		int numberLength = numbers.length;
		
		// 배열의 길이만큼 반복
		// 배열의 안의 값을 차례로 더함
		for(int i = 0; i < numberLength; i++) {
			sum += numbers[i];
		}
		
		// 모두 더한 값을 배열의 길이로 나눔
		result = sum / numberLength;
		
		// 결과 반환
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(solution(numbers));
	}
}
