class Solution {
    // This function finds the maximum number of ice cream cones
    // that can be bought with the given amount of money.
    public int maxIceCream(int[] costs, int coins) {
        // Sort the costs in ascending order.
        Arrays.sort(costs);
        
        // Initialize the answer to 0 and the index to 0.
        int answer = 0, i = 0;
        
        // Loop while we can still afford to buy more ice cream cones.
        while(i < costs.length && coins >= costs[i]){
            // Reduce the amount of money we have left by the cost of the current ice cream cone.
            coins -= costs[i];
            // Increment the number of ice cream cones bought.
            answer++;
            // Move on to the next ice cream cone.
            i++;
        }
        
        // Return the final answer.
        return answer;
    }
}
