# Collections
> The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.


<figure>
<img width="100%" alt="Hierarchy of the Collection Framework in Java" src="https://media.geeksforgeeks.org/wp-content/uploads/20230124151239/Collections-in-Java-768.png">
   <figcaption>Hierarchy of the Collection Framework in Java</figcaption>
</figure>

## List
List is an ordered collection that maintains insertion order of elements. Allows duplicate elements.

### ArrayList:
* Resizable array implementation.
* Provides random access by index in constant time.
* Not synchronized.
* Better for storing and accessing data.

```
List<String> fruits = new ArrayList<>();  
fruits.add("Apple");
fruits.get(0); // "Apple"
```
### LinkedList:
* Implemented as doubly linked list.
* Good for frequent additions and deletions from ends.
* Not synchronized.
* Better for manipulating data.

```
List<String> fruits = new LinkedList<>();
fruits.addFirst("Apple");
fruits.removeLast();
```
### Vector:
* Synchronized version of ArrayList.
* Thread-safe.
* Less used now.
### Stack:
* Stack represents a last-in, first-out (LIFO) stack of objects.
* Stack class in Java extends Vector
* it is synchronized and thread-safe.

```
Stack<Integer> stack = new Stack<>();
stack.push(1); // Add to top
stack.pop(); // Returns and removes top element (1)
```
**For better performance, ArrayDeque can be used as a stack:**

```
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);  
stack.pop();
```

---

## Set
Set contains unique elements with no duplicates.

### HashSet:
* Implements using hashing for fast performance.
* Elements are unordered.
* Allows null value.
* Not synchronized.
```
Set<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.contains("Mango"); // false
```
### LinkedHashSet:
* Maintains insertion order of elements.
* Slightly slower than HashSet.
* Not synchronized.

### TreeSet:

* Implements sorted set using Red-Black tree.
* Not synchronized.
* Null elements not allowed.

```
Set<Integer> set = new TreeSet<>();
set.add(3);
set.add(1);
System.out.println(set); // [1, 3]
```

---

## Queue
Queue provides first-in, first-out (FIFO) operations.

### LinkedList:
* Implements queue using doubly linked list.
* All queue methods are O(1).
* Not synchronized.
```
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);
queue.poll(); // 1
```
### PriorityQueue:
* Orders elements by priority.
* Elements must be Comparable.
* Not synchronized.
```
  Queue<Integer> queue = new PriorityQueue<>();
  queue.offer(5);
  queue.offer(3);
  queue.peek(); // 3 (natural ordering)
```
---

## Deque
Deque (double ended queue) provides insertion and removal at both ends.

* ArrayDeque is the most common deque implementation.
* Based on resizable array.
* Very fast O(1) add and poll.
* Not thread-safe.
```
Deque<String> deque = new ArrayDeque<>();
deque.offerFirst("A"); // Add to front
deque.offerLast("Z"); // Add to end
deque.pollFirst(); // "A"
deque.pollLast(); // "Z"
```
LinkedList also implements Deque and provides similar functions.
* Slightly slower than ArrayDeque.
* Not thread-safe.

Some key differences from Queue:
* Deque allows adding/removing from both ends.
* Queue allows only add to end, remove from head.

---

## Map
Map maps keys to values. Does not inherit from Collection.

### HashMap:
* Most common implementation using hashing.
* Fast performance for lookups and adds.
* Not synchronized.
* Permits null keys/values.
```
Map<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.get("apple"); // 10
```

### LinkedHashMap:

* Maintains insertion order of elements.
* Slightly slower than HashMap.
* Not synchronized.

### TreeMap:
* Implements sorted map with navigable keys.
* Not synchronized.
* Null keys not allowed.

---

### Resources
* [java-topics](https://github.com/AsmaaIR/java-topics).
* [collections-in-java](https://www.javatpoint.com/collections-in-java).
* [collections-in-java-2](https://www.geeksforgeeks.org/collections-in-java-2/).
* [java-collection](https://www.simplilearn.com/tutorials/java-tutorial/java-collection).
* [collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html).
* [java-collections-interview-questions](https://www.javatpoint.com/java-collections-interview-questions).



## Scenarios and Solutions

### 1. Frequent Insertions and Deletions
**Scenario**: Managing a large collection where frequent insertions and deletions are expected, and random access is not a primary concern.

**Collection**: `LinkedList`
- **Why**: Provides efficient insertion and deletion operations.

### 2. Inventory Management System
**Scenario**: Tracking available stock of products, each identified by a unique product ID and corresponding quantity.

**Collection**: `HashMap<ProductID, Integer>`
- **Why**: Enables fast retrieval, insertion, and deletion using product ID as the key.

### 3. User Activity Tracking System
**Scenario**: Maintaining the order of user actions while ensuring each action is unique.

**Collection**: `LinkedHashSet<Action>`
- **Why**: Preserves insertion order and guarantees uniqueness.

### 4. Social Media Post Management
**Scenario**: Handling millions of user posts daily and displaying the latest posts efficiently based on timestamps.

**Collection**: `PriorityQueue<Post>` (with a custom comparator for timestamps)
- **Why**: Efficiently retrieves elements based on priority (timestamps).

### 5. Game Leaderboard
**Scenario**: Tracking the top 10 players' high scores.

**Collection**: `TreeSet<Player>` (with a custom comparator for scores)
- **Why**: Maintains a sorted order and ensures no duplicates, suitable for limiting to the top 10 scores.

### 6. Movie Recommendation System
**Scenario**: Storing movie data and user preferences to suggest movie recommendations based on previous choices.

**Collections**:
- **Movie Data**: `HashMap<MovieID, MovieDetails>`
- **User Preferences**: `HashMap<UserID, List<MovieID>>`
- **Why**: Allows fast access to movie details and user preferences.

### 7. Caching Mechanism
**Scenario**: Ensuring each cached item is unique and maintained in the order of its insertion.

**Collection**: `LinkedHashMap<K, V>`
- **Why**: Preserves insertion order and guarantees unique keys.

### 8. User Session Data
**Scenario**: Storing user session data with each user having a unique session ID, requiring quick retrieval by session ID.

**Collection**: `HashMap<SessionID, SessionData>`
- **Why**: Provides fast access and retrieval by session ID.

### 9. Blog Post Comments
**Scenario**: Storing user comments on a blog post where duplicates are allowed, and the order of insertion is preserved.

**Collection**: `ArrayList<Comment>`
- **Why**: Maintains insertion order and allows duplicates.

### 10. Task Scheduler
**Scenario**: Scheduling tasks to be executed based on their priority.

**Collection**: `PriorityQueue<Task>`
- **Why**: Efficiently handles and retrieves tasks based on their priority.





### Contact
Ahmed Alhalwagy | [@alhalwagy](https://github.com/alhalwagy)


