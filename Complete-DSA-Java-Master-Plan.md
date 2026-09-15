# Complete DSA in Java Master Plan

## Purpose

This is an expanded plan for someone who already knows DSA in C and wants to
learn, implement, and revise the complete DSA syllabus in Java.

The plan has **31 days**:

- **Day 1:** Java revision for DSA
- **Days 2–31:** Complete DSA Master Tree

The advanced topics are included deliberately. Core interview topics receive
more implementation and problem-solving time; advanced topics receive
implementation, complexity analysis, and use-case revision.

## Daily Routine

Use this routine on every study day:

1. **45–60 minutes:** Read the concepts and write the important formulas.
2. **60–90 minutes:** Implement the data structure or algorithm from scratch.
3. **90–150 minutes:** Solve 3–6 problems without copying solutions.
4. **20–30 minutes:** Test edge cases and record time and space complexity.
5. **10 minutes:** Write what was difficult and what must be revised.

For every problem, record:

```text
Problem:
Pattern:
Brute-force approach:
Optimized approach:
Time complexity:
Auxiliary space:
Edge cases:
Mistake or insight:
```

---

# Day 1 — Java Revision for DSA

## Java language revision

- Variables, primitive types, casting, operators, and expressions
- `if`, `switch`, `for`, `while`, and enhanced `for`
- Methods, parameters, return values, pass-by-value, and recursion syntax
- Classes, objects, constructors, fields, methods, and access modifiers
- `static`, `final`, packages, imports, and exception basics
- Interfaces, inheritance, overriding, and comparable objects
- Generics and wrapper classes

## Java DSA essentials

- One-dimensional and two-dimensional arrays
- `String`, `StringBuilder`, and character arrays
- `ArrayList`, `LinkedList`, `HashMap`, `HashSet`
- `TreeMap`, `TreeSet`, `Deque`, `Queue`, and `PriorityQueue`
- `Comparator` and `Comparable`
- `Arrays` and `Collections` utility methods
- `BufferedReader`, `StringTokenizer`, and fast input
- Integer overflow and using `long`

## Required Java implementations

- Array traversal and copying
- `ListNode`, `TreeNode`, and graph edge classes
- Stack using `Deque`
- Queue using `ArrayDeque`
- Min heap and max heap using `PriorityQueue`
- A recursive and an iterative method

## Java checklist

- [ ] I can write a complete Java class without referring to syntax notes.
- [ ] I can choose between `int`, `long`, `StringBuilder`, and collections.
- [ ] I can explain Java reference variables and object mutation.
- [ ] I can compile and run a solution from the command line.

---

# Part I — Foundations and Mathematical Basics

## Day 2 — Foundations and Complexity

### Topics

- What is a data structure?
- What is an algorithm?
- Abstract data types and choosing a structure for a problem
- Input size and operation counting
- Best, average, and worst cases
- Big-O as an upper bound
- Big-Ω as a lower bound
- Big-Θ as a tight bound
- Space complexity, input space, and auxiliary space
- In-place algorithms
- Logarithms and common growth rates

### Recurrence relations

- Substitution method
- Recursion-tree intuition
- Master-theorem patterns
- `T(n) = T(n / 2) + O(1)` for binary search
- `T(n) = 2T(n / 2) + O(n)` for merge sort
- Exponential recursion and memoization

### Implement and analyze

- Linear search
- Binary search
- Recursive factorial and Fibonacci
- Merge sort recurrence
- Nested-loop complexity examples

---

## Day 3 — Mathematical Basics

### Topics

- Logarithms and powers of two
- Modular arithmetic and modulo properties
- Modular addition, multiplication, and exponentiation
- Prime numbers and trial division
- GCD using Euclid’s algorithm
- LCM using GCD
- Sieve of Eratosthenes

### Implement in Java

- `gcd(a, b)`
- `lcm(a, b)` using `long`
- Prime checking
- Sieve up to `n`
- Fast exponentiation
- Modular exponentiation

### Practice

