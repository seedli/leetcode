package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.Interval;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User on 2017/2/10.
 */
public class A56_MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {

        if(intervals.size() < 2) return intervals;

        //sort the list
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(final Interval object1, final Interval object2) {
                if(object1.start > object2.start) {
                    return 1;
                }else if(object1.start == object2.start){
                    if(object1.end > object2.end){
                        return 1;
                    }else if(object1.end < object2.end){
                        return -1;
                    }else{
                        return 0;
                    }
                }else{
                    return -1;
                }
            }
        });

        List<Interval> result = new LinkedList<>();

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        Iterator<Interval> it = intervals.iterator();
        it.next();

        while(it.hasNext()){
            Interval nextInterval = it.next();
            if(end < nextInterval.start){
                result.add(new Interval(start, end));
                start = nextInterval.start;
                end = nextInterval.end;
            }else if(end >= nextInterval.start && end < nextInterval.end){
                end = nextInterval.end;
            }

            if( ! it.hasNext()){
                result.add(new Interval(start, end));
            }
        }

        return result;
    }

}
