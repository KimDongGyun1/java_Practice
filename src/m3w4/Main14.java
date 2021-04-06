package m3w4;

// 이차원배열
public class Main14 {

	public static void main(String[] args) {

		int N = 50;
		// 새로운 배열을 만든다.
		int[][] array = new int[N][N];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		// 이차원 배열을 출력
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