- Count primes below `n`
- GCD of an array
- LCM of an array
- Count divisors
- Check powers of two

---

# Part II — Arrays and Strings

## Day 4 — Arrays: Traversal and Searching

### Topics

- Array traversal
- In-place modification
- Linear search
- Binary search
- Lower bound and upper bound
- Sorted-array reasoning
- Matrix and 2D-array representation

### Implement

- Linear search
- Iterative and recursive binary search
- First and last occurrence
- Matrix transpose
- Matrix rotation
- Spiral matrix traversal

---

## Day 5 — Prefix Sum, Sliding Window, and Two Pointers

### Topics

- Prefix sum
- Suffix sum
- Difference array
- Fixed-size sliding window
- Variable-size sliding window
- Two-pointer pattern
- Frequency maps inside a window

### Practice

- Range sum queries
- Maximum sum of a window
- Longest substring without repeating characters
- Minimum-size subarray
- Two Sum II
- 3Sum
- Container With Most Water

---

## Day 6 — Kadane’s Algorithm and 2D Arrays

### Topics

- Kadane’s algorithm
- Maximum subarray
- Maximum circular subarray
- Prefix/suffix maximum
- Matrix traversal
- 2D prefix sums
- Spiral traversal and matrix rotation

### Implement

- Maximum subarray sum
- Maximum subarray with index tracking
- Maximum circular subarray
- 2D range-sum query
- Set matrix zeroes

---

## Day 7 — String Manipulation and Palindromes

### Topics

- String immutability
- `StringBuilder`
- Character arrays
- Frequency counting
- String normalization
- Palindrome checking
- Expand-around-center palindrome technique
- String hashing basics

### Practice

- Reverse a string
- Valid palindrome
- Valid anagram
- Longest common prefix
- Longest palindromic substring
- Count palindromic substrings
- Group anagrams

---

## Day 8 — Pattern Matching

### Topics

- Naive pattern matching
- Prefix/LPS array
- KMP algorithm
- Rabin-Karp rolling hash
- Z algorithm
- Collision considerations in string hashing

### Implement

- Naive search
- LPS construction
- KMP search
- Rabin-Karp
- Z-function

### Practice

- Find the first occurrence of a pattern
- Repeated substring pattern
- Count pattern occurrences
- Find all matching indices

---

## Day 9 — Trie

### Topics

- Trie nodes and children
- Insert, search, and prefix search
- Word frequency in a trie
- Deleting a word
- Trie for lowercase letters and general characters

### Implement

- `Trie`
- `TrieNode`
- Word-frequency trie
- Prefix suggestions

### Practice

- Implement Trie
- Add and Search Words
- Replace Words
- Longest Word in Dictionary
- Word Search II

---

# Part III — Linked Lists, Stacks, Queues, and Hashing

## Day 10 — Linked Lists

### Topics

- Singly linked list
- Doubly linked list
- Circular linked list
- Insertion and deletion
- Reverse linked list
- Recursive reversal
- Floyd cycle detection
- Merge sorted lists

### Implement

- Singly linked list API
- Doubly linked list API
- Circular linked list API
- Iterative and recursive reverse
- Cycle detection and cycle entry
- Merge two sorted lists

### Practice

- Reverse Linked List
- Middle of the Linked List
- Linked List Cycle
- Remove Nth Node From End
- Merge Two Sorted Lists
- Copy List With Random Pointer

---

## Day 11 — Stack and Monotonic Stack

### Topics

- Stack implementation using an array
- Stack implementation using a linked list
- Balanced parentheses
- Next greater element
- Monotonic increasing stack
- Monotonic decreasing stack
- Min Stack

