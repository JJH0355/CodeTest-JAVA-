package codeTest02;

import java.util.Scanner;

public class Test01 {
	public static int solution(int order) {
		// 결과 값을 담을 변수 생성
		int result = 0;
		
		// 비교를 위해 문자열로 변경
		String orderStr = order+"";
		
		// 받은 입력 값을 한 글자씩 가져와서 3, 6, 9에 비교
		// 만약 3 또는 6 또는 9이면 결과 값에 1추가
		// 반복에는 입력받은 값의 길이라는 횟수 제한이 있음
		for(int i = 0; i < orderStr.length(); i++) {
			// i번째 index 위치의 글자 하나 씩 가져오기
			char num = orderStr.charAt(i);
			
			if(num == '3' || num == '6' || num == '9') {
				result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int order = 3;
		int order2 = 29423;
		
		System.out.println(solution(order));
		System.out.println(solution(order2));
	}
}