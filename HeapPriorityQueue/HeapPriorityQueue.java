//Written by: Hari Venkataraman
public class HeapPriorityQueue implements MaxPriorityQueue
{
  private Comparable[] heaparray;
  private int count;
  private int maxSize;
  public HeapPriorityQueue(int max){
    maxSize = max;
    heaparray = new Comparable[max+1];
    count = 0;
    //Initializing Instance Variables.
  }
  public boolean add(Comparable val){
    if(isFull()){
       System.out.println("Error. The Heap is full.");
       return false;
    } else{
      heaparray[count+1]=val;//Index 0 is never counted.
      count++;
      return addHelp(count);//Utilizes helped method for add.
    }
  }
  private boolean addHelp(int index){
    if(index/2 == 0){//If the value is a root
     return true;
    } else{
      if(heaparray[index].compareTo(heaparray[index/2]) > 0){
        Object tmp = heaparray[index/2];//Swapping values.
        heaparray[index/2]=heaparray[index];//The root would be set to the current.
        heaparray[index] = (Comparable)tmp;
        return true;
      } else{
        return addHelp(index/2);
      } 
    }
    
  }
  public int getCount(){
    return count;
  }
  public String toString(){
    String result = "";
    for(int i=1; i<count; i++){
      result+=heaparray[i] + ", ";//Adding values to a String separated by commas.
    }
    if(heaparray[count] != null){
      result+=heaparray[count];
    }
    return result;
  }
  public boolean isFull(){
    return count == maxSize;
  }
  public Comparable peekMax(){
    return heaparray[1];
  }
  public boolean isEmpty(){
    return count == 0;//To see if Heap is empty.
  }
  private void swap(int a, int b){
    Comparable tmp = heaparray[a];
    heaparray[a]=heaparray[b];
    heaparray[b]=tmp;
  }
  public Comparable removeMax(){
    if(isEmpty()){
      System.out.println("Error. The Heap is empty.");//If the Heap is empty.
      return null;
    }else{
      Comparable tmp = heaparray[1];
      heaparray[1]=heaparray[count];//Swapping the root.
      count--;//Decrementing
      removeHelp(1);//Utilizes helper method.
      return tmp;
    }
  }
  private boolean removeHelp(int b){
    if (b* 2 < count) {
      if (heaparray[b* 2].compareTo(heaparray[b* 2 + 1]) > 0) {
        if (heaparray[b].compareTo(heaparray[b* 2]) < 0) {//Sequential comparison to find maximum. Comparison to roots and children
          swap(b, b * 2);//Swap accordingly
          return removeHelp(b* 2);
        }
        else {
          return true;
        }
      }
      else {
        if (heaparray[b].compareTo(heaparray[b * 2 + 1]) < 0) {
          swap(b, b* 2 + 1);//Repeat
          return removeHelp(b* 2 + 1);
        }
        else{
         return true;
        } 
      }
    }
    else {
      return false;
    } 
  }
}