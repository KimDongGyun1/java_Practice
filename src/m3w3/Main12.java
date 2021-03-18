package m3w3;

//피보나치 수열 1 1 2 3 5 8
//피보나치 수열을 간단히 만든 코드

public class Main12 {
	
	public static int fibonacci(int number) {
		if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else
		{
			//피보나치 수열값을 구하려면 그 바로 앞에 있는 값과 두 번째 앞에 있는 값을 더해야함!!
			return fibonacci(number - 1) + fibonacci(number -2);
		}
	}

	public static void main(String[] args) {
		// 만약에 양수가 아닌 음수를 넣으면 int result = -1; 의 값이 나온다.
		System.out.println("피보나치 수열의 10번째 원소는 " +fibonacci(10) + "입니다.");
	}

}
