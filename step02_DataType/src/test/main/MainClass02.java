package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor=90;
		//영어점수
		int eng=100;
		//국어 영어 점수의 평균을 구해서 출력하고 싶다면?
		
		//두점수의 합
		int sum=kor+eng;
		/*
		 * 정수 끼리 연산 하면 결과는 정수
		 * 정수와 실수와 연산하면 결과는 실수 
		 */
		
		//평균 sum도 정수 2도 정수니까 하나를 실수로 만들어야 하는데 2뒤에d 를 붙이거나 .0을 붙이면 소숫점까지 계산가능함
		double ave=sum/2d;
		
		System.out.println("평균:"+ave);
		
		
	}

}
