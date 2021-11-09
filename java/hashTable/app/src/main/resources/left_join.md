# Hashmap LEFT JOIN

<!-- Short summary or background information -->

Write a function called left join Arguments: two hash maps The first parameter is a hashmap that has word strings as
keys, and a synonym of the key as values. The second parameter is a hashmap that has word strings as keys, and antonyms
of the key as values. Return: The returned data structure that holds the results is up to you. It doesn’t need to
exactly match the output below, so long as it achieves the LEFT JOIN logic

## Challenge

<!-- Description of the challenge -->

Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic. LEFT
JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are
appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the
result row.

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Big O => Space: O(n^2), Time: O(n)

## Solution

<!-- Embedded whiteboard image -->

![left-join](hashmap-left-join.jpg)
