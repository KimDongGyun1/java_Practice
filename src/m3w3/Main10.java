package m3w3;

public class Main10 {
	
	public static int max(int a, int b) {
		// a가 크면 a를 반환하고 그렇지 않다면 b를 반환
		return (a > b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
		//a와 b중 더 큰 값을 c와 비교
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("(345, 567, 789) 중에서 가장 큰 값은 " + function(345, 567, 789));
		
	}

}
