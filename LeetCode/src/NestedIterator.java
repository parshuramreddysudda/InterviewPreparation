import java.util.*;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

public class NestedIterator implements Iterator<Integer> {
    public int  size(){
        return 0;
    }
    public boolean isInteger(){
        return true;
    }

//    Using Queue
    int index = 0;
    Queue<Integer> queue = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {


        for (int i = 0; i < nestedList.size(); i++) {
            if (nestedList.get(i).isInteger()) {
                queue.offer(nestedList.get(i).getInteger());
            } else {
                recurseList(nestedList.get(i));
            }
        }

    }

    public void recurseList(NestedInteger nestedInteger) {

        if (nestedInteger.isInteger()) {
            queue.offer(nestedInteger.getInteger());
        } else {
            for (int i = 0; i < nestedInteger.getList().size(); i++) {
                recurseList((NestedInteger) nestedInteger.getList().get(i));
            }
        }
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}


 class NestedIterator2 implements Iterator<Integer> {

    //Using List and Array List
    int index=0;
    List<Integer> list=new ArrayList<Integer>();
    public void NestedIterator(List<NestedInteger> nestedList) {


        for (int i = 0; i < nestedList.size(); i++) {
            if(nestedList.get(i).isInteger()){
                list.add(nestedList.get(i).getInteger());
                // System.out.println(" Executed1");
            }else {
                find(nestedList.get(i));
            }
        }

    }

    public void find(NestedInteger data){

        // System.out.println(" Executed2");

        if(data.isInteger()){
            list.add(data.getInteger());
        }else{
            for(int i=0;i<data.getList().size();i++)
            {
                find((NestedInteger) data.getList().get(i));
                // System.out.println(" Executed3");
            }
        }
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */