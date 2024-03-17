import java.util.LinkedList;

// Hari Venkataraman
// QueueList.java

public class QueueList<E>
{ 
  private LinkedList<E> list;
  public QueueList(){
    list = new LinkedList<E>();
  }
  public boolean add(E element){
    list.addLast(element);
    return true;
  }
  public E remove(){
    return list.removeFirst();
  }
  public E peek(){
    return list.getFirst();
  }
  public boolean isEmpty(){
    return list.size() == 0;
  }

}