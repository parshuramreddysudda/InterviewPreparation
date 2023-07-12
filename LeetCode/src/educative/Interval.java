package educative;

import java.util.*;
class Interval{
    int start;
    int end;
    boolean closed;
    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
        this.closed = true; // by default, the interval is closed
    }
    public int getStart()
    {
        return start;
    }

    public int getEnd(){
        return end;
    }
    public void setEnd(int end)
    {
        this.end = end;
    }


    // set the flag for closed/open
    public void setClosed(boolean closed)
    {
        this.closed = closed;
    }
}