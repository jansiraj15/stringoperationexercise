package prescreenexercise.com.pre;

public class StringOperation {

	public String removeCharInstances1(String str, char repl) {
		String result = "";
		if(str == null || str.length() == 0)
			return "";
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) == repl) 
				continue;
			
			result += str.charAt(i);
		}
		return result;
	}
	
	public String removeCharInstances2(String str, String repl) {
		if(str == null || str.length() == 0)
			return "";
		
		
		return str.replaceAll(repl, "");
	}
	public static void main(String[] args) {
		StringOperation obj = new StringOperation();
		String orig = "Welcome to Java";
		String result = obj.removeCharInstances1(orig, 'o');
		System.out.println("Original String: " + orig + " result string " + result);
		
		String result2 = obj.removeCharInstances2(orig, "o");
		System.out.println("Original String: " + orig + " result string " + result2);
	}

}
