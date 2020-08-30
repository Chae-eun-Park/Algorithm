/*
 * 연결리스트로 사용 할 노드 class
 * 노드의 데이터/다음노드를 가리키는 주소 부분 두가지를 get으로 가져온다.
 * 노드를 원하는 노드와 연결하는 부분에 top변수로 연결한다.
 * */

package algorithm;

public class stack_node {
	private Object data;
	private stack_node nextNode;
	
	public stack_node(Object data){
		this.data = data;
		this.nextNode = null;
	}
	
	//해당 노드를 원하는 노드(Node top)와 연결해주는 메소드
	//nextNode프로퍼티에 인자로 받은 top노드를 할당
	public void linkNode(stack_node top) { //top:데이터 삽입/삭제하는 위치
		this.nextNode = top;
	}
	
	//get은 private으로 설정된 프로터디의 값을 외부에서 가져오기위해 구현
	//해당 노드의 데이터를 가져오는 get메소드
	public Object getData() {
		return this.data;
	}
	//해당 노드와 연결된 노드를 가져오는 get메소드
	public stack_node getNextNode() {
		return this.nextNode;
	}	
}
