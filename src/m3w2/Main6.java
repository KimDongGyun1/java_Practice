package m3w2;

public class Main6 {
	

	public static void main(String[] args) {

		int count = 0;
		
		//for(;;)은 무한 루프 의미로 동작한다. break를 사용하여 즉시 빠져나올수있음.
		for(;;)
		{
			System.out.println("출력");
			count++;
			if(count == 10)
			{
				break;
			}
		}
	}

}
