// Hari Venkataraman
// RingBuffer.java

public class RingBuffer
{ 
	private char[] characters;
	private int front;
	private int rear;	

	public RingBuffer(int capacity)
	{ 
		characters = new char[capacity + 1];
		front = 0;
		rear = 0;
	}
	public boolean isEmpty(){
    return front == rear;//If front equals rear, then the front and last indexes are equal so the Queue is empty.
  }
  public void flush(){
    front = rear;//Empties the Queue. Front index equals rear index means the queue is empty.
  }
	public boolean add(char ch){
    if(front-rear==1 || rear-front==characters.length-1){
      return false;//The if loop conditions checks if the Queue is full. That first value minus the last value gives the difference in indexes.
    } else{
      characters[rear]=ch;//Indication of the end of the Queue.
      rear++;//Incrementation to move over one.
      if(rear==characters.length){
        rear = 0;//Set back to 0 if it already walked over the array.
      }
      return true;//Returns accordingly.
    }
  }
  public char remove(){
    if(isEmpty()){
      return ' ';//Space if it's empty.
    } else {
      char r2 = characters[front];//Character at the front of the array would be stored in r2.
      front++;//Incrementing to next.
      if(front == characters.length){
        front = 0;//Sets front back to 0(beginning) if front has walked over the array.
      }
      return r2;//Returns accordingly.
    }
  }
  public char peek(){
    if(isEmpty()){
      return '!';//This is returned if it's empty.
    } else {
      return characters[front];//Otherwise, returns the value at the front.
    }
  }
  public int getFront(){
    return front;//Returns the front value.
  }		 	
	public int getRear(){
    return rear;//Returns rear.
  }				
}