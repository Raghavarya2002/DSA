class Solution {
     public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;

		//find the left point
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x)
                left = mid + 1;
            else right = mid;
        }

        List<Integer> res = new LinkedList<>();
        right = left + k;
        while (left < right) res.add(arr[left++]);
        return res;
    }
}
