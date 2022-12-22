class Solution {
    // TC : O(n)
    // res array store the result
    private int[] res;
    // count array store the count at each index of tree
    private int[] count;
    // it's help us to maintain count the adjacent nodes in tree
    private List<HashSet<Integer>> tree;
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        // assign the memory to these variables
        tree = new ArrayList<HashSet<Integer>>();
        res = new int[N];
        count = new int[N];
        // make the adjacency list
        for (int i = 0; i < N ; ++i)
            tree.add(new HashSet<Integer>());
        for (int[] e : edges) {
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }
        // it's help us to make count array and also update the res array
        // for further computations
        postOrder(0, -1);
        preOrder(0, -1);
        return res;
    }

    public void postOrder(int root, int pre) {
        for (int i : tree.get(root)) {
            // if previous element equal to current then we continue
            if (i == pre) continue;
            // postOrder to traversal to child
            postOrder(i, root);
            //  update the count array
            count[root] += count[i];
             // update the result
            res[root] += res[i] + count[i];
        }
        count[root]++;
    }


    public void preOrder(int root, int pre) {
        for (int i : tree.get(root)) {
             //  if current node equal to previous node then continue
            if (i == pre) continue;
            // res of i (res[i]) equals to res(res[root]) of root minus the closer nodes(- count[i]) 
            // plus the node are going further(+ count.length - count[i])
            res[i] = res[root] - count[i] + count.length - count[i];
            // preform the same opreation for childern nodes
            preOrder(i, root);
        }
    }
}
