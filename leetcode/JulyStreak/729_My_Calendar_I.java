class MyCalendar {
    TreeMap<Integer,Integer> mp = null;
    
    public MyCalendar() {
    mp = new TreeMap<>();    
    }
    
    //floorEntry -> Lower Entry value
    //CeilingEntry -> High Entry Value
    
    public boolean book(int start, int end) {
        //condtion around start time => start < lower entry end time
        if(mp.floorEntry(start) != null && start < mp.floorEntry(start).getValue())
            return false;
        //condition around end time => end > higher entry start time
        if(mp.ceilingEntry(start) != null && end > mp.ceilingEntry(start).getKey())
            return false;
        
        mp.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
