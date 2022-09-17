class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();

        int n = words.length;

        for (int i = 0; i < n; i++) {
            map.put(words[i], i);
            set.add(words[i].length());
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int len = words[i].length();

            if (len == 1) {
                if (map.containsKey("")) {
                    result.add(Arrays.asList(i, map.get("")));
                    result.add(Arrays.asList(map.get(""), i));
                }
                continue;
            }

            String rev = new StringBuilder(words[i]).reverse().toString();

            if (map.containsKey(rev) && map.get(rev) != i) {
                result.add(Arrays.asList(i, map.get(rev)));
            }

            for (Integer k : set) {
                if (k == len) break;

                if (isPalindrome(rev, 0, len - 1 - k)) {
                    String s1 = rev.substring(len - k);
                    if (map.containsKey(s1)) {
                        result.add(Arrays.asList(i, map.get(s1)));
                    }
                }

                if (isPalindrome(rev, k, len - 1)) {
                    String s2 = rev.substring(0, k);
                    if (map.containsKey(s2)) {
                        result.add(Arrays.asList(map.get(s2), i));
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}

// TC: O((n * log(n)) + (n * k^2))
// SC: O(2n) => O(n)
