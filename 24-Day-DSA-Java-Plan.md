# 24-Day DSA Mastery in Java

This folder contains the complete day-by-day learning plan.

---

## 📊 Progress Tracker

```
Day 01: ✅ Foundations          Day 13: ⬜ Advanced Trees
Day 02: ⬜ Java Basics          Day 14: ⬜ Graphs Basics
Day 03: ⬜ Arrays Basics        Day 15: ⬜ Graphs Intermediate
Day 04: ⬜ Arrays Advanced      Day 16: ⬜ Shortest Path
Day 05: ⬜ Strings Basics       Day 17: ⬜ MST
Day 06: ⬜ Strings Advanced     Day 18: ⬜ Recursion & Backtracking
Day 07: ⬜ Linked Lists         Day 19: ⬜ Greedy
Day 08: ⬜ Stack                Day 20: ⬜ DP Basics
Day 09: ⬜ Queue                Day 21: ⬜ DP Advanced
Day 10: ⬜ Hashing              Day 22: ⬜ Bit Manipulation
Day 11: ⬜ Binary Trees         Day 23: ⬜ Advanced DSA
Day 12: ⬜ BST & Heaps          Day 24: ⬜ Interview Patterns
```

---

## Program Overview

| Phase                                                 | Days   | Focus                                                  |
| ----------------------------------------------------- | ------ | ------------------------------------------------------ |
| **Phase 1** — Foundations & Linear DS          | 1–7   | Complexity, Java basics, arrays, strings, linked lists |
| **Phase 2** — Core DS                          | 8–13  | Stacks, queues, hashing, trees, heaps                  |
| **Phase 3** — Graphs & Problem Solving         | 14–19 | Graphs, shortest paths, MST, recursion, greedy         |
| **Phase 4** — Dynamic Programming & Bit Tricks | 20–22 | DP foundations, advanced DP, bit manipulation          |
| **Phase 5** — Advanced & Interview Prep        | 23–24 | Advanced structures, interview patterns, grand review  |

## ✅ Complete Topic Coverage

Every item from the DSA Master Tree is assigned to one of the 24 study days. The
checklist below is intentionally explicit so that no topic is hidden inside a
broader heading.

| Master Tree section          | Assigned day(s) | Covered topics                                                                                                                                                |
| ---------------------------- | --------------: | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1. Foundations               |               1 | Data structures, algorithms, time complexity, Big-O, Big-Ω, Big-Θ, space complexity, recurrence relations                                                   |
| 2. Java Basics               |               2 | Primitive/reference values, Java references, arrays, String immutability, StringBuilder, and pointer-style traversal                                             |
| 3. Arrays                    |            3–4 | Traversal, searching, linear search, binary search, prefix sum, sliding window, two pointers, Kadane’s algorithm, matrix/2D arrays                           |
| 4. Strings                   |            5–6 | String manipulation, naive matching, KMP, Rabin-Karp, Z algorithm, palindrome problems, string hashing, Trie                                                  |
| 5. Linked Lists              |               7 | Singly, doubly, circular, reverse linked list, Floyd cycle detection, merge lists                                                                             |
| 6. Stack                     |               8 | Stack implementation, balanced parentheses, next greater element, monotonic stack, min stack                                                                  |
| 7. Queue                     |               9 | Queue implementation, circular queue, deque, priority queue, monotonic queue                                                                                  |
| 8. Hashing                   |              10 | Hash tables, collision handling, chaining, open addressing, load factor, rehashing                                                                            |
| 9. Trees                     |          11–13 | Binary tree, traversals, inorder, preorder, postorder, height/depth, diameter, BST, AVL, red-black tree, segment tree, Fenwick tree, heap, min heap, max heap |
| 10. Graphs                   |          14–17 | Matrix/list representation, BFS, DFS, topological sort, cycle detection, Dijkstra, Bellman-Ford, Floyd-Warshall, Kruskal, Prim, disjoint set/Union-Find       |
| 11. Recursion & Backtracking |              18 | Recursion basics, subsets, permutations, N-Queens, Sudoku solver                                                                                              |
| 12. Greedy Algorithms        |              19 | Activity selection, Huffman coding, fractional knapsack, job scheduling                                                                                       |
| 13. Dynamic Programming      |          20–21 | Memoization, tabulation, 1D DP, 2D DP, knapsack variants, LCS, LIS, matrix chain multiplication                                                               |
| 14. Bit Manipulation         |              22 | Bitwise operators, set/clear bits, count set bits, XOR tricks                                                                                                 |
| 15. Advanced DSA             |              23 | Sparse table, heavy-light decomposition, Treap, Splay tree, Skip list                                                                                         |
| 16. Interview Patterns       |              24 | Two pointer, sliding window, binary search, BFS/DFS, greedy choice, DP pattern recognition                                                                    |

