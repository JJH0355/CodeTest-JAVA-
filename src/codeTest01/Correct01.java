package codeTest01;

import java.util.Arrays;
import java.util.Scanner;

public class Correct01 {
	public static void main(String[] args) {
		// 가장 높은 점수와 낮은 점수를 구해야 함
		// 가장 높은 점수와 낮은 점수의 기준점을 맨처음에 잡고
		// 마지막 숫자까지 비교해가며 높은 점수와 낮은 점수를 비교한다.

		// 학생 수를 입력받을 변수
		int studentNum = 0;

		// 가장 높은 점수 변수
		int maxScore = 0;
		// 가장 낮은 점수 변수
		int minScore = 0;
		// 두 점 수 차
		int result = 0;

		// 첫 번째로 학생 수가 입력되어야만 함
		Scanner sc = new Scanner(System.in);
		// 입력값은 2와 1000사이여야 함

		// 입력값을 받음
		studentNum = sc.nextInt();

		// 학새들의 성적을 입력받을 배열
		int[] studentScore = new int[studentNum];
		
		// 학생 수 만큼 반복
		for(int i = 0; i < studentNum; i++) {
			// 학생들의 점수를 입력받기
			studentScore[i] = sc.nextInt();
		}
		
		// 배열 중 가장 큰 값 가져오기
		maxScore = Arrays.stream(studentScore).max().getAsInt();
		// 배열 중 가장 작은 값 가져오기
		minScore = Arrays.stream(studentScore).min().getAsInt();
			
		// 가장 큰 값과 작은 값 비교
		result = maxScore - minScore;

		System.out.println("result : " + result);
	}
}