### Java pattern

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(value);
int top = stack.peek();
int removed = stack.pop();
```

### Practice

- Valid Parentheses
- Min Stack
- Next Greater Element
- Daily Temperatures
- Largest Rectangle in Histogram
- Remove K Digits

---

## Day 12 — Queue, Circular Queue, Deque, and Priority Queue

### Topics

- Queue implementation
- Circular queue
- Deque operations
- Priority queue
- Min-priority queue
- Max-priority queue
- Monotonic queue

### Java pattern

```java
Queue<Integer> queue = new ArrayDeque<>();
Deque<Integer> deque = new ArrayDeque<>();
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());
```

### Practice

- Implement Queue Using Stacks
- Design Circular Queue
- Sliding Window Maximum
- Kth Largest Element
- Top K Frequent Elements
- Task Scheduler

---

## Day 13 — Hashing

### Topics

- Hash tables and hash functions
- Hash collisions
- Collision handling with chaining
- Collision handling with open addressing
- Linear probing
- Load factor
- Rehashing and resizing
- Java `HashMap`, `HashSet`, `TreeMap`, and `TreeSet`

### Implement

- Hash table with chaining
- Hash table with linear probing
- Resize and rehash operation
- Frequency counter

### Practice

- Two Sum
- Contains Duplicate
- Longest Consecutive Sequence
- Subarray Sum Equals K
- First Missing Positive
- LRU Cache

---

# Part IV — Trees and Range Data Structures

## Day 14 — Binary Tree

### Topics

- Binary-tree node structure
- Inorder traversal
- Preorder traversal
- Postorder traversal
- Recursive traversals
- Iterative traversals
- Level-order traversal
- Height and depth
- Diameter

### Implement

- Recursive inorder, preorder, and postorder
- Iterative inorder, preorder, and postorder
- Level-order BFS
- Height
- Diameter

### Practice

- Maximum Depth of Binary Tree
- Same Tree
- Invert Binary Tree
- Binary Tree Level Order Traversal
- Diameter of Binary Tree
- Balanced Binary Tree

---

## Day 15 — Binary Search Tree and Heap

### Topics

- Binary Search Tree property
- BST search, insertion, and deletion
- BST validation
- Lowest common ancestor
- Min heap
- Max heap
- Heap insertion and deletion
- Heapify
- Build heap

### Implement

- BST
- BST deletion
- Array-based min heap
- Array-based max heap
- Heap sort

### Practice

- Validate Binary Search Tree
- Search in a BST
- Lowest Common Ancestor of a BST
- Kth Smallest Element in a BST
- Kth Largest Element
- Last Stone Weight

---

## Day 16 — AVL Tree and Red-Black Tree

### AVL topics

- Balance factor
- LL rotation
- RR rotation
- LR rotation
- RL rotation
- AVL insertion and deletion
- AVL complexity

### Red-Black Tree topics

- Red and black node rules
- Root and leaf properties
- Recoloring
- Left and right rotations
- Why operations remain `O(log n)`
- Relationship to Java `TreeMap` and `TreeSet`

### Implementation target

- Implement AVL insertion and rotations.
- Draw and explain Red-Black Tree insertion cases.
- Understand, but do not need to reimplement, the production-quality
  `TreeMap` balancing implementation.

---

## Day 17 — Segment Tree and Fenwick Tree

### Segment Tree

- Range-sum query
- Range-minimum query
- Build
- Point update
- Lazy propagation concept
- Complexity of build, query, and update

### Fenwick Tree

- Prefix sum
- Point update
- Lowbit operation
- Coordinate compression use case
- Complexity comparison with segment tree

### Implement

- Segment tree for range sum
- Segment tree for range minimum
- Fenwick tree for prefix sums

### Practice

- Range Sum Query
- Count smaller numbers after self
- Dynamic range sum
- Inversion count

---

# Part V — Graphs

## Day 18 — Graph Representation, BFS, and DFS

### Topics

- Directed and undirected graphs
- Weighted and unweighted graphs
- Adjacency matrix
- Adjacency list
- Edge list
- BFS
- DFS, recursive and iterative
- Connected components
- Grid traversal

### Implement

- Graph using adjacency matrix
- Graph using adjacency list
- BFS
- Recursive DFS
- Iterative DFS
- Grid BFS and DFS

### Practice

- Number of Islands
- Flood Fill
- Clone Graph
- Number of Provinces
- Find if Path Exists in Graph

---

## Day 19 — Topological Sort and Cycle Detection

### Topics

- Directed acyclic graph
- Kahn’s BFS topological sort
- DFS topological sort
- Cycle detection in directed graphs
- Cycle detection in undirected graphs
- Course dependency modeling

### Practice

- Course Schedule
- Course Schedule II
- Alien Dictionary
- Detect cycle in a directed graph
- Detect cycle in an undirected graph

---

## Day 20 — Shortest Paths

### Topics

- Dijkstra’s algorithm
- Bellman-Ford algorithm
- Negative edges and negative cycles
- Floyd-Warshall all-pairs shortest path
- Path reconstruction
- Choosing the correct shortest-path algorithm

### Implement

- Dijkstra with `PriorityQueue`
- Bellman-Ford
- Floyd-Warshall
- Parent-array path reconstruction

### Practice

- Network Delay Time
- Cheapest Flights Within K Stops
- Path With Minimum Effort
- Shortest path with negative edges
- All-pairs distance matrix

---

## Day 21 — Minimum Spanning Tree and Disjoint Set

### Topics

- Minimum spanning tree
- Kruskal’s algorithm
- Prim’s algorithm
- Disjoint Set / Union-Find
- Parent, rank, and size
- Path compression
- Union by rank
- Union by size

### Implement

- DSU
- Kruskal
- Prim with a priority queue

### Practice

- Redundant Connection
- Number of Connected Components
- Min Cost to Connect All Points
- Connecting cities with minimum cost
- Accounts Merge

---

# Part VI — Recursion, Backtracking, and Greedy Algorithms

## Day 22 — Recursion and Backtracking

### Topics

- Base case and recursive case
- Call-stack tracing
- Choosing, exploring, and undoing a choice
- Subsets
- Permutations
- Combinations
- Duplicate handling

### Implement and practice

- Generate subsets
- Generate permutations
- Combination Sum
- Generate Parentheses
- Letter Combinations of a Phone Number

---

## Day 23 — N-Queens and Sudoku Solver

### Topics

- Constraint satisfaction
- Row, column, and diagonal checks
- Bit-mask optimization
- Backtracking pruning
- Validating a Sudoku placement

### Implement

- N-Queens
- Sudoku solver
- N-Queens using sets
- N-Queens using bit masks

### Practice

- N-Queens
- Sudoku Solver
- Word Search
- Rat in a Maze

---

## Day 24 — Greedy Algorithms

### Topics

- Greedy choice property
- Proving a local choice is safe
- Activity selection
- Fractional knapsack
- Job scheduling and deadlines
- Huffman coding
- Interval scheduling

### Implement

- Activity selection
- Fractional knapsack
- Job sequencing with deadlines
- Huffman tree and codes

### Practice

- Activity Selection
- Fractional Knapsack
- Job Sequencing
- Merge Intervals
- Non-overlapping Intervals
- Jump Game

---

# Part VII — Dynamic Programming

## Day 25 — Dynamic Programming Fundamentals

### Topics

- Overlapping subproblems
- Optimal substructure
- State definition
- Transition or recurrence
- Base cases
- Memoization
- Tabulation
- Space optimization
- DP pattern recognition

### Implement

- Fibonacci with memoization
- Fibonacci with tabulation
- Climbing Stairs
- House Robber
- Coin Change

### Practice

- Climbing Stairs
- House Robber
- Coin Change
- Decode Ways
- Word Break

---

## Day 26 — 1D DP and Knapsack Variants

### Topics

- 1D DP
- 0/1 knapsack
- Unbounded knapsack
- Subset sum
- Equal partition
- Target sum
- Minimum coin change
- Counting combinations

### Implement

- 0/1 knapsack with 2D and 1D arrays
- Unbounded knapsack
- Subset sum
- Partition equal subset sum
- Target sum

### Practice

- 0/1 Knapsack
- Partition Equal Subset Sum
- Target Sum
- Coin Change II
- Rod Cutting

---

## Day 27 — 2D DP and Sequence DP

### Topics

- 2D DP
- Grid-state transitions
- Longest Common Subsequence
- Longest Increasing Subsequence
- Edit Distance
- Longest Palindromic Subsequence

### Implement and practice

- Unique Paths
- Minimum Path Sum
- Longest Common Subsequence
- Longest Increasing Subsequence
- Edit Distance
- Longest Palindromic Subsequence

---

## Day 28 — Matrix Chain Multiplication and DP Revision

### Topics

- Matrix Chain Multiplication
- Interval DP
- Partition DP
- Transition ordering
- Reconstructing the selected solution
- Comparing memoization and tabulation

### Implement

- Matrix Chain Multiplication
- Minimum-cost polygon or interval partition
- DP table reconstruction

### Revision checklist

- [ ] I can define a DP state.
- [ ] I can write the transition before writing code.
- [ ] I can identify base cases.
- [ ] I can convert memoization to tabulation.
- [ ] I can reduce space when only the previous row is needed.

---

# Part VIII — Bit Manipulation and Advanced DSA

## Day 29 — Bit Manipulation

### Topics

- Bitwise AND, OR, XOR, and NOT
- Left shift and right shift
- Set a bit
- Clear a bit
- Toggle a bit
- Check a bit
- Count set bits
- XOR tricks
- Bit masks and subset generation

### Implement and practice

- Check odd/even
- Check power of two
- Set, clear, and toggle a bit
- Brian Kernighan’s count-set-bits algorithm
- Single Number using XOR
- Missing Number using XOR
- Generate all subsets using bit masks

---

## Day 30 — Advanced DSA Survey and Implementation

Study the purpose, operations, complexity, and use cases of each structure:

### Sparse Table

- Static range queries
- Idempotent operations
- Preprocessing
- `O(1)` range query after preprocessing

### Heavy-Light Decomposition

- Decomposing a tree into heavy and light paths
- Combining with a segment tree
- Path queries and subtree queries

### Treap

- Binary Search Tree plus heap priority
- Split and merge
- Randomized balancing
- Expected `O(log n)` operations

### Splay Tree

- Splaying accessed nodes toward the root
- Amortized complexity
- Locality of reference
- Rotations

### Skip List

- Layered linked lists
- Randomized levels
- Search, insertion, and deletion
- Expected `O(log n)` operations

### Implementation target

Implement at least one of:

- Sparse table
- Skip list
- Treap

For the remaining structures, write operation pseudocode and complexity
comparisons. Revisit all five after the 31-day program.

---

# Day 31 — Interview Patterns, Mock Test, and Final Revision

## Interview patterns

### Two-pointer pattern

Use for sorted arrays, pair searches, partitioning, and palindrome checks.

### Sliding-window pattern

Use for contiguous subarrays or substrings with a changing validity condition.

### Binary-search pattern

Use for sorted data or when the answer space is monotonic.

### BFS/DFS pattern

Use for trees, grids, graph reachability, connected components, and shortest
paths in unweighted graphs.

### Greedy-choice pattern

Use when a local choice can be proven to preserve an optimal solution.

### DP pattern recognition

Ask:

1. Are subproblems repeated?
2. What is the state?
3. What choices are available?
4. What is the transition?
5. What are the base cases?
6. Can space be optimized?

## Three-hour mock test

Solve one problem from each category:

- Arrays and prefix/sliding window
- Strings or trie
- Linked list or stack
- Tree or heap
- Graph
- Greedy
- Dynamic programming

## Final revision

Reimplement without notes:

- Binary search
- Merge sort
- Kadane’s algorithm
- Sliding window
- Two pointers
- Linked-list reversal
- Floyd cycle detection
- Monotonic stack
- BFS and DFS
- Dijkstra
- Union-Find
- Trie
- Heap
- Segment tree or Fenwick tree
- Backtracking
- Memoization and tabulation

---

# Complete Topic Coverage Checklist

## 1. Foundations

- [ ] What is a data structure
- [ ] What is an algorithm
- [ ] Big-O
- [ ] Big-Ω
- [ ] Big-Θ
- [ ] Space complexity
- [ ] Recurrence relations

## 2. Mathematical Basics

- [ ] Logarithms
- [ ] Modular arithmetic
- [ ] Prime numbers
- [ ] GCD and LCM
- [ ] Sieve of Eratosthenes

## 3. Arrays

- [ ] Traversal
- [ ] Linear search
- [ ] Binary search
- [ ] Prefix sum
- [ ] Sliding window
- [ ] Two pointers
- [ ] Kadane’s algorithm
- [ ] Matrix and 2D arrays

## 4. Strings

- [ ] String manipulation
- [ ] Naive pattern matching
- [ ] KMP
- [ ] Rabin-Karp
- [ ] Z algorithm
- [ ] Palindrome problems
- [ ] String hashing
- [ ] Trie

## 5. Linked Lists

- [ ] Singly linked list
- [ ] Doubly linked list
- [ ] Circular linked list
- [ ] Reverse linked list
- [ ] Floyd cycle detection
- [ ] Merge lists

## 6. Stack

- [ ] Stack implementation
- [ ] Balanced parentheses
- [ ] Next greater element
- [ ] Monotonic stack
- [ ] Min stack

## 7. Queue

- [ ] Queue implementation
- [ ] Circular queue
- [ ] Deque
- [ ] Priority queue
- [ ] Monotonic queue

## 8. Hashing

- [ ] Hash tables
- [ ] Chaining
- [ ] Open addressing
- [ ] Load factor
- [ ] Rehashing

## 9. Trees

- [ ] Binary tree
- [ ] Inorder traversal
- [ ] Preorder traversal
- [ ] Postorder traversal
- [ ] Height and depth
- [ ] Diameter
- [ ] Binary Search Tree
- [ ] AVL tree
- [ ] Red-Black Tree
- [ ] Segment tree
- [ ] Fenwick tree
- [ ] Min heap
- [ ] Max heap

## 10. Graphs

- [ ] Adjacency matrix
- [ ] Adjacency list
- [ ] BFS
- [ ] DFS
- [ ] Topological sort
- [ ] Cycle detection
- [ ] Dijkstra
- [ ] Bellman-Ford
- [ ] Floyd-Warshall
- [ ] Kruskal
- [ ] Prim
- [ ] Disjoint Set / Union-Find

## 11. Recursion and Backtracking

- [ ] Recursion basics
- [ ] Subsets
- [ ] Permutations
- [ ] N-Queens
- [ ] Sudoku Solver

## 12. Greedy Algorithms

- [ ] Activity selection
- [ ] Huffman coding
- [ ] Fractional knapsack
- [ ] Job scheduling

## 13. Dynamic Programming

- [ ] Memoization
- [ ] Tabulation
- [ ] 1D DP
- [ ] 2D DP
- [ ] Knapsack variants
- [ ] Longest Common Subsequence
- [ ] Longest Increasing Subsequence
- [ ] Matrix Chain Multiplication

## 14. Bit Manipulation

- [ ] Bitwise operators
- [ ] Set and clear bits
- [ ] Count set bits
- [ ] XOR tricks

## 15. Advanced DSA

- [ ] Sparse table
- [ ] Heavy-Light Decomposition
- [ ] Treap
- [ ] Splay tree
- [ ] Skip list

## 16. Interview Patterns

- [ ] Two-pointer pattern
- [ ] Sliding-window pattern
- [ ] Binary-search pattern
- [ ] BFS/DFS pattern
- [ ] Greedy-choice pattern
- [ ] DP pattern recognition

---

# Completion Standard

The program is complete when:

- [ ] Every checklist item has been studied.
- [ ] Every core structure has a Java implementation.
- [ ] Every major algorithm has a written complexity analysis.
- [ ] At least 100 problems have been attempted.
- [ ] At least three timed mixed-problem sessions are complete.
- [ ] The final mock test is completed without copying solutions.
- [ ] Weak topics are scheduled for a second revision cycle.