---

## 📁 Repository Structure

```
DSA_in_java/
├── README.md
├── Day01_Foundations/                    # DS, algorithms, time/space complexity
│   ├── TimeComplexity.java               # Big-O, Big-Ω, Big-Θ, growth rates
│   ├── SpaceComplexity.java              # input/auxiliary space, stack, in-place
│   └── RecurrenceRelations.java          # substitution, recursion tree, Master Theorem
├── Day02_JavaBasics/                     # Java values, references, arrays, and strings
│   ├── JavaBasics.java                   # primitives, methods, control flow, and input values
│   ├── ReferenceBehavior.java            # Java reference semantics and object mutation
│   ├── ArraysAndReferences.java          # array references, indexing, and in-place updates
│   ├── StringBasics.java                 # String immutability and StringBuilder
│   └── PointerStyleTraversal.java        # two-pointer and slow/fast-pointer patterns
├── Day03_Arrays_Basics/                  # traversal, searching, prefix sums
│   ├── Traversal.java                    # array traversal
│   ├── LinearSearch.java                 # linear search
│   ├── BinarySearch.java                 # binary search, lower/upper bounds
│   └── PrefixSum.java                    # prefix sums and difference arrays
├── Day04_Arrays_Advanced/                # sliding window, two pointers, Kadane, matrices
│   ├── SlidingWindow.java                 # fixed and variable windows
│   ├── TwoPointers.java                  # pair sum, 3Sum, container problems
│   ├── KadanesAlgorithm.java             # max subarray, circular and product variants
│   └── Matrix2D.java                     # 2D traversal, rotation, matrix search
├── Day05_Strings_Basics/                 # manipulation, naive matching, palindromes, hashing
│   ├── StringManipulation.java           # String, StringBuilder, char arrays
│   ├── NaivePatternMatch.java            # brute-force pattern matching
│   ├── PalindromeProblems.java            # palindrome problems
│   └── StringHashing.java                # polynomial rolling hash
├── Day06_Strings_Advanced/               # KMP, Rabin-Karp, Z algorithm, Trie
│   ├── KMPAlgorithm.java                 # prefix/failure function
│   ├── RabinKarp.java                    # rolling-hash matching
│   ├── ZAlgorithm.java                   # Z-array pattern matching
│   └── Trie.java                         # insert, search, prefixes, autocomplete
├── Day07_LinkedLists/                    # singly, doubly, circular, reverse, cycles, merge
│   ├── SinglyLinkedList.java             # singly linked list
│   ├── DoublyLinkedList.java             # doubly linked list
│   ├── CircularLinkedList.java           # circular linked list
│   ├── ReverseLinkedList.java            # iterative, recursive, groups of k
│   ├── FloydCycleDetection.java          # cycle detection and cycle start
│   └── MergeLists.java                   # merge sorted and k sorted lists
├── Day08_Stack/                          # implementation, parentheses, NGE, monotonic, min
│   ├── StackImplementation.java          # array, linked-list, and Deque stacks
│   ├── BalancedParentheses.java          # balanced and generated parentheses
│   ├── NextGreaterElement.java           # NGE and stock span
│   ├── MonotonicStack.java               # monotonic stack and histogram
│   └── MinStack.java                     # O(1) minimum
├── Day09_Queue/                          # queue, circular queue, deque, priority, monotonic
│   ├── QueueImplementation.java          # array and linked-list queues
│   ├── CircularQueue.java                # wrap-around queue
│   ├── DequeDemo.java                   # deque and window operations
│   ├── PriorityQueueDemo.java            # priority queue and comparators
│   └── MonotonicQueue.java               # window maximum/minimum
├── Day10_Hashing/                        # tables, collisions, load factor, rehashing
│   ├── HashTableChaining.java            # separate chaining
│   ├── HashTableOpenAddressing.java      # linear, quadratic, double hashing
│   ├── LoadFactorDemo.java               # load-factor performance
│   └── RehashingDemo.java                # dynamic resizing and rehashing
├── Day11_BinaryTree/                     # binary tree, traversals, height, diameter
│   ├── BinaryTree.java                   # tree nodes and construction
│   ├── InorderTraversal.java             # inorder traversal
│   ├── PreorderTraversal.java            # preorder traversal
│   ├── PostorderTraversal.java           # postorder traversal
│   ├── HeightDepth.java                  # height, depth, balance
│   └── Diameter.java                     # tree diameter
├── Day12_BST_and_Heap/                   # BST, AVL tree, min heap, max heap
│   ├── BinarySearchTree.java             # BST operations
│   ├── AVLTree.java                      # AVL rotations and balance
│   ├── MinHeap.java                      # min heap and heap sort
│   └── MaxHeap.java                      # max heap and heapify
├── Day13_AdvancedTrees/                  # red-black tree, segment tree, Fenwick tree
│   ├── RedBlackTreeConcepts.java         # red-black properties and rotations
│   ├── SegmentTree.java                 # range queries and lazy propagation
│   └── FenwickTree.java                 # point updates and prefix/range queries
├── Day14_Graphs_Basics/                  # matrix/list representation, BFS, DFS
│   ├── AdjacencyMatrix.java              # adjacency matrix
│   ├── AdjacencyList.java                # adjacency list
│   ├── BFS.java                          # BFS and unweighted shortest path
│   └── DFS.java                          # DFS and connected components
├── Day15_Graphs_Intermediate/            # topological sort, cycle detection, Union-Find
│   ├── TopologicalSort.java              # DFS and Kahn's algorithm
│   ├── CycleDetection.java               # directed and undirected cycles
│   └── DisjointSetUnionFind.java         # rank and path compression
├── Day16_ShortestPath/                   # Dijkstra, Bellman-Ford, Floyd-Warshall
│   ├── Dijkstra.java                    # non-negative weighted shortest path
│   ├── BellmanFord.java                 # negative edges and cycles
│   └── FloydWarshall.java               # all-pairs shortest path
├── Day17_MST/                            # minimum spanning trees
│   ├── KruskalAlgorithm.java             # sorted edges and Union-Find
│   └── PrimAlgorithm.java                # priority-queue MST
├── Day18_Recursion_Backtracking/         # recursion, subsets, permutations, N-Queens, Sudoku
│   ├── RecursionBasics.java              # recursion fundamentals
│   ├── Subsets.java                      # subsets
│   ├── Permutations.java                 # permutations
│   ├── NQueens.java                      # N-Queens
│   └── SudokuSolver.java                 # Sudoku backtracking
├── Day19_Greedy/                         # activity, Huffman, fractional knapsack, scheduling
│   ├── ActivitySelection.java            # activity selection
│   ├── HuffmanCoding.java                # Huffman coding
│   ├── FractionalKnapsack.java           # fractional knapsack
│   └── JobScheduling.java                # job sequencing and deadlines
├── Day20_DP_Basics/                      # memoization, tabulation, 1D DP, 2D DP
│   ├── Memoization.java                  # top-down DP
│   ├── Tabulation.java                   # bottom-up DP
│   ├── DP_1D.java                        # one-dimensional DP
│   └── DP_2D.java                        # two-dimensional DP
├── Day21_DP_Advanced/                    # knapsack, LCS, LIS, matrix-chain multiplication
│   ├── Knapsack01.java                   # 0/1 and variant knapsack problems
│   ├── LCS.java                          # longest common subsequence
│   ├── LIS.java                          # longest increasing subsequence
│   └── MatrixChainMultiplication.java    # matrix-chain multiplication
├── Day22_BitManipulation/                # operators, set/clear, counting, XOR
│   ├── BitwiseOperators.java             # AND, OR, XOR, NOT, shifts
│   ├── SetClearBits.java                 # set, clear, toggle, check
│   ├── CountSetBits.java                 # Brian Kernighan and bitCount
│   └── XORTricks.java                    # single number and XOR patterns
├── Day23_AdvancedDSA/                    # sparse table, Heavy-Light Decomposition, Treap, Splay, Skip List
│   ├── SparseTable.java                  # O(1) range queries
│   ├── HeavyLightDecomposition.java      # tree path decomposition
│   ├── Treap.java                        # randomized BST/heap
│   ├── SplayTree.java                    # splay operations
│   └── SkipList.java                     # probabilistic layered list
└── Day24_InterviewPatterns/              # two-pointer, window, search, graph, greedy, DP
    ├── TwoPointerPattern.java            # two-pointer pattern
    ├── SlidingWindowPattern.java        # sliding-window pattern
    ├── BinarySearchPattern.java          # binary-search pattern
    ├── BFS_DFS_Pattern.java              # BFS/DFS pattern
    ├── GreedyChoicePattern.java          # greedy-choice pattern
    └── DPPatternRecognition.java         # DP pattern recognition
```

