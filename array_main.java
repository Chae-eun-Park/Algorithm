package algorithm;

public class array_main {
	public static void main(String[] args) {
		stack_array stackA = new stack_array(5); //new뒤엔 생성자인거 알쥐? stack_array에서 int size들어있는 생성자 해놨어서 크기 정할 수 있으
		
		//Object형식이라서 갖가지 다 넣을 수 있는게 참 좋구나...
		stackA.push(3);
		stackA.push("Hi, I'm chaechae");
		stackA.push(14.5);
		
		//그냥 보기만 하고싶을 땐 peek, 지우면서 확인할 땐 pop
		while(!stackA.isEmpty())
			System.out.println(stackA.pop()); 
			//스택이 빌 때 까지 맨 위에부터 출력하면서 지워나간다.
	}
}