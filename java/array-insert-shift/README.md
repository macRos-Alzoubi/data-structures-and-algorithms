# Insert to Middle of an Array

<!-- Description of the challenge -->

I have been asked to create a function called insertShiftArray that receives an array of integer and an integer variable
and return an array with the received variable inserted in the middle of the array

## Whiteboard Process

![array-insert-shift](array-insert-shift.svg)

## Approach & Efficiency

<!-- What approach did you take? Discuss Why. What is the Big O space/time for this approach? -->

+ I create new array with one extra space to hold the new element
+ traverse throw the new array from the end of the array and shift elements
+ after that just insert the received element in the middle of the array
+ the complexity is { time: O(n), space: O(n) }.
