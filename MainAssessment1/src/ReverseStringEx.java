public class ReverseStringEx {
	public static void main(String[] args) {
		String s = "Java is Best";
		String[] temp = s.split(" ");
		String res = " ";
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				res = temp[i] + res;
			else
				res = " " + temp[i] + res;
		}
		System.out.println(res);
	}
}
