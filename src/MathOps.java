
import java.util.*;

public class MathOps {
	public static void main(String[] args) {
			
			System.out.println("Провірка укр");
			Random rand = new Random();

			//int i,j,k;
			//float i,j,k;
			double i,j,k;
			
			
			//j = rand.nextInt(100)+1;
			//j = rand.nextFloat();
			j = rand.nextDouble();
			System.out.println("j : " + j);
			
			//k = rand.nextInt(100)+1;
			//k = rand.nextFloat();
			k = rand.nextDouble();
			System.out.println("k : " + k);

			i = j + k;
			System.out.println("j + k : " + i);
			
			i  = j - k;
			System.out.println("j - k : " + i);
			
			i = j / k;
			System.out.println("j / k : " + i);
			
			i = j * k;
			System.out.println("j * k : " + i);
			
			i = j % k;
			System.out.println("j % k : " + i);
			
			j %= k;
			System.out.println("j %/ k : " + i);



			
			System.out.println("тест");
			
			
			
	}
	
	

	
}