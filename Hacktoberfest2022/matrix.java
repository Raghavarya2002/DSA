class matrix {

    static int solve(int arr[], int i, int j) {
        // if first and end are at same point
        if (i == j) {
            return 0;
        }
        // contains minimum number of matrix multipication
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int temp = solve(arr, i, k) + solve(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
            if (temp < min) {
                min = temp;
            }
        }
        // return minimum number of multipication count
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        System.out.println(solve(arr, 1, arr.length - 1));
    }
}
