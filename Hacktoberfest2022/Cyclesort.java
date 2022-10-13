public class Cyclesort{
  public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        System.out.println(firstMissingPositive(arr));
    }

    // leetcode 41
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                return idx + 1;
            }
        }

        return arr.length + 1;
    }
  // leet code 268
    static int MissingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // case 2
        return arr.length;
    }
   // leetcode 645
    static int[] find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1 ;
            if (arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int[] number = { -1, -1 };
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                number[0] = arr[idx];
                number[1] = idx + 1;

            }
        }
        return number; 

    }
  // leetcode 448 & 442
    static ArrayList<Integer> missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[i] != arr[current] ) {
                swap(arr, i, current);
            } else {
                i++;
            }
        }
        // just find missing numbers
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // ans.add(index + 1);
                ans.add(arr[index]);
            }
        }
        return ans;
    }
  // leetcode 287
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;

    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
