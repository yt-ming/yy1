package cc;

public class newTExt {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };
	public static void main(String args[]) {
		newTExt ex = new newTExt();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch); }
	public static void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}}