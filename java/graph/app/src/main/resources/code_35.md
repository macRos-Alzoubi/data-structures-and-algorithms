# Graphs

<!-- Short summary or background information -->
Graph is a non-liner data structure that consist of a collection of nodes and edges witch represents the connection
between nodes and edges can also have a wight

## Challenge

<!-- Description of the challenge -->
graph data structure implementation in java

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
adjacency list approach

## API

<!-- Description of each method publicly available in your Graph -->

- add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph
- add edge
  - Arguments: 2 nodes to be connected by the edge, weight (optional)
  -  Returns: nothing
  -  Adds a new edge between two nodes in the graph
  -  If specified, assign a weight to the edge
  -  Both nodes should already be in the Graph

- get nodes
  - Arguments: none
  -  Returns all of the nodes in the graph as a collection (set, list, or similar)

- get neighbors
  - Arguments: node
  -  Returns a collection of edges connected to the given node
  -  Include the weight of the connection in the returned collection

- size
  - Arguments: none
  -  Returns the total number of nodes in the graph
