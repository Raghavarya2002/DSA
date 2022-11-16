/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int mid = n/2;
        int end = n;
        while (guess(mid) != 0) {
            mid = low + (end - low) / 2;
            if (guess(mid) == -1) {
                end = mid - 1;
            }
            if (guess(mid) == 1) {
                low = mid + 1;
            }
        }
        return mid;
    }
}
