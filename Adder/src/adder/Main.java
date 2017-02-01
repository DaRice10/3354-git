package adder;


public class Main {

    public static void main(String[] args) {
		if (args.length <= 1) 
				throw new IllegalArgumentException("Please Enter more than 1 argument.");
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

    private static int addArguments(String[] args) {
		int total = 0;
			if (args[0].equals("-")){
			
				for (int i = 1;i < args.length; i++)	
			total-=  Integer.valueOf(args[i]);
		}
					else{
		for (int i = 0;i < args.length; i++)
			{
			
				total+=  Integer.valueOf(args[i]);
		}			
					}			
        return total;
    }
}


}