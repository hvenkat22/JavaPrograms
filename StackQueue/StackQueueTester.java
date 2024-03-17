import java.util.ArrayList;
//Hari Venkataraman
//StackQueueTester
//In this file, you will write the methods that will thoroughly test your StackList and QueueList



public class StackQueueTester
{
	public String stringDump(QueueList<String> q)	{	
    String res = "";
    while(!q.isEmpty()){//While the QueueList has values.
      res+=(q.remove() + " ");//Dumps the values in the QueueList into a concatenated String.
    }
    return res;//Returns accordingly
  }
	 public String stringDump(StackList<String> s){	
    String result = "";
    while(!s.isEmpty()){
      result+=(s.pop() + " ");//Dumps the values in the StackList into a concatenated String.
    }
    return result;//Returns accordingly.
  }
	 public void removeName(QueueList<String> q, String name)	{	
     QueueList<String> tm = new QueueList<String>();
     while(!q.isEmpty()){
       if(q.peek().equals(name)){//Removes instances of name in the QueueList.
         q.remove();//Removes accordingly.
       } else{
         tm.add(q.remove());//Removes all of the Strings in q and adds them to the temporary QueueList.
       }
     }
     while(!tm.isEmpty()){
       q.add(tm.remove());//Maintains the original order of the elements in the original QueueList after removing.
     }
  }
	 public boolean stackSearch(StackList<String> s, String name)	{	
    StackList<String> s2 = new StackList<String>();
    boolean res2 = false;
    while(!s.isEmpty()){
      if(s.peek().equals(name)){//Searches for any instance of name in the StackList.
       res2 = true;//Result is true if so. 
      }
      s2.push(s.pop());//Repeats the same procedure as removeName.
    }
    while(!s2.isEmpty()){
      s.push(s2.pop());//Adds the Strings back into the original StackList.
    }
    return res2;
  }
	 public QueueList<String> splitString(String s)	{	
    QueueList<String> q2 = new QueueList<String>();
    String one = "";//Used as a storage tracker.
    for(int i=0; i<s.length(); i++){
      if(s.substring(i,i+1).equals(".") || s.substring(i,i+1).equals(" ")){
        //blank
      } else {
         one+=s.substring(i,i+1);
      }
      if(s.substring(i,i+1).equals(".") || s.substring(i,i+1).equals(" ")){
        q2.add(one);//Adds the String.
        one="";//Set back to a blank space for further additions.
      }
    }
    
    return q2;//Returns the QueueList accordingly.
  }
	 public QueueList<String> longestWords(QueueList<String> q)	{	
    QueueList<String> tp = new QueueList<String>();
    QueueList<String> s1 = new QueueList<String>();//Creates two QueueList. Temp is used for manipulations and s1 is the returning QueueList.
    int l = 0;//Tracker Variable.
    while(!q.isEmpty()){
      if(q.peek().length() >= l){
        l=q.peek().length();//Finds the maximum length.
      }
      tp.add(q.remove());//Adds to the QueueList but the original order is not maintained in the orignal QueueList.
    }
    while(!tp.isEmpty()){
      if(tp.peek().length() == l){
        s1.add(tp.peek());//Adds only the longest Strings to the resulting QueueList.
      }
      q.add(tp.remove());//Adds the remaining Strings back to the original QueueList that was passed in.
    }
    return s1;
  }
  
	public StackList<String> findDuplicates(StackList<String> s, QueueList<String> q)	{
     // Creates the result StackList, a temporary QueueList
		// and StackList, and an ArayList.
		StackList<String> result = new StackList<String>();
		StackList<String> sTemp = new StackList<String>();
		QueueList<String> qTemp = new QueueList<String>();
		ArrayList<String> words = new ArrayList<String>();
		boolean duplicate;
		
		// Loops through the QueueList and fills the ArrayList
		// with unique words.
		while (!q.isEmpty()) {

			// For each String, duplicate defaults to false
			duplicate = false;

			// If the String matches any of the previous Strings,
			// duplicate is set to true.
			for (String word: words) {
				if (q.peek().equals(word)) {
					duplicate = true;
				}
			}

			// Adds all non duplicate Strings to the ArrayList
			if (!duplicate) {
				words.add(q.peek());
			}

			// Moves every String to the temporary QueueList
			// after it's checked
			qTemp.add(q.remove());
		}

		// Moves all the Strings from qTemp back to
		// the original QueueList.
		while (!qTemp.isEmpty()) {
			q.add(qTemp.remove());
		}

		// Loops through the StackList and adds all Strings
		// that are also in the ArrayList to the result StackList.
		while (!s.isEmpty()) {

			// Every string in the StackList is compared to every String
			// in the ArrayList. If a match is found, the String is added
			// to result and removed from the ArrayList so that result
			// doesn't get duplicate Strings.
			for (int i=0; i<words.size(); i++) {
				if (s.peek().equals(words.get(i))) {
					result.push(s.peek());
					words.remove(i);
					break;
				}
			}

			// Each String is moved to the temporary StackList
			// after being checked.
			sTemp.push(s.pop());

		}

		// Moves all the Strings in sTemp back to the
		// orginal StackList.
		while (!sTemp.isEmpty()) {
			s.push(sTemp.pop());
		}

		// Returns the StackList with the duplicate words
		return result;

  } 
}