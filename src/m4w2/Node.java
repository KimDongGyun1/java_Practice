//객체 지향 프로그램 노드
package m4w2;

public class Node {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 다른 노드를 받아서 정중앙을 가지는 좌표를 반환해주는
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) /2, (this.y + other.getY()) /2);
	}

}
