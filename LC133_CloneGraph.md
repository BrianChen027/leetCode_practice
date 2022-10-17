# 133. Clone Graph

#### Given a reference of a node in a connected undirected graph.
#### Return a deep copy (clone) of the graph.
#### Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
![image](https://user-images.githubusercontent.com/97871497/196217950-412249dc-a589-4f75-afc2-4592dc4b2ed4.png)


##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196218055-1ebea08c-c656-4e98-9745-16dc3e3b8930.png)
#####    Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
#####    Output: [[2,4],[1,3],[2,4],[1,3]]
##### Example 2: 
#####    Input: adjList = [[]]
#####    Output: []

```
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        Node nodeC = new Node(node.val);
        map.put(node, nodeC);

        for(Node neighbor:node.neighbors){
            Node nodeNbor = null;
            if(map.containsKey(neighbor)){
                nodeNbor = map.get(neighbor);
            }else{
                nodeNbor = cloneGraph(neighbor);
            }
            nodeC.neighbors.add(nodeNbor);
        }
        return nodeC;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196218973-c7392ec1-8704-42f6-893e-116e5265e89d.png)
