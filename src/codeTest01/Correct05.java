package codeTest01;

import java.util.Stack;

public class Correct05 {
	public static int test(String input) {
		int result = 0;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i++) {
			// String에서 값을 하나씩 가져옴
			char c = input.charAt(i);
			
			if(c == '(') {
				// 레이저인지, 막대기인지 현재는 파악 불가능
				// 일단 스택에 저장
				stack.push(c);
			}
			else {
				stack.pop(); // 레이저 짝궁 ( 를 먼저 제거
				
				if(input.charAt(i-1) == '(') {
					// () 레이저
					// 현재 스텍에 저장된 막대기 수 만큼 조각이 나옴
					result += stack.size();
				}
				else {
					// 막대기
					// 끝의 조각 1개를 추가
					result ++;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String input = "()(((()())(())()))(())";
		
		int result = test(input);
		System.out.println(result);
	}

}
