package days17;

/**
 * @author 조지훈
 * @date 2026. 6. 4. 오후 3:18:56
 * @subject 
 * @content 배열 단점 : 배열크기 자동 증가/감소
 *					[1][2][3][4][5]
 *
 * 			링크드리스트 구조. - Node(노드)
 */
public class Ex10 {

	public static void main(String[] args) {
		
		Node node1 = new Node();
		node1.value = 10;      
		// [10][null]
		
		Node node2 = new Node();
		node2.value = 15;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 17;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 34;
		node3.next = node4;      
		node4.next = null;

		// 첫번째 노드의 주소를 node 변수에 저장.
		node2.next = null;
		
		Node node = node1;
		while ( node != null ) {
			System.out.println(node.value);
			
			node = node.next;
		}
		
		
	} // main

} // class

class Node{
	int value = 0; // 들어가 있는 값
	Node next = null; // 다음 노드 주소 저장할 변수
}