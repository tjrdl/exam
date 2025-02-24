package exam;

import java.util.Random;

public class exam_Java {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[3][4];
		Random number = new Random();
		int sum = 0;
		for (int i = 0; i<array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				int a = number.nextInt(10);
				array[i][j] = a;
				sum += a;
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
		
	}

}
