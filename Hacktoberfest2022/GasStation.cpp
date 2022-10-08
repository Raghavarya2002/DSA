// There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

// You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

// Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique

class Solution
{
public:
    int canCompleteCircuit(vector<int> &gas, vector<int> &cost)
    {
        long long int deficit = 0;
        long long int balance = 0;
        long long int start = 0;
        for (long long int i = 0; i < gas.size(); i++)
        {
            // purana balance add + current petrol - distance
            balance += gas[i] - cost[i];
            if (balance < 0)
            {
                // kitni kami reh gyi total
                deficit += balance;
                // jab 0 index 3 tk nhi ja paye to its gauranteed ki 1,2 se bhi nhi ja payenge bcoz all boxes are contributing positively
                start = i + 1;
                balance = 0;
            }
        }
        if (balance + deficit >= 0)
        {
            // agar balance aur kami milke 0 se bdi hai to mtlb petrol hai utna
            return start;
        }
        else
        {
            return -1;
        }
    }
};