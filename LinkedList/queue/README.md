# QUEUE intro

Queue structure is similar looks alike buy movie tickets. The first person in line gets their ticker first, and any newcomers join the end of the line.
The system, where the first person to arrive is the first to be served, is a queue in a real life. In computer science, a queue works on the same principle: `First In, First Out` (FIFO)

### Operations
* Insert (or PUSH): Putting an item into the end of the queue.
* Peek: Look at the first item of the queue.
* Remove (or POP): Remove the first item of the queue

# Dequeus

Imagine a bookshelf where you can add or remove books from both side.
This concept is a practical representation of a deque `(pronounced deck)`, a contraction of `Double-Ended Queue`. Where Deques provide flexibility by letting you interact from both ends.

Mostly Dequeues support 6 operations:
* Insert front(or push front): Putting an item in the beginning of the queue.
* Insert back(or push back): Putting an item in the end of the deque.
* Peek front: Look at the first item of the deque.
* Peek back: Look at the last item of the deque.
* Remove front (or pop front): Removing the item at the beginning of the deque.
* Remove back (or pop back): Removing the item at the end of the deque.

```python
from collections import deque

def rotate_left_till_zero(nums: list[int]) -> list[int]:
    # initialize a new deque out of nums.
    queue = deque(nums)
    # continue the loop till front of queue is 0
    while queue[0] != 0:
        # remove the front of the queue and add it into end
        queue.append(queue.popleft())
    # return list out of the queue
    return list(queue)

if __name__ == "__main__":
    nums = [int(x) for x in input().split()]
    res = rotate_left_till_zero(nums)
    print(" ".join(map(str, res)))
```