
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<String> q = new MyQueue<>();
		q.add("aa");
		q.add("bb");
		q.add("cc");
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		
		
	}

}
