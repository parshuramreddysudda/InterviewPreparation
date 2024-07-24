package educative;

import java.util.*;
class MergeInterval {

    public static void main(String[] args) {
        List<Interval> list=new ArrayList<>();
        list.add(new Interval(2,4));
        list.add(new Interval(5,7));
        list.add(new Interval(9,15));
//        list.add(new Interval(16,18));
        List<Interval> list1=new ArrayList<>();
        list1.add(new Interval(1,4));
        list1.add(new Interval(5,6));
        list1.add(new Interval(7,8));
        list1.add(new Interval(9,15));
//        [[2,4],[5,7],[9,15]]
//        list1.add(new Interval(1,4));

//        System.out.println(Arrays.deepToString(merge(arr)));
        List<Interval> op=intervalsIntersection(list1,list);
        System.out.println(display(op));
//        System.out.println("Size is "+op.size());
//                op.forEach(x-> System.out.println("Start "+x.start+" End is "+x.end));
    }

    public static List <Interval> intervalsIntersection(List <Interval> intervalLista, List <Interval> intervalListb) {
        List <Interval> intersections = new ArrayList <>(); // to store all intersecting intervals
        // Your code will replce this placeholder return statement
        int lista=0;
        int listb=0;
       while (lista<intervalLista.size() && listb<intervalListb.size()){
           Interval la=intervalLista.get(lista);
           Interval lb=intervalListb.get(listb);
           if(la.start<=lb.end && la.end>=lb.start){
               intersections.add(new Interval(Math.max(la.start,lb.start),Math.min(la.end,lb.end)));
           }
        if(la.end<lb.end)
               lista++;
           else
               listb++;
       }
        return intersections;
    }

    public static int[][]  merge(int[][] intervals) {
        if(intervals.length==0)
            return new int[][]{};
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list= new ArrayList<>();
        list.add(intervals[0]);
        System.out.println(list);
        for (int i = 1; i <intervals.length ; i++) {
            int size=list.size()-1;
            if(list.get(size)[1]>=intervals[i][0])
                list.set(size,new int[]{list.get(size)[0],Math.max(intervals[i][1],list.get(size)[1])});
            else
                list.add(intervals[i]);
        }


        return list.toArray(new int[list.size()][]);
    }
    public static List <Interval> mergeIntervals(List <Interval> intervals) {

        if(intervals.size()==0)
            return new ArrayList<Interval>();

        List<Interval> output=new ArrayList<>();
        output.add(intervals.get(0));
        int index=1;
        while(index<intervals.size()){
            int end=output.get(output.size()-1).end;
            if(end>=intervals.get(index).start){
                if(end>intervals.get(index).end)
                    output.get(output.size()-1).setEnd(intervals.get(index).end);
            }else {
                output.add(intervals.get(index));
            }
            index++;
        }
        return output;

    }
    public static List <Interval> insertInterval(List <Interval> existingIntervals, Interval newInterval) {
        List <Interval> output = new ArrayList <Interval> ();
        newInterval.setClosed(true);
        int index=0;
        int newStart = newInterval.getStart();
        int newEnd = newInterval.getEnd();
        int size=existingIntervals.size();
        while(index<size && existingIntervals.get(index).getStart()<newStart)
            output.add(existingIntervals.get(index++));
//        display(output);
        if(output.size()==0 || output.get(output.size() - 1).getEnd() < newStart)
            output.add(newInterval);
        else
            output.get(output.size()-1).setEnd(Math.max(output.get(output.size()-1).end,newEnd));

        for(int i=index;i<existingIntervals.size();i++){
                Interval curr=existingIntervals.get(i);
                if(output.get(output.size()-1).getEnd()<=curr.getStart()){
                    output.add(existingIntervals.get(i));
                }else {
                    output.get(output.size() - 1).setEnd(Math.max(output.get(output.size() - 1).getEnd(), curr.end));

                }
        }
        System.out.println(display(output));
        return output;
    }

    public static String display(List<Interval> l1) {
        StringBuilder resultStr = new StringBuilder("[");
        if (!l1.isEmpty()) {
            for (int i = 0; i < l1.size() - 1; i++) {
                resultStr.append("[").append(l1.get(i).start).append(", ").append(l1.get(i).end).append("], ");
            }
            resultStr.append("[").append(l1.get(l1.size() - 1).start).append(", ").append(l1.get(l1.size() - 1).end).append("]");
        }
        resultStr.append("]");

        return resultStr.toString();
    }
}