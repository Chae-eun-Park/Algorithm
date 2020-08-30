// ���� ��� �����ϴ� �ٽ� �κ�
package algorithm;

public class stack_linkedlist {
	private stack_node top;

	public stack_linkedlist() { // �����ڿ��� �ν��Ͻ����� �ʱ�ȭ �⺻�� null
		top = null;
	}

	public boolean isEmpty() { // ž�� ��������� ����ٰ� �˸�
		return (top == null);
	}

	// ����
	public void push(Object item) {
		stack_node newNode = new stack_node(item); // ��带 ���� �����
		newNode.linkNode(top); // ���θ��� ���� ���� ��忬��
		top = newNode; // ���ο� ��尡 ���� �տ� ������ top���� ǥ��
	}

	// �б�
	public Object peek() {
		return top.getData();
	}

	// ����
	public Object pop() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		else {
			Object item = peek();
			top = top.getNextNode();
			return item;
		}
	}
}
