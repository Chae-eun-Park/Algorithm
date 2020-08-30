// 스택 기능 구현하는 핵심 부분
package algorithm;

public class stack_linkedlist {
	private stack_node top;

	public stack_linkedlist() { // 생성자에서 인스턴스변수 초기화 기본값 null
		top = null;
	}

	public boolean isEmpty() { // 탑이 비어있으면 비었다고 알림
		return (top == null);
	}

	// 삽입
	public void push(Object item) {
		stack_node newNode = new stack_node(item); // 노드를 새로 만든다
		newNode.linkNode(top); // 새로만든 노드와 이전 노드연결
		top = newNode; // 새로운 노드가 가장 앞에 있으니 top으로 표시
	}

	// 읽기
	public Object peek() {
		return top.getData();
	}

	// 삭제
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
