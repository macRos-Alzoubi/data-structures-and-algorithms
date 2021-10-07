# Stacks and Queues

<!-- Short summary or background information -->

- Stack is an example of LIFO(Last in first out) data structure it insert to the top and take from the top of the stack.
- Queue is an example of FIFO(First in first out) data structure it insert to the back and take from the front from the
  queue.

## Challenge

<!-- Description of the challenge -->
Java implementation of Stack and Queue data structure.

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O{

### Queue:

- enqueue => space: O(1), time: O(1).
- dequeue => space: O(1), time: O(1).
- peek => space: O(1), time: O(1).
- isEmpty => space: O(1), time: O(1).

### Stack

- push => space: O(1), time: O(1).
- pop => space: O(1), time: O(1).
- peek => space: O(1), time: O(1).
- isEmpty => space: O(1), time: O(1). }

## API

<!-- Description of each method publicly available to your Stack and Queue-->

### Stack

- **push**

  adds a new node with a given value to the top of the stack with an O(1) Time performance.

- **pop**

  Removes the node from the top of the stack, and return the value from node from the top of the stack if stack is empty
  Should raise exception when it called.

- **peek**

  Returns the Value of the node located at the top of the stack, if the stack is empty should raise exception when
  called it.

- **isEmpty**

  Returns a Boolean indicating whether the stack is empty.

### Queue

- **enqueue**

  adds a new node with that value to the back of the queue with an O(1) Time performance.

- **dequeue**

  Removes the node from the front of the queue and return it value, if the queue is empty should rise exception when it
  git called.

- **peek**

  Returns the Value of the node located at the front of the queue, if the queue is empty should raise exception when
  called it.

- **isEmpty**

  Returns a Boolean indicating whether the queue is empty.