---

## 📅 Day-by-Day Breakdown

---

### Day 1 — Foundations & Complexity Analysis

**Goal**: Build the vocabulary and analysis skills used in every later day.

#### Required topics

- [X] What is a data structure: linear vs non-linear, static vs dynamic, and abstract data types
- [X] What is an algorithm: input, output, correctness, termination, and efficiency
- [X] Time complexity: counting operations and expressing growth as a function of `n`
- [X] **Big-O (`O`)**: asymptotic upper bound and worst-case growth
- [X] **Big-Ω (`Ω`)**: asymptotic lower bound and best-case growth
- [X] **Big-Θ (`Θ`)**: tight asymptotic bound when upper and lower bounds match
- [X] Best-case, average-case, and worst-case analysis
- [X] Common growth rates: `O(1)`, `O(log n)`, `O(n)`, `O(n log n)`, `O(n²)`, `O(2ⁿ)`, and `O(n!)`
- [ ] Space complexity: input space, auxiliary space, recursion stack, and in-place algorithms
- [ ] Recurrence relations: substitution method, recursion-tree method, and Master Theorem

#### Notation comparison

| Notation     | Meaning                                                        | Example                                |
| ------------ | -------------------------------------------------------------- | -------------------------------------- |
| `O(f(n))`  | The algorithm grows no faster than`f(n)` asymptotically      | Merge sort is`O(n log n)`            |
| `Ω(f(n))` | The algorithm grows at least as fast as`f(n)` asymptotically | Scanning an unsorted array is`Ω(n)` |
| `Θ(f(n))` | The algorithm grows exactly at the rate`f(n)` asymptotically | Array indexing is`Θ(1)`             |

