/**
 * �迭 ��� ���� ����. 
 * �Ӽ�(������Ƽ) : top(������ ����/�����ϴ� ��ġ), maxSize(�迭�� �ִ� ũ��), stackArray(�迭)
 * �޼ҵ�: pop(����), push(����), peek(�б�, Ž��), isEmpty(�μ���, ������ ����ִ��� Ȯ��)
 */
package algorithm;

public class stack_array {
	private int top;
	private int maxSize;
	private Object[] stackArray; //��ü������ �迭 ����
	
	//�迭 ���� ���ؾ� �ϹǷ� ������ ���ڿ� size�� ����
	public stack_array(int size){ //�����ڷ� �Ӽ��ʱ�ȭ
		maxSize = size; //this.maxSize = size;
		this.top = -1;  //���ΰ� ���� ��, �⺻ �� -1
		this.stackArray = new Object[maxSize];
	}
	
	//������ ����ִ��� Ȯ��
	public boolean isEmpty() {
		return (top==-1);
	}
	
	//������ ����
	public void push(Object item) { //Object data type �� ��� Ÿ���� �����Ѵٰ� ����.(int string double..)
		//������ �� á�� �� ����ó��
		if(top >= maxSize-1)
			throw new ArrayIndexOutOfBoundsException((top+1)+">="+maxSize);
		stackArray[++top] = item;
	}
	
	//������ �б�(������ �� ���� ���� ����)
	public Object peek() {
		//������ ����� �� ����ó��
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException(top);
		return stackArray[top];
	}
	
	//������ ����
	public Object pop() {
		Object item = peek(); //������ �� item�� ����
		top--; //�� ĭ ���̰�
		return item;
	}
}
