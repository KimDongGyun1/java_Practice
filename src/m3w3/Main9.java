package m3w3;

public class Main9 {
	
	// 함수는 반환형, 함수명, 매개변수로 구성된다.
	public static int function(int a, int b, int c) {
		int min;
		// 최소값은 찾는 간단한 알고리즘
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
			{
				min = a;
			}
		}
		//min부터 1까지 1씩 감소해가면서 최대공약수를 찾을 수 있도록 하는 것
		for(int i = min; i > 0; i--)
		{
			//i로 나누어 떨어지는 값이 발견이 됐을때 i의 값을 반환시켜 종료한다.
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
			
		}
		//최대공약수가 없을 경우에는 -1를 반환하여 최대공약수가 없다는 사실을 밝히는 것이다.
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대 공약수: " + function(400, 300 ,750));

		
	}

}
