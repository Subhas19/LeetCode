/*
Gas Station 

There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.
*/

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];//should travel around the circuit once, so have to track the total amount
            tank += gas[i] - cost[i]; // may be negative
            if(tank < 0) //can not reach i+1 
                start = i+1;//update start
                tank = 0;
            }
        }
        if(total < 0)
            return -1;
        else
            return start;
    }
}