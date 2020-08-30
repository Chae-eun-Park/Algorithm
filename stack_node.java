/*
 * ���Ḯ��Ʈ�� ��� �� ��� class
 * ����� ������/������带 ����Ű�� �ּ� �κ� �ΰ����� get���� �����´�.
 * ��带 ���ϴ� ���� �����ϴ� �κп� top������ �����Ѵ�.
 * */

package algorithm;

public class stack_node {
	private Object data;
	private stack_node nextNode;
	
	public stack_node(Object data){
		this.data = data;
		this.nextNode = null;
	}
	
	//�ش� ��带 ���ϴ� ���(Node top)�� �������ִ� �޼ҵ�
	//nextNode������Ƽ�� ���ڷ� ���� top��带 �Ҵ�
	public void linkNode(stack_node top) { //top:������ ����/�����ϴ� ��ġ
		this.nextNode = top;
	}
	
	//get�� private���� ������ �����͵��� ���� �ܺο��� ������������ ����
	//�ش� ����� �����͸� �������� get�޼ҵ�
	public Object getData() {
		return this.data;
	}
	//�ش� ���� ����� ��带 �������� get�޼ҵ�
	public stack_node getNextNode() {
		return this.nextNode;
	}	
}
