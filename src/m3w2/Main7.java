package m3w2;

//파일과 스캐너를 임포트 해줘야함
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		File file = new File("input.txt");
		//파일을 실행한다.
		try {
			Scanner sc = new Scanner(file);
			//sc가 읽어오고 있는 파일에서 다음으로 읽을 정수가 있는지 물어보는 것이다.
			while(sc.hasNextInt())
			{
				//어떠한 정수를 읽던간에 100을 곱해서 출력해준다.
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} 
		//파일을 실행하다가 오류가 발생했을 경우 밑으로 넘어감
		catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
	}

}
  