#### Day 1 deliverables

1. Explain the difference between `O`, `Ω`, and `Θ` in your own words.
2. Analyze ten loops and recursive functions and state their time and space complexity.
3. Derive the recurrence for merge sort and solve it as `Θ(n log n)`.
4. Record the analysis in `TimeComplexity.java`, `SpaceComplexity.java`, and
   `RecurrenceRelations.java`.

| File                         | What You'll Learn                                              |
| ---------------------------- | -------------------------------------------------------------- |
| `TimeComplexity.java`      | O(1) through O(2ⁿ) with timing benchmarks                     |
| `SpaceComplexity.java`     | In-place vs auxiliary space, stack depth, Java memory analysis |
| `RecurrenceRelations.java` | Master Theorem, common recurrences, memoization speedup        |

**Practice**: Analyze time/space complexity of 10 code snippets

---

### Day 2 — Java Basics for DSA

**Goal**: Build the Java foundation needed to write safe and clear DSA
solutions. Java does not expose raw pointers; object and array variables hold
references, so pointer-style algorithms are expressed with indexes and
references.

#### Required topics

- [ ] Primitive values, reference values, variables, methods, and control flow
- [ ] Java pass-by-value semantics, including what happens when a reference is passed to a method
- [ ] Arrays as mutable objects, indexing, bounds, and in-place updates
- [ ] `String` immutability, comparison with `.equals()`, and common string operations
- [ ] `StringBuilder` for efficient repeated edits
- [ ] Pointer-style traversal with left/right indexes and slow/fast references
- [ ] Choosing `char[]`, `String`, or `StringBuilder` for a problem

