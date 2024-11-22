package codeTest01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 코이 초등학교에 새로 부임하신 교장선생님은 어린 학생들의 행복감과 학생들의 성적 차이 관계를 알아보기로 했다.

	그래서 이전 성적을 조사하여 학생들의 시험 점수 차이 변화를 알아보려고 한다.

	예를 들어서 2016년 학생 8명의 점수가 다음과 같다고 하자.
	27,35,92,75,42,53,29,87 

	그러면 가장 높은 점수는 92점이고 가장 낮은 점수는 27점이므로 점수의 최대 차이는 65이다.

	한편 2017년 학생 8명의 점수가 다음과 같았다.
	85,42,79,95,37,11,72,32

	이때 가장 높은 점수는 95점이고 가장 낮은 점수는 11점이므로 점수의 최대 차이는 84이다.
	N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램을 작성하시오.

 */

public class Test01 {
	public static void main(String[] args) {
		// 가장 높은 점수와 낮은 점수를 구해야 함
		// 가장 높은 점수와 낮은 점수의 기준점을 맨처음에 잡고
		// 마지막 숫자까지 비교해가며 높은 점수와 낮은 점수를 비교한다.

		// 학생 수를 입력받을 변수
		int studentNum = 0;
		// 학새들의 성적을 입력받을 리스트
		ArrayList<Integer> studentScore = new ArrayList<Integer>();

		// 가장 높은 점수 변수
		int maxScore = 0;
		// 가장 낮은 점수 변수
		int minScore = 0;
		// 두 점 수 차
		int result = 0;

		// 첫 번째로 학생 수가 입력되어야만 함
		Scanner sc = new Scanner(System.in);
		// 입력값은 2와 1000사이여야 함

		// 알맞은 학생 수를 입력받을 때까지 반복
		while (true) {
			System.out.println("학생 수를 입력해주세요(2 ~ 1000) : ");
			// 입력값을 받음
			// 입력값을 잘못 넣을 것을 대비하여 try-catch문 사용
			try {
				studentNum = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 값을 입력해주세요.");
				// 버퍼 정리
				sc.nextLine();
				// 값 초기화
				studentNum = 0;
			}

			// 만약 숫자가 2와 1000 사이라면
			if (studentNum >= 2 && studentNum <= 1000) {

				// 반복문을 나감
				break;
			}
			System.out.println("알맞은 범위 값을 입력해주세요");
		}

		// 학생 수에 알맞은 점수 갯수가 입력될 때까지 반복
		while (true) {

			// 학생 수와 점수 리스트의 크기가 같다면
			if (studentScore.size() == studentNum) {
				break;
			}

			// 학생들의 점수를 임시로 받을 점수 변수
			int score = 0;

			System.out.println((studentScore.size() + 1) + "번째 학생의 점수를 입력해주세요(0 ~ 1000) : ");
			// 입력값을 받음
			// 입력값을 잘못 넣을 것을 대비하여 try-catch문 사용
			try {
				score = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 값을 입력해주세요.");
			}

			// 알맞은 범위의 값을 입력했다면
			if (score >= 0 && score <= 1000) {
				studentScore.add(score);
			} else {
				System.out.println("알맞은 범위 값을 입력해주세요");
			}
		}
		
		// 리스트 값 확인
		System.out.println("점수 리스트 : "+ studentScore);

		// 가장 기준이 되는 숫자는 index 0의 첫 번째 값으로 지정
		maxScore = studentScore.get(0);
		minScore = studentScore.get(0);

		// 학생 수만큼 반복하여 판단
		// 첫 번째 값은 들어갔으므로 index 1부터 시행
		for (int i = 1; i < studentScore.size(); i++) {
			// 가장 큰 값 비교
			// index i번째 값이 maxScroe보다 크다면
			if (maxScore < studentScore.get(i)) {
				// maxScore에 index i번째 값 넣기
				maxScore = studentScore.get(i);
			}

			// 가장 작은 값 비교
			// index i번째 값이 minScroe보다 작다면
			if (minScore > studentScore.get(i)) {
				// minScore에 index i번째 값 넣기
				minScore = studentScore.get(i);
			}
		}
		
		// 가장 큰 값과 작은 값 확인
		System.out.println("가장 큰 값 : "+ maxScore + ", 가장 작은 값 : "+ minScore);
		
		// 가장 큰 값과 작은 값 비교
		result = maxScore - minScore;
		
		System.out.println("result : "+ result);
		
		// API 사용
		//int max = Array.stream("배열명").max().getAsInt();
	}

}
