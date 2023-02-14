package in.co.basics;

public class RunTimeArguments {

	public static void main(String[] args) {
		//System.out.println(args[0]+args[1]);
		
		if (args.length==2)
		{
			System.out.println("hello " + args[0]+" "+args[1]);
			
		}else
		{
			System.out.println("parameters name is required");
		}
		
	}

}
