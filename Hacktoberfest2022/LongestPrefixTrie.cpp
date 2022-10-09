
// TC O(L * N) L is lenght of first string and N is number of words in dictionary
// SC O(1) or O(L);
string longestCommonPrefix(vector<string> &arr, int n)
{
    string ans;
    for (int i = 0; i < arr[0].length(); i++)
    {
        char ch = arr[0][i];
        bool match = true;
        for (int j = 1; j < n; j++)
        {
            if (arr[j].length() < i || ch != arr[j][i])
            {
                match = false;
                break;
            }
        }
        if (!match)
        {
            break;
        }
        else
        {
            ans.push_back(arr[0][i]);
        }
    }
    return ans;
}

// Approach 2 using Trie
class TrieNode
{
public:
    char data;
    TrieNode *children[26];
    int childCount;
    bool isTerminal;

    TrieNode(char d)
    {
        this->data = d;
        for (int i = 0; i < 26; i++)
        {
            children[i] = NULL;
        }
        this->childCount = 0;
        this->isTerminal = false;
    }
};
class Trie
{
public:
    TrieNode *root;
    Trie(char ch)
    {
        this->root = new TrieNode(ch);
    }

    void insertUtil(TrieNode *root, string word)
    {
        // base case
        if (word.length() == 0)
        {
            root->isTerminal = true;
            return;
        }
        // word is in capital letters only
        int index = word[0] - 'a';
        TrieNode *child;
        if (root->children[index] != NULL)
        {
            child = root->children[index];
        }
        else
        {
            child = new TrieNode(word[0]);
            root->childCount++;
            root->children[index] = child;
        }

        insertUtil(child, word.substr(1));
    }

    void insertWord(string word)
    {
        insertUtil(root, word);
    }

    void lcp(string str, string &ans)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str[i];
            if (root->childCount == 1)
            {
                ans.push_back(ch);
                int index = ch - 'a';
                root = root->children[index];
            }
            else
            {
                break;
            }
            if (root->isTerminal)
            {
                break;
            }
        }
    }
};

string longestCommonPrefix(vector<string> &arr, int n)
{
    Trie *t = new Trie('\0');
    for (int i = 0; i < n; i++)
    {
        t->insertWord(arr[i]);
    }
    string first = arr[0];
    string ans = "";
    t->lcp(first, ans);
    return ans;
}
