public class LocalVar {
	    public void Add(){
	        int a = 10, b = 5;
	        System.out.println(a+b);
	        }

	    public void Sub(){
	        int a = 10, b = 5;
	        System.out.println(a-b);
	        }

	    public static void main(String[] args) {
	    	LocalVar math = new LocalVar();
	    	math.Add();
	    	math.Sub();	
	    }
}