#### Core rules

| Topic | Rule |
| ----- | ---- |
| Primitive argument | A method receives a copy of the primitive value |
| Object argument | A method receives a copy of the reference; the referenced object may still be mutated |
| String comparison | Use `.equals()` for content, not `==` |
| String updates | `String` creates a new value; `StringBuilder` mutates its buffer |
| Array indexing | Valid indexes are `0` through `array.length - 1` |
| Pointer-style loops | Move indexes/references deliberately and define the stopping condition |

#### Day 2 deliverables

1. Explain the difference between primitive values and object references.
2. Demonstrate Java pass-by-value behavior without calling references raw pointers.
3. Implement array updates, reversal, and a two-pointer pair search.
4. Implement string comparison, reversal, palindrome checking, and `StringBuilder` edits.
5. Practice slow/fast reference movement and record the examples in the Day 2 files.

| File | What You'll Learn |
| ---- | ----------------- |
| `JavaBasics.java` | Primitive values, methods, loops, and control flow |
| `ReferenceBehavior.java` | References, mutation, reassignment, and pass-by-value |
| `ArraysAndReferences.java` | Array references, in-place reversal, and pair search |
| `StringBasics.java` | String content comparison, immutability, and `StringBuilder` |
| `PointerStyleTraversal.java` | Left/right indexes and slow/fast pointer-style traversal |

**Practice**: Reverse an array, validate a palindrome, solve Two Sum on a sorted
array, and explain every reference mutation.

---

### Day 3 — Arrays: Basics & Searching

**Topics**: Traversal, Linear Search, Binary Search, Prefix Sum

| File                  | What You'll Learn                                               |
| --------------------- | --------------------------------------------------------------- |
| `Traversal.java`    | Enhanced for-loop, Arrays.stream(), index-based patterns        |
| `LinearSearch.java` | Generic linear search with Comparable\<T\>                      |
| `BinarySearch.java` | Iterative + recursive, Arrays.binarySearch(), lower/upper bound |
| `PrefixSum.java`    | 1D prefix sum, range sum queries, difference arrays             |

**Practice**: Two Sum, Maximum Subarray (prefix sum), Range Sum Query

---

### Day 4 — Arrays: Advanced Techniques

**Topics**: Sliding Window, Two Pointers, Kadane's Algorithm, Matrix / 2D Arrays

| File                      | What You'll Learn                                      |
| ------------------------- | ------------------------------------------------------ |
| `SlidingWindow.java`    | Fixed-size window, variable-size window with HashMap   |
| `TwoPointers.java`      | Pair sum, 3Sum, container with most water              |
| `KadanesAlgorithm.java` | Max subarray sum, max circular subarray, max product   |
| `Matrix2D.java`         | Spiral traversal, rotate 90°, search in sorted matrix |

**Practice**: Longest Substring Without Repeating Characters, Trapping Rain Water

---

### Day 5 — Strings: Basics

**Topics**: String Manipulation, Naive Pattern Matching, Palindromes, String Hashing

| File                        | What You'll Learn                                           |
| --------------------------- | ----------------------------------------------------------- |
| `StringManipulation.java` | String vs StringBuilder vs char[], immutability             |
| `NaivePatternMatch.java`  | Brute-force O(nm) pattern matching                          |
| `PalindromeProblems.java` | Palindrome check, longest palindromic substring, Manacher's |
| `StringHashing.java`      | Polynomial rolling hash, hash-based comparison              |

