package seed.leetcode.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 2017/2/10.
 */
public class A56_MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {

        //sort the list
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(final Interval object1, final Interval object2) {
                if(object1.start > object2.start) {
                    return 1;
                }else if(object1.start == object2.start){
                    return 0;
                }else{
                    return -1;
                }
            }
        });

        List<Interval> result = new LinkedList<>();

        int fromIdx = 0;
        int toIdx = 0;
        int start = 0;
        int end = 0;

        while(fromIdx < intervals.size() && toIdx < intervals.size()){
            Interval from = intervals.get(fromIdx);
            Interval to = intervals.get(toIdx);
            start = from.start;
            if(from.end >= to.start){
                if(from.end >= to.end){ //eat
                    end = from.end;
                }else{ //merge
                    end = to.end;
                }
                toIdx++;
            }else if(from.end < to.start){
                end = from.end;
                result.add(new Interval(start,end));
                fromIdx = toIdx;
            }

        }

        return result;
    }

}
