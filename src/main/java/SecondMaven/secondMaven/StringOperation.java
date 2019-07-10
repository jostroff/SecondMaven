package SecondMaven.secondMaven;

public class StringOperation {
	public String concats(String a, String b) {
		return a.concat(b);
	}
	public int length(String a) {
		return a.length();
	}
	public boolean contains(String str, CharSequence c) {
		return str.contains(c);
	}
//	public static void main(String[] args) {
//		StringOperation so = new StringOperation();
//		System.out.println(so.concats("Joshua ", "Ostroff"));
//	}
}