**Practice**: Valid Anagram, Longest Palindromic Substring, Group Anagrams

---

### Day 6 — Strings: Advanced Pattern Matching & Trie

**Topics**: KMP, Rabin-Karp, Z Algorithm, Trie

| File                  | What You'll Learn                           |
| --------------------- | ------------------------------------------- |
| `KMPAlgorithm.java` | Failure function + KMP search               |
| `RabinKarp.java`    | Rolling hash pattern matching               |
| `ZAlgorithm.java`   | Z-array construction + pattern search       |
| `Trie.java`         | Insert, search, prefix search, autocomplete |

**Practice**: Implement Trie, Word Search II, Repeated String Match

---

### Day 7 — Linked Lists

**Topics**: Singly, Doubly, Circular, Reverse, Floyd's Cycle Detection, Merge

| File                         | What You'll Learn                             |
| ---------------------------- | --------------------------------------------- |
| `SinglyLinkedList.java`    | Full generic implementation with Node\<T\>    |
| `DoublyLinkedList.java`    | Forward/backward traversal                    |
| `CircularLinkedList.java`  | Insertion, deletion, traversal                |
| `ReverseLinkedList.java`   | Iterative + recursive, reverse in groups of K |
| `FloydCycleDetection.java` | Detect cycle, find start, cycle length        |
| `MergeLists.java`          | Merge two sorted lists, merge K sorted lists  |

**Practice**: Reverse Linked List, Linked List Cycle II, Merge K Sorted Lists

---

### Day 8 — Stack

**Topics**: Stack Implementation, Balanced Parentheses, NGE, Monotonic Stack, Min Stack

| File                         | What You'll Learn                              |
| ---------------------------- | ---------------------------------------------- |
| `StackImplementation.java` | Array-based + LinkedList-based, Deque as stack |
| `BalancedParentheses.java` | Valid parentheses, generate parentheses        |
| `NextGreaterElement.java`  | NGE for circular array, stock span             |
| `MonotonicStack.java`      | Largest rectangle in histogram                 |
| `MinStack.java`            | O(1) getMin with auxiliary stack               |

**Practice**: Valid Parentheses, Largest Rectangle in Histogram, Daily Temperatures

---

### Day 9 — Queue

**Topics**: Queue Implementation, Circular Queue, Deque, Priority Queue, Monotonic Queue

| File                         | What You'll Learn                             |
| ---------------------------- | --------------------------------------------- |
| `QueueImplementation.java` | Array-based circular + LinkedList-based       |
| `CircularQueue.java`       | Fixed-size with wrap-around                   |
| `DequeDemo.java`           | ArrayDeque operations, sliding window max     |
| `PriorityQueueDemo.java`   | PriorityQueue with Comparator, custom objects |
| `MonotonicQueue.java`      | Sliding window maximum/minimum                |

**Practice**: Sliding Window Maximum, Top K Frequent Elements, Task Scheduler

---

### Day 10 — Hashing

**Topics**: Hash tables, collision handling (chaining and open addressing), load factor, rehashing

| File                             | What You'll Learn                                 |
| -------------------------------- | ------------------------------------------------- |
| `HashTableChaining.java`       | Custom hash table with separate chaining          |
| `HashTableOpenAddressing.java` | Linear probing, quadratic probing, double hashing |
| `LoadFactorDemo.java`          | Performance degradation demo                      |
| `RehashingDemo.java`           | Dynamic resizing with rehashing                   |

**Practice**: Two Sum (HashMap), Subarray Sum Equals K, Longest Consecutive Sequence

---

### Day 11 — Binary Trees

**Topics**: Binary Tree, Traversals, Height/Depth, Diameter

| File                        | What You'll Learn                               |
| --------------------------- | ----------------------------------------------- |
| `BinaryTree.java`         | TreeNode class, build from array                |
| `InorderTraversal.java`   | Recursive + iterative + Morris traversal        |
| `PreorderTraversal.java`  | Recursive + iterative                           |
| `PostorderTraversal.java` | Recursive + iterative (two-stack and one-stack) |
| `HeightDepth.java`        | Height of tree, depth of node, balanced check   |
| `Diameter.java`           | Diameter with single-pass optimization          |

