You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

 

Example 1:

Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:

Input: nums = [-1]
Output: [0]
Example 3:

Input: nums = [-1,-1]
Output: [0,0]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
Accepted
242,101
Submissions
573,481




















/* code c++*/

struct Item {
  int num;
  int index;
  Item(int num = 0, int index = 0) : num(num), index(index) {}
};

class Solution {
 public:
  vector<int> countSmaller(vector<int>& nums) {
    const int n = nums.size();
    vector<int> ans(n);
    vector<Item> items(n);

    for (int i = 0; i < n; ++i)
      items[i] = Item(nums[i], i);

    mergeSort(items, 0, n - 1, ans);
    return ans;
  }

 private:
  void mergeSort(vector<Item>& items, int l, int r, vector<int>& ans) {
    if (l >= r)
      return;

    const int m = (l + r) / 2;
    mergeSort(items, l, m, ans);
    mergeSort(items, m + 1, r, ans);
    merge(items, l, m, r, ans);
  }

  void merge(vector<Item>& items, int l, int m, int r, vector<int>& ans) {
    vector<Item> sorted(r - l + 1);
    int k = 0;           // sorted's index
    int i = l;           // left's index
    int j = m + 1;       // right's index
    int rightCount = 0;  // # of nums < items[i].num

    while (i <= m && j <= r)
      if (items[i].num > items[j].num) {
        ++rightCount;
        sorted[k++] = items[j++];
      } else {
        ans[items[i].index] += rightCount;
        sorted[k++] = items[i++];
      }

    // put possible remaining left part to the sorted array
    while (i <= m) {
      ans[items[i].index] += rightCount;
      sorted[k++] = items[i++];
    }

    // put possible remaining right part to the sorted array
    while (j <= r)
      sorted[k++] = items[j++];

    copy(begin(sorted), end(sorted), begin(items) + l);
  }
};
