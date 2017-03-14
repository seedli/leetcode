package seed.leetcode.demo;

/**
 * Created by User on 2017/2/10.
 */
public class Interval {
    public int start;
    public int end;

    public Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }

    @Override
    public String toString(){
        return "start="+start+", end="+end;
    }
}
