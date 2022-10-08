// Using BFS
#include <iostream>
#include <unordered_map>
#include <list>
#include <queue>
class Solution
{
public:
    bool isCyclicBFS(unordered_map<int, list<int>> &adjList, unordered_map<int, bool> &visited, int node)
    {
        queue<int> q;
        unordered_map<int, int> childParent;
        q.push(node);
        visited[node] = true;
        childParent[node] = -1;

        while (!q.empty())
        {
            int frontNode = q.front();
            q.pop();
            for (auto neighbor : adjList[frontNode])
            {
                if (!visited[neighbor])
                {
                    q.push(neighbor);
                    visited[neighbor] = true;
                    childParent[neighbor] = frontNode;
                }
                else
                {
                    if (neighbor != childParent[frontNode])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    string cycleDetection(vector<vector<int>> &edges, int n, int m)
    {
        unordered_map<int, list<int>> adjList;
        for (int i = 0; i < edges.size(); i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];

            adjList[u].push_back(v);
            adjList[v].push_back(u);
        }

        unordered_map<int, bool> visited;

        for (int i = 0; i < n; i++)
        {
            if (!visited[i])
            {
                bool ans = isCyclicBFS(adjList, visited, i);
                if (ans)
                {
                    return "Yes";
                }
            }
        }
        return "No";
    }
};
