package m3w3;

public class Main11 {
	
	// 5! = 5 * 4 * 3 * 2 * 1 = 120
	public static int factorial(int number) {
		// 넘버가 1이라면 1을 반환
		if(number == 1)
			return 1;
		// 그렇지 않다면 넘버 * 팩토리얼(넘버 -1)
		else
			// 5! = 5 * 4! 
			// 5! = 5 * 4 * 3! 이러한 과정으로 실행됨
			return number * factorial(number - 1);
	}

	public static void main(String[] args) {

		System.out.println("10팩토리얼은 " + factorial(10));
		
	}

}
