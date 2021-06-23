# Lesson 1

Stacks implementation using ArraysArrayLists, Link list
Dont implement a stack in which you can access/ see the most bottom item first. - How can you prevent this practically? ENCAPSULATION

Stack Operations & Complexities
Push O(1) - Can be expensive
Pop O(1) - Deletes item from stack
Peek O(1) - Seeing what's at the top of the stack
Don't lose the refernece to the item at the top
Size (size of the array), Capacity (items in the array)
For an empty stack, the top index is -1

In order to push, you start by incrementing
Capacity is always top +1

Increasing stack size upon overflowing capacity
- create a new array,
- copy the original array into the new array
- push value to the top of the newly created array

#Applications of stacks
1. Checking for balanced  -
Traverse a string,
anytime you find an opening bracket, you push into the stack,
anytime you find a closing bracket, you pop. 
If the stack is empty, there is balanced parenthensis, and vice versa

2. Reversing a string - 
create an empty stack of characters, 
convert given string into character arrays, 
remove characters from the stack until it becomed empty, 
assign back to character array, 
convert character array back tp string.

3. Back button on a browser
browser stores urls you've visited in a stack,
upon clicking the back button, it pops the top most url

4. Function calls - Stackoverflow
- Recursion takes away a lot of space quickly in a stack

5. Command pattern (Design patterns) - (Redo and undo buttons)


# LESSON 2 - QUEUES
Normal queue - No priority

First in first out  principles
Front(Leaving the queue from the front/Dequeueing) and Rear(Joining the queue from the back/Insertion)

Implementing queues can be done through;
i) Static memory- Arrays
ii) Dynamic  memory- LinkedLists
iii) Stacks

Enqueueing
Keep tabs on 2 variables: front and rear
During the start, both will be -1 after checking if it's full or empty

To check is array is full;
rear == array size - 1

To check is array is empty;
rear & front ==  - 1

When the queue is neither empty nor full
increment rear and add value(enqueue)

Dequeueing
Check whether the queue is empty then shift the front to the next value after the first
Dequeueing affects the capacity and not the size of the queue

Picking
array[front]

Displaying - iterate from front to rear

