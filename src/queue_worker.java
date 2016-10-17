
public class queue_worker {

	public static void main(String[] args) {
		Queue q = new Queue();
		int cnt;
		
		for (int i=1;i<11;i++){
			q.push(i);
		}	
		cnt = q.count;
		System.out.println(cnt);
		for (int i=1;i<=cnt;i++){
			System.out.println(q.pull());
		}
	}

}
