package algorithm;

public class array_main {
	public static void main(String[] args) {
		stack_array stackA = new stack_array(5); //new�ڿ� �������ΰ� ����? stack_array���� int size����ִ� ������ �س�� ũ�� ���� �� ����
		
		//Object�����̶� ������ �� ���� �� �ִ°� �� ������...
		stackA.push(3);
		stackA.push("Hi, I'm chaechae");
		stackA.push(14.5);
		
		//�׳� ���⸸ �ϰ���� �� peek, ����鼭 Ȯ���� �� pop
		while(!stackA.isEmpty())
			System.out.println(stackA.pop()); 
			//������ �� �� ���� �� �������� ����ϸ鼭 ����������.
	}
}