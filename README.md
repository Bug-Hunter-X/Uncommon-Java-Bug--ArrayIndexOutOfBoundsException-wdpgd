# Uncommon Java Bug: ArrayIndexOutOfBoundsException

This repository demonstrates a subtle yet common error in Java programming: the `IndexOutOfBoundsException`. The error occurs when attempting to access an array element using an index that is outside the valid range of indices for that array.

## Bug Description
The provided Java code snippet attempts to assign a value to an array element using an index (10) that exceeds the array's bounds (0-9). This results in an `IndexOutOfBoundsException` being thrown at runtime.  This differs from common null pointer exceptions or logic errors, making it somewhat less frequently encountered by novice programmers.

## How to Reproduce
1. Compile the Java code in `Bug.java`.
2. Run the compiled code.
3. Observe the `IndexOutOfBoundsException` being thrown.

## Solution
The solution involves ensuring that array indices are within the valid bounds (0 to array.length - 1).  The `BugSolution.java` file demonstrates the correct way to access and modify array elements. 