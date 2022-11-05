// Efficient Approach
class Solution {

    private class TrieNode {
        private TrieNode[] children;
        private String word;
        TrieNode(){
            children = new TrieNode[26];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int m= board.length, n = board[0].length;

        // System.out.println(" Value is " + root.children['o' -'c']);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(board,  i, j, root, res);
            }
        }
        return res;
    }

    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == ';' || p.children[c - 'a'] == null) return;
        p = p.children[c - 'a'];
        if (p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = ';';
        if (i > 0) dfs(board, i - 1, j ,p, res);
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < board.length - 1) dfs(board, i + 1, j, p, res);
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }


    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode p = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (p.children[i] == null) p.children[i] = new TrieNode();
                p = p.children[i];
            }
            p.word = w;
        }
        return root;
    }

}

