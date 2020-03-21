
package SortingWithComparator;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time2>
{
    public int compare(Time2 time1, Time2 time2){
        int hourCompare = time1.getHour() - time2.getHour(); //compare hour
        //test the hour first
        if(hourCompare !=0)
            return hourCompare;
        int minuteCompare = time1.getMinute()-time2.getMinute(); //compare minute
        //then test the minute
        if(minuteCompare != 0)
            return minuteCompare;
        int secondCompare = time1.getSecond()- time2.getSecond();//compare seconds
        return secondCompare; // return result of comparing seconds
    }//end method compare
    
}//end class TimeComparator
