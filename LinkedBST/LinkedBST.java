import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
//Hari Venkataraman
//LinkedBST.java
//Binary Search Tree Assignment
public class LinkedBST{
  private TreeNode root;
  public LinkedBST(){
    root = null;//Initialize instance variabes.
  }
  public boolean addNode(Comparable addMe){
    if(root == null){
      root = new TreeNode(addMe);//Checks empty case and creates a new root node.
      return true;
    } else{
       return helperForAdd(addMe,root);//For the rest of the nodes folowing root.
    }
    
  }
  private boolean helperForAdd(Comparable add, TreeNode curr){
    if(add.equals(curr.getValue())){//Cheking duplicates.
      return false;
    } else{
      if(add.compareTo(curr.getValue()) < 0){//Checks to the left
        if(curr.getLeft() == null){//If the left is empty then there's free space to add a TreeNode
          curr.setLeft(new TreeNode(add));//Adds a new TreeNode to the left of the current node
          return true;
        } else{
         return helperForAdd(add,curr.getLeft());//Recursive call to move on to next node.
        } 
      }else{
        if(curr.getRight() == null){//Repeats same process as adding left.
          curr.setRight(new TreeNode(add));//Adds new TreeNode to the right of the current node.
          return true;
        }else{
         return helperForAdd(add,curr.getRight());//Recursive call repeat
        }
      }
    }
    
  }
  public List preOrder(){
   List l1 = new ArrayList();//Creates new ArrayList but a list is returned.
   this.preOrderTraverse(root,l1);
   return l1;
  }
  private void preOrderTraverse(TreeNode current, List list){
    if(current != null){
      list.add(current.getValue());//Root, left, and right.
      preOrderTraverse(current.getLeft(),list);
      preOrderTraverse(current.getRight(),list);
    }
  }
  public List inOrder(){
   List l = new ArrayList();//Same repeat.
   this.inOrderTraverse(root, l);
   return l;
  }
  private void inOrderTraverse(TreeNode current, List list){
    if(current != null){
      inOrderTraverse(current.getLeft(),list);
      list.add(current.getValue());//Left, root and then right.
      inOrderTraverse(current.getRight(),list);
    }
  }
  public List postOrder(){
    List l2 = new ArrayList();//Same Repeat
    this.postOrderTraverse(root, l2);
    return l2;
  }
  private void postOrderTraverse(TreeNode current, List list){
    if(current != null){
      postOrderTraverse(current.getLeft(),list);
      postOrderTraverse(current.getRight(),list);//Left,right and Root
      list.add(current.getValue());
    }
  }
   public boolean deleteNode(Comparable find){
     if(root == null) return false; //if tree doesnt exist, nothing to remove
		else if(root.getLeft() == null && root.getRight() == null) {
			root = null;
			return true;//to account for only a root in the tree
		}
		else if(search(find) == true) { //enable to make sure that that value actually exists in the tree
			TreeNode previous = root;
			TreeNode current = root;//trackers
			while(!(find.compareTo(current.getValue()) == 0)) {//find the value
				previous = current;
				if(current == null) return false;
				else if(find.compareTo(current.getValue()) < 0) {
					current = current.getLeft();
				}
				else if(find.compareTo(current.getValue()) > 0) {
					current = current.getRight();
				}//now the value of the root is stored in the current thingy and the previous node is in "previous" 
			}
			if(current.getLeft() == null && current.getRight() == null) {//root node
				if(find.compareTo(previous.getValue()) < 0) {//node before
					previous.setLeft(null); //this is determining where and then setting that node to null so it just gets delted (it is last node)
				}
				else if(find.compareTo(previous.getValue()) > 0) {
					previous.setRight(null);
				}
			}
			//check on the left side 
			else if(current.getRight() == null) {
				if(current == root) root = current.getLeft(); //if the root is being deleted, replace root with the left side
				else if(previous.getLeft() == current) {//if current was on left side
					previous.setLeft(current.getLeft());
				}
				else if(previous.getRight() == current) {
					previous.setRight(current.getLeft()); //if current was on right side
				}
			}
			//check on the right side
			else if(current.getLeft() == null) {
				if(current == root) root = current.getRight(); //if root is being deleted, replace root with right side
				else if(previous.getRight() == current) { //if current is on right side of previous
					previous.setRight(current.getRight());
				}
				else if(previous.getLeft() == current) { //if current is on left side of previous
					previous.setLeft(current.getRight());
				}
			}
			//if both children exist
			else {
				TreeNode original = previous;
				TreeNode y = current;
				current = current.getLeft();
				if(current.getRight() == null) { //down the left path
					y.setValue(current.getValue()); //move up, since current was set to the left
					y.setLeft(current.getLeft());
				}
				else { //down the right path
					while(!(current.getRight() == null)) {
						previous = current;
						current = current.getRight(); //move down
					}
					y.setValue(current.getValue()); //set values accordingly
					previous.setRight(current.getLeft());
				}
			}
			return true;
		}
		return false;//never gets here
   }
   public boolean search(Comparable key){
     return search(root,key);//Uses Private Helper Method of search.
   }
   private boolean search(TreeNode current, Comparable key){
     if(current == null){
       return false;//Empty Case
    } else {
      if(current.getValue().equals(key)){
        return true;//If the value directly equals the comparable.
      } else if(key.compareTo(current.getValue()) > 0){
        return search(current.getRight(),key);//Moves to the right 
      } else {
        return search(current.getLeft(),key);//Moves to the right
      }
    }
   }
   public int countLeaf(){
     return countLeaf(root);
   }
   private int countLeaf(TreeNode current){
     if(current == null){
       return 0;
     } else {
        if(current.getLeft() == null && current.getRight() == null){
          return 1;
        } else {
           return( countLeaf(current.getLeft()) + countLeaf(current.getRight()) );
        }
     }
   }
   public int countNode(){
     return countNode(root);//Calls private helper method.
   }
   private int countNode(TreeNode current){
     if(current == null){
       return 0;//No Nodes present if pointer is pointing to null
     } else {
       return 1 + countNode(current.getLeft()) + countNode(current.getRight());//Adds the rest of the nodes together including  the 1 at the beginning.
     }
   }
   public int findPath(Comparable find){
     if(root == null){
       return -1;//If the tree is empty.
     } else if(search(find)){
       return findPath(root,find);
     } else {
       return -1;
     }
   }
   private int findPath(TreeNode current, Comparable find){
      if(current==null) //Testing empty case.
    {
      return 0;
    }
    else
    {
      if(find.equals(current.getValue())) //If find is in the tree
      {
        return 0;
      }
      else if(find.compareTo(current.getValue())<0) 
      {
        return 1 + findPath(current.getLeft(), find); //Walks down the left branch if find is less than current's value
      }
      else 
      {
        return 1 + findPath(current.getRight(), find); //Walks down the right branch if find is greater current's value
      }
    }
  }
  public List levelOrder() {
		// Creates the ArrayList that will be returned at the end
		List result = new ArrayList();
		// Checks if the tree is empty
		if (root != null) {
			// Creates a temp pointer and a queue of TreeNodes
			TreeNode temp;
			Queue<TreeNode> q1 = new LinkedList<TreeNode>();
			// Adds the root to the queue
			q1.add(root);
			// While there are still nodes in the queue, it adds the children of
			// the node at the front to the back of the queue, adds the node at the
			// front to the result List, and removes that node from the queue.
			while (!q1.isEmpty()) {
				// Removes the node at the front of the queue and points temp at it
				temp = q1.remove();
				// Adds that node's value to the ArrayList
				result.add(temp.getValue());
				// If that node has a left child, the child is added to the queue
				if (temp.getLeft() != null) {
					q1.add(temp.getLeft());
				}
				// If that node has a right child, that child is also added to the queue
				if (temp.getRight() != null) {
					q1.add(temp.getRight());
				}
				// As a result of the queue, the values of the node's children are added
				// only after the values of it's siblings have been added
			}
		}
		// Returns the ArrayList. If the tree was empty, nothing was added, so the
		// ArrayList would also be empty.
		return result;
	}
  
   
}