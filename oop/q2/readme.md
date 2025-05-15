# ListProcessor

## Overview

`ListProcessor` is a simple Java program that demonstrates how to generate a new list (`list3`) based on two predefined lists: 

- `list1` — a list of integers
- `list2` — a list of strings

For each integer `x` in `list1`, the program computes an index `(x * 2) - 1` and uses it to select an element from `list2`. The selected elements are collected into `list3`. If the calculated index is out of range, the program inserts `"IndexOutOfBounds"` instead.

Finally, it prints the contents of `list3`.

---

## How it works

- Initialize two lists: 
  - `list1` with integers
  - `list2` with strings
- For each element `x` in `list1`, calculate index `idx = (x * 2) - 1`
- Fetch `list2.get(idx)` and add it to `list3`
- Print `list3`

---



