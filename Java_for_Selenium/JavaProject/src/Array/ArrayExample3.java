package Array;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,200,300,400,500};
		int sum=0;
		
		for (int i:a)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
	}

}