**Practice**: Level Order Traversal, Maximum Depth, Diameter, Symmetric Tree

---

### Day 12 — BST & Heaps

**Topics**: Binary Search Tree, AVL Tree, heap, min heap, max heap

| File                      | What You'll Learn                        |
| ------------------------- | ---------------------------------------- |
| `BinarySearchTree.java` | Insert, delete, search, floor/ceiling    |
| `AVLTree.java`          | LL, RR, LR, RL rotations, self-balancing |
| `MinHeap.java`          | Array-based min-heap, heapify, heap sort |
| `MaxHeap.java`          | Array-based max-heap, build in O(n)      |

**Practice**: Validate BST, Kth Smallest in BST, Kth Largest Element

---

### Day 13 — Advanced Trees

**Topics**: Red-Black Tree, Segment Tree, Fenwick Tree

| File                          | What You'll Learn                            |
| ----------------------------- | -------------------------------------------- |
| `RedBlackTreeConcepts.java` | Properties, rotations, TreeMap internals     |
| `SegmentTree.java`          | Build, update, range query, lazy propagation |
| `FenwickTree.java`          | Point update, prefix/range query, 2D BIT     |

**Practice**: Range Sum Query - Mutable, Count of Smaller Numbers After Self

---

### Day 14 — Graphs: Basics

**Topics**: Adjacency Matrix & List, BFS, DFS

| File                     | What You'll Learn                                   |
| ------------------------ | --------------------------------------------------- |
| `AdjacencyMatrix.java` | Weighted/unweighted, directed/undirected            |
| `AdjacencyList.java`   | ArrayList\<List\<Integer\>\> representation         |
| `BFS.java`             | Level-order, shortest path unweighted, multi-source |
| `DFS.java`             | Recursive + iterative, connected components         |

**Practice**: Number of Islands, Clone Graph, Flood Fill, Rotten Oranges

---

### Day 15 — Graphs: Intermediate

**Topics**: Topological Sort, Cycle Detection, Disjoint Set (Union-Find)

| File                          | What You'll Learn                                 |
| ----------------------------- | ------------------------------------------------- |
| `TopologicalSort.java`      | DFS-based + Kahn's BFS algorithm                  |
| `CycleDetection.java`       | Directed (DFS coloring) + undirected (Union-Find) |
| `DisjointSetUnionFind.java` | Union by rank, path compression                   |

**Practice**: Course Schedule I & II, Redundant Connection, Number of Provinces

---

### Day 16 — Shortest Path Algorithms

**Topics**: Dijkstra, Bellman-Ford, Floyd-Warshall

| File                   | What You'll Learn                           |
| ---------------------- | ------------------------------------------- |
| `Dijkstra.java`      | PriorityQueue-based, path reconstruction    |
| `BellmanFord.java`   | Edge relaxation, negative cycle detection   |
| `FloydWarshall.java` | All-pairs shortest path, transitive closure |

**Practice**: Network Delay Time, Cheapest Flights Within K Stops

---

### Day 17 — Minimum Spanning Tree

**Topics**: Kruskal's Algorithm, Prim's Algorithm

| File                      | What You'll Learn                  |
| ------------------------- | ---------------------------------- |
| `KruskalAlgorithm.java` | Sort edges + Union-Find            |
| `PrimAlgorithm.java`    | PriorityQueue-based, lazy vs eager |

**Practice**: Min Cost to Connect All Points

---

### Day 18 — Recursion & Backtracking

**Topics**: Recursion Basics, Subsets, Permutations, N-Queens, Sudoku Solver

| File                     | What You'll Learn                    |
| ------------------------ | ------------------------------------ |
| `RecursionBasics.java` | Factorial, Fibonacci, Tower of Hanoi |
| `Subsets.java`         | All subsets, subsets with duplicates |
| `Permutations.java`    | All permutations, next permutation   |
| `NQueens.java`         | Board visualization, count solutions |
| `SudokuSolver.java`    | Constraint-based backtracking        |

