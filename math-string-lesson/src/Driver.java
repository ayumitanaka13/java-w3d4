
public class Driver {
	public  static void main(String[] args) {
		String s1 = "  Hello Java.  ";
		String s2 = "You are cool language.";
		String s3 = "Hello";
		String s4 = "hello";
		String s5 = "";
		
		System.out.println(s1.trim());
		System.out.println(s1.length());
		
		System.out.println(s1.concat(s2).toUpperCase());

		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s3.isEmpty());
		System.out.println(s5.isEmpty());
		
//		Hello Java.
//		15
//		  HELLO JAVA.  YOU ARE COOL LANGUAGE.
//		-32
//		0
//		false
//		true
//		false
//		true		
		
		for (int i=0; i<7; i++) {
			int randNumber = (int)((Math.random()*6)+5);
			System.out.println(randNumber);
		}
		
		double num = 123.456;
		System.out.println((int)num);
		
//		10
//		5
//		6
//		5
//		6
//		10
//		7
//		
//		123
	}
}
