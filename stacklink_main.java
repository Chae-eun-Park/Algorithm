package algorithm;

public class stacklink_main {
	public static void main(String[] args) {
		stack_linkedlist list = new stack_linkedlist();

		list.push("chaechae");
		list.push(23);
		list.push("DEU_CSW");

		while (!list.isEmpty())
			System.out.println(list.pop());
	}
}
