package com.epam;

/**
 * Created by Любовь on 11.03.2016.
 */
public enum MyDayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    public MyDayOfWeek nextDay(){
        int x = this.ordinal();

        if(x< 6){
            return MyDayOfWeek.values()[x + 1];
        }else  return MyDayOfWeek.values()[0];
        }
    }