**Practice**: Subsets, Permutations, N-Queens, Combination Sum

---

### Day 19 — Greedy Algorithms

**Topics**: Activity Selection, Huffman Coding, Fractional Knapsack, Job Scheduling

| File                        | What You'll Learn                              |
| --------------------------- | ---------------------------------------------- |
| `ActivitySelection.java`  | Sort by finish time, greedy selection          |
| `HuffmanCoding.java`      | Huffman tree with PriorityQueue, encode/decode |
| `FractionalKnapsack.java` | Sort by value/weight ratio                     |
| `JobScheduling.java`      | Job sequencing with deadlines                  |

**Practice**: Jump Game, Gas Station, Meeting Rooms II

---

### Day 20 — Dynamic Programming: Basics

**Topics**: Memoization, Tabulation, 1D DP, 2D DP

| File                 | What You'll Learn                             |
| -------------------- | --------------------------------------------- |
| `Memoization.java` | Top-down with HashMap and int[] memo          |
| `Tabulation.java`  | Bottom-up, space optimization                 |
| `DP_1D.java`       | Climbing stairs, house robber, coin change    |
| `DP_2D.java`       | Unique paths, minimum path sum, edit distance |

**Practice**: Climbing Stairs, House Robber, Coin Change, Edit Distance

---

### Day 21 — Dynamic Programming: Advanced

**Topics**: 0/1 Knapsack, LCS, LIS, Matrix Chain Multiplication

| File                               | What You'll Learn                               |
| ---------------------------------- | ----------------------------------------------- |
| `Knapsack01.java`                | 0/1 knapsack (2D + space-optimized), subset sum |
| `LCS.java`                       | Longest Common Subsequence, print LCS           |
| `LIS.java`                       | O(n²) DP + O(n log n) patience sorting         |
| `MatrixChainMultiplication.java` | MCM with memoization + tabulation               |

**Practice**: 0/1 Knapsack, LCS, LIS, Partition Equal Subset Sum

---

### Day 22 — Bit Manipulation

**Topics**: Bitwise Operators, Set/Clear Bits, Count Set Bits, XOR Tricks

| File                      | What You'll Learn                            |
| ------------------------- | -------------------------------------------- |
| `BitwiseOperators.java` | AND, OR, XOR, NOT, shifts (>> vs >>>)        |
| `SetClearBits.java`     | Set, clear, toggle, check bit                |
| `CountSetBits.java`     | Brian Kernighan's, Integer.bitCount()        |
| `XORTricks.java`        | Single number, swap without temp, XOR 1 to n |

**Practice**: Single Number, Number of 1 Bits, Reverse Bits, Power of Two

---

### Day 23 — Advanced Data Structures

**Topics**: Sparse Table, Heavy-Light Decomposition, Treap, Splay Tree, Skip List

| File                             | What You'll Learn                     |
| -------------------------------- | ------------------------------------- |
| `SparseTable.java`             | Range min/max/GCD in O(1) query       |
| `HeavyLightDecomposition.java` | Tree path queries with segment tree   |
| `Treap.java`                   | BST + heap, split/merge operations    |
| `SplayTree.java`               | Splay operation, amortized O(log n)   |
| `SkipList.java`                | Probabilistic multi-level linked list |

**Practice**: Range Minimum Query, competitive programming problems

---

### Day 24 — Interview Patterns & Grand Review

**Topics**: All 6 major interview patterns

| Pattern        | When To Use                     | Template                      |
| -------------- | ------------------------------- | ----------------------------- |
| Two Pointer    | sorted array, pair, palindrome  | `left = 0, right = n-1`     |
| Sliding Window | subarray, substring, contiguous | `expand right, shrink left` |
| Binary Search  | sorted, min/max, monotonic      | `lo, hi, mid, search space` |
| BFS/DFS        | connected, path, level          | `queue/stack + visited`     |
| Greedy         | optimal, schedule, interval     | `sort + local choice`       |
| DP             | count ways, min/max cost        | `state + transition + base` |

---
