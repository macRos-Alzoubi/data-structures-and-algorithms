# Challenge Summary
<!-- Description of the challenge -->

Tree Breadth first search implementation in java

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O ==> Space: O(n), Tome: O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->

hit the run button

```
  BTS<Integer> integerBTS = new BTS<>();
    integerBTS.add(44);
    integerBTS.add(4);
    integerBTS.add(63);
    integerBTS.add(22);
    integerBTS.add(34);
    integerBTS.add(72);
    try {
      System.out.println(BTS.breadthFirst(integerBTS));
    } catch (Exception e) {
      e.printStackTrace();
    }

//Output 44 -> 4 -> 63 -> 22 -> 72 -> 34

```
