class Solution
{
public:
    struct subset
    {
        int parent;
        int rank;
    };
    int find(vector<subset> &Parent, int x)
    {
        if (Parent[x].parent == -1)
        {
            return x;
        }
        return find(Parent, Parent[x].parent);
    }
    void Union(vector<subset> &Parent, int x, int y)
    {
        if (Parent[x].rank < Parent[y].rank)
        {
            Parent[x].parent = y;
        }
        else if (Parent[x].rank > Parent[y].rank)
        {
            Parent[y].parent = x;
        }
        else
        {
            Parent[y].parent = x;
            Parent[x].rank++;
        }
        return;
    }
    bool isSameRow(vector<vector<int>> &stones, int i, int j)
    {
        return stones[i][0] == stones[j][0];
    }
    bool isSameColumn(vector<vector<int>> &stones, int i, int j)
    {
        return stones[i][1] == stones[j][1];
    }
    int removeStones(vector<vector<int>> &stones)
    {
        int n = stones.size();
        // vector<vector<int>> edges;
        vector<subset> Parent(n, {-1, 0});
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (isSameRow(stones, i, j) or isSameColumn(stones, i, j))
                {
                    int x = find(Parent, i);
                    int y = find(Parent, j);
                    if (x != y)
                    {
                        Union(Parent, x, y);
                    }
                }
            }
        }

        int co = 0;
        for (int i = 0; i < n; i++)
        {
            if (Parent[i].parent == -1)
            {
                co++;
            }
        }
        return n - co;
    }
};