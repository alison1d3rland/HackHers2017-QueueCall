public class QueueCall{

	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfPeople=0;
	
	QueueCall(int size){
		queueSize = size;
		queueArray = new String(size);
		Array.fill(queueArray, "-1");
	}

	public void insert(String input){
		if(numberOfPeople+1 <= queueSize){
			queueArray[rear] = input;
			rear++;
		}

	}
	
	public static void main(String[] args){
		
	}

}
