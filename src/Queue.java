
public class Queue {
	ObjectBox head;
	ObjectBox tail;
	int count;
	
	public void push(Object obj) {
		ObjectBox ob = new ObjectBox();

		ob.obj = obj;
		if (head == null) {
			head = ob;
			
		} else {
			tail.next = ob;
		}
		tail = ob;

		count++;
		
	}

	public Object pull() {
		Object obj;
		//ObjectBox ob1;
		
		obj = head.obj;
		//System.out.println("Что лежит дальше "+head.next.obj);
		head = head.next;
		//head = ob1;
		count--;
		return obj;
	}
	
	public int get_size() {
		return count;
	}
}
