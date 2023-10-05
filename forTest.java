interface addSpace{
	
	public String ConvertString(String str);
}

public class Exceptions  {
	public static void main(String[] args) {
      
		addSpace s1=(s) ->{
		
			return s.chars().mapToObj(a->(char)a+" ").collect(Collectors.joining());
		};
		
		System.out.println(s1.ConvertString("Edubridge"));
	}
}
