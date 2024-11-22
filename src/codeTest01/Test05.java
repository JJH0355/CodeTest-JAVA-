package codeTest01;

import java.util.Scanner;
import java.util.Stack;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 막대기와 레이저의 배치를 입력 받음
		String stick = sc.next();

		// 일단 막대기와 레이저의 위치를 구분할 수 있도록 함
		// 문자열 중 ()는 0으로 변경
		// 0: 레이저 표시
		stick = stick.replace("()", "0");

		// 막대의 개수를 셀 변수
		int count = 0;

		// 스택을 사용하여 막대기를 표시
		// '('라면 막대기 번호를 추가하고 ')'면 마지막 번호를 가져온 후 삭제
		Stack<Character> stack = new Stack<Character>();

		// 막대기의 번호를 알려줄 값 생성
		// 0은 레이저이므로 1부터 시작
		char stickNum = '1';
		
		StringBuilder sb = new StringBuilder(stick);

		// 숫자가 차례로 증가해야 됨
		// '('를 만날 때 마다 막대기 번호를 부여하고, 1씩 증가
		// ')'를 만난다면 스택에서 값을 가져오고, 스택의 마지막 값 삭제
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '(') {
				sb.setCharAt(i, stickNum);
				stack.push(stickNum);
				stickNum++;
			}
			else if(sb.charAt(i) == ')') {
				sb.setCharAt(i, stack.pop());
			}
			// 0이라면 그 값 그대로 넣어줌
			else{
				sb.setCharAt(i, '0');
			}
		}

		// 갯숙 구하기
		// 처음 시작하는 1부터 다음 1까지 사이의 0의 개수를 셈
		// 막대의 갯수 : 0의 개수+1
		// 막대의 개수 변수에 값을 더함
		// ... 범위는 1부터 막대의 번호까지의 값
		for(int i = 1; i < Integer.parseInt(String.valueOf(stickNum)); i++) {
			int start = sb.indexOf(i+"");
			int end = sb.lastIndexOf(i+"");
			
			int zeroCount = 0;
			for(int j = start; j <= end; j++) {
				if(sb.charAt(j) == '0') {
					zeroCount++;
				}
			}
			
			count += (zeroCount + 1);
		}
		
		// 막대 개수 출력
		System.out.println(count);
	}

}
