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
        int start = 1;
        int end = n;
        while(start <= end){
            int temp = (int) (start + (end-start)/2);
            int guess = guess(temp);
            if(guess == 0) return temp;
            else if(guess == -1) end = temp - 1;
            else start = temp + 1;
        }

        return -1;
    }
}