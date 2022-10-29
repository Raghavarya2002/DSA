class Solution {
public int earliestFullBloom(int[] plantTime, int[] growTime) {
		int arr[][] = new int[plantTime.length][2];
        for (int i = 0; i < plantTime.length; i++) {// creating 2D array for sorting
            arr[i][0] = growTime[i];
            arr[i][1] = plantTime[i];
        }
        // sort by grow time
        Arrays.sort(arr, (a, b) -> Double.compare(a[0], b[0]));
        // it sorts in ascending order by grow time
        int max = 0;
        int res = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = max + arr[i][1];// planting time
            res = Math.max(res, max + arr[i][0]);// max days (plant +grow)
        }
        return res;
	}
} 
