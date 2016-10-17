
public class Queue {
	ObjectBox head;
	ObjectBox tail;
	int count;
	public Object pull() {
		Object obj;
		
		//tmp
		obj = tail;
		
		return obj;
	}
	
	public void push(ObjectBox obj) {
		if (head == null) {
			
		}
	}
	
	public int get_size() {
		return count;
	}
}
