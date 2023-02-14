
public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=13,temp=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}

	}

}
