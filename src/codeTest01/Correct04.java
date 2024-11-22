package codeTest01;

import java.util.Stack;

public class Correct04 {
	
	public static int[] test(int N, int[] tower) {
		int[] result = new int[N];
		Stack<int[]> stack= new Stack<int[]>();
		//{탑의 높이, 탑의 위치}를 저저아 == int[] 제네릭으로 설정
		
		for(int i = 0; i<N; i++) {
			// 0(n) == 반복문은 반드시 1개는 사용해야함!
			
			// 1) 현재 비교대상이 되는 탑보다 높은 탑이 있나?
			//	stack.peek()의 높이가 나보다 작니?
			while(!stack.isEmpty() && stack.peek()[0] < tower[i]) {
				// 신호를 수신할 수 없으니 제거
				stack.pop(); // 임시 저장 공간에서 제거 됨
			}
			
			// 2) 신호를 받을 탑이 없으면 result를 0으로 저장
			// 탑이 있으면 위치정보 저장
			if(stack.isEmpty()) {
				result[i] = 0;
			}
			else {
				result[i] = stack.peek()[1]+1; 	// index와 위치의 차이
			}
			
			// 3) 현재  비교 대상이 있었던 탑은 다음 비교 대상이 됨
			//		==> 스택에 저장되어야 함
			stack.push(new int[] {tower[i],i});
			
		}
		return result;
	}
	
	public static void main(String[] args) {
	}

}
