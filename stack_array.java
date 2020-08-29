/**
 * 배열 기반 스택 구현. 
 * 속성(프로퍼티) : top(데이터 삽입/삭제하는 위치), maxSize(배열의 최대 크기), stackArray(배열)
 * 메소드: pop(삭제), push(삽입), peek(읽기, 탐색), isEmpty(부수적, 스택이 비어있는지 확인)
 */
package algorithm;

public class stack_array {
	private int top;
	private int maxSize;
	private Object[] stackArray; //객체유형의 배열 생성
	
	//배열 갯수 정해야 하므로 생성자 인자에 size를 넣음
	public stack_array(int size){ //생성자로 속성초기화
		maxSize = size; //this.maxSize = size;
		this.top = -1;  //쌓인게 없을 때, 기본 값 -1
		this.stackArray = new Object[maxSize];
	}
	
	//스택이 비어있는지 확인
	public boolean isEmpty() {
		return (top==-1);
	}
	
	//데이터 삽입
	public void push(Object item) { //Object data type 은 모든 타입을 포함한다고 생각.(int string double..)
		//스택이 다 찼을 때 예외처리
		if(top >= maxSize-1)
			throw new ArrayIndexOutOfBoundsException((top+1)+">="+maxSize);
		stackArray[++top] = item;
	}
	
	//데이터 읽기(언제나 맨 위의 것을 읽음)
	public Object peek() {
		//스텍이 비었을 때 예외처리
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException(top);
		return stackArray[top];
	}
	
	//데이터 삭제
	public Object pop() {
		Object item = peek(); //마지막 값 item에 넣음
		top--; //한 칸 줄이고
		return item;
	}
}
