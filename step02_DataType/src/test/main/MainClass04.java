package test.main;
/*
 * java 기본 데이터 type
 * 
 * 3. 문자형(char, 차type 형)
 * 
 * - 65536 가지의 코드값을 가질 수 있어서 전세계에서 사용하는 문자 한글자를 표현 할 수 있다. 
 */
public class MainClass04 {
	public static void main(String[] args) {
		//char 형 변수 선언과 동시에 값 대입학
		char ch1='a';// 문자 한글자 는 싱글따옴표 로 
		char ch2='1';
		char ch3='@';
		char ch4='가';
		char ch5='뷃';
		
		// 내부적으로는 정수 code 값으로 처리 한다.
		int code1=ch1; // 자동 casting 되어서 담긴다. 
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
	}

}













