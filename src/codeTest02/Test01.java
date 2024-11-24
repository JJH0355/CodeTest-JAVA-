package codeTest02;

import java.util.Scanner;

public class Test01 {	
	public static void main(String[] args) {
	
		// 결과 값을 담을 변수 생성
		int result = 0;
		
		// 정수 값을 입력 받음
		// 비교를 위해 문자열로 변경
		Scanner sc = new Scanner(System.in);
		
		int order = sc.nextInt();
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
		
		// 결과 출력
		System.out.println(result);
	}
}