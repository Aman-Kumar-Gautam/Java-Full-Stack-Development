# Knapsack Problem

The **Knapsack Problem** is a classic optimization problem in computer science and operations research. It involves selecting a subset of items with given weights and values to maximize the total value without exceeding a weight limit.

## Table of Contents

- [Knapsack Problem](#knapsack-problem)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Types of Knapsack Problems](#types-of-knapsack-problems)
    - [0/1 Knapsack Problem](#01-knapsack-problem)
      - [How It Works](#how-it-works)
      - [Pseudocode](#pseudocode)
      - [Time Complexity](#time-complexity)
      - [Applications](#applications)
    - [Fractional Knapsack Problem](#fractional-knapsack-problem)
      - [How It Works](#how-it-works-1)
      - [Pseudocode](#pseudocode-1)
      - [Time Complexity](#time-complexity-1)
      - [Applications](#applications-1)
    - [Multiple Knapsack Problem](#multiple-knapsack-problem)
      - [How It Works](#how-it-works-2)
      - [Pseudocode](#pseudocode-2)
      - [Time Complexity](#time-complexity-2)
      - [Applications](#applications-2)
    - [Bounded Knapsack Problem](#bounded-knapsack-problem)
      - [How It Works](#how-it-works-3)
      - [Pseudocode](#pseudocode-3)
      - [Time Complexity](#time-complexity-3)
      - [Applications](#applications-3)
    - [Unbounded Knapsack Problem](#unbounded-knapsack-problem)
      - [How It Works](#how-it-works-4)
      - [Pseudocode](#pseudocode-4)
      - [Time Complexity](#time-complexity-4)
      - [Applications](#applications-4)
  - [Dynamic Programming Approach](#dynamic-programming-approach)
    - [General Steps](#general-steps)
  - [Greedy Approach](#greedy-approach)
    - [General Steps](#general-steps-1)
  - [Example](#example)
  - [Time Complexity](#time-complexity-5)
  - [Applications](#applications-5)

## Introduction

The Knapsack Problem is about choosing a subset of items to include in a knapsack to maximize the total value while keeping the total weight under or equal to a given limit. It has various forms depending on the constraints of the problem.

## Types of Knapsack Problems

### 0/1 Knapsack Problem

In the 0/1 Knapsack Problem, each item can either be included or excluded from the knapsack (i.e., each item has a binary choice).

#### How It Works

1. **Initialization**:
   - Create a 2D DP table where `dp[i][w]` represents the maximum value achievable with the first `i` items and a knapsack capacity of `w`.

2. **DP Transition**:
   - For each item, decide whether to include it or exclude it, based on the maximum value achievable.

#### Pseudocode

```python
def knapsack_01(weights, values, capacity):
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for w in range(capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            else:
                dp[i][w] = dp[i - 1][w]
    
    return dp[n][capacity]

# Example usage
weights = [1, 2, 3]
values = [10, 20, 30]
capacity = 5
print("0/1 Knapsack maximum value:", knapsack_01(weights, values, capacity))
```

#### Time Complexity

- **Time Complexity**: \( O(n \times W) \)
  - Where \( n \) is the number of items and \( W \) is the maximum weight capacity.

- **Space Complexity**: \( O(n \times W) \)

#### Applications

- Budget management
- Resource allocation

### Fractional Knapsack Problem

In the Fractional Knapsack Problem, you can take fractional amounts of an item. This is also known as the Continuous Knapsack Problem.

#### How It Works

1. **Calculate Ratios**:
   - Compute the ratio of value to weight for each item.

2. **Greedy Selection**:
   - Sort items by this ratio in descending order and add items to the knapsack until it’s full.

#### Pseudocode

```python
def knapsack_fractional(weights, values, capacity):
    n = len(weights)
    items = [(values[i] / weights[i], weights[i], values[i]) for i in range(n)]
    items.sort(reverse=True, key=lambda x: x[0])
    
    total_value = 0.0
    for ratio, weight, value in items:
        if capacity >= weight:
            capacity -= weight
            total_value += value
        else:
            total_value += ratio * capacity
            break
    
    return total_value

# Example usage
weights = [1, 2, 3]
values = [10, 20, 30]
capacity = 5
print("Fractional Knapsack maximum value:", knapsack_fractional(weights, values, capacity))
```

#### Time Complexity

- **Time Complexity**: \( O(n \log n) \)
  - Due to sorting.

- **Space Complexity**: \( O(n) \)

#### Applications

- Investment decisions
- Resource distribution

### Multiple Knapsack Problem

The Multiple Knapsack Problem extends the 0/1 Knapsack Problem to multiple knapsacks, where the goal is to distribute items among multiple knapsacks.

#### How It Works

1. **Multiple Knapsacks**:
   - Solve the problem considering the constraints for each knapsack.

2. **Approaches**:
   - Use extensions of the 0/1 Knapsack Problem or Integer Linear Programming for more complex instances.

#### Pseudocode

```python
# Multiple Knapsack Problem can be solved using dynamic programming or ILP
# Here is a general outline for the dynamic programming approach

def knapsack_multiple(weights, values, capacities):
    num_items = len(weights)
    num_knapsacks = len(capacities)
    dp = [[[0] * (c + 1) for _ in range(num_knapsacks + 1)] for _ in range(num_items + 1)]
    
    for i in range(1, num_items + 1):
        for k in range(1, num_knapsacks + 1):
            for w in range(capacities[k-1] + 1):
                if weights[i - 1] <= w:
                    dp[i][k][w] = max(dp[i - 1][k][w], dp[i - 1][k][w - weights[i - 1]] + values[i - 1])
                else:
                    dp[i][k][w] = dp[i - 1][k][w]
    
    return dp[num_items][num_knapsacks][capacities[-1]]

# Example usage
weights = [1, 2, 3]
values = [10, 20, 30]
capacities = [4, 5]
print("Multiple Knapsack maximum value:", knapsack_multiple(weights, values, capacities))
```

#### Time Complexity

- **Time Complexity**: \( O(n \times m \times W) \)
  - Where \( n \) is the number of items, \( m \) is the number of knapsacks, and \( W \) is the maximum weight capacity.

- **Space Complexity**: \( O(n \times m \times W) \)

#### Applications

- Multi-resource allocation
- Logistics planning

### Bounded Knapsack Problem

In the Bounded Knapsack Problem, each item has a limited number of copies available.

#### How It Works

1. **Dynamic Programming Approach**:
   - Similar to the 0/1 Knapsack Problem but considers item quantities.

#### Pseudocode

```python
def knapsack_bounded(weights, values, capacity, quantities):
    n = len(weights)
    dp = [0] * (capacity + 1)
    
    for i in range(n):
        for w in range(capacity, weights[i] - 1, -1):
            for k in range(1, quantities[i] + 1):
                if weights[i] * k <= w:
                    dp[w] = max(dp[w], dp[w - weights[i] * k] + values[i] * k)
                else:
                    break
    
    return dp[capacity]

# Example usage
weights = [1, 2, 3]
values = [10, 20, 30]
quantities = [2, 2, 1]
capacity = 5
print("Bounded Knapsack maximum value:", knapsack_bounded(weights, values, capacity, quantities))
```

#### Time Complexity

- **Time Complexity**: \( O(n \times W \times Q) \)
  - Where \( n \) is the number of items, \( W \) is the knapsack capacity, and \( Q \) is the maximum quantity of any item.

- **Space Complexity**: \( O(W) \)

#### Applications

- Inventory management
- Resource allocation

### Unbounded Knapsack Problem

In the Unbounded Knapsack Problem, you can take an unlimited number of copies of each item.

#### How It Works

1. **Dynamic Programming Approach**:
   - Solve using a similar method as the 0/1 Knapsack Problem but allows multiple copies of items.

#### Pseudocode

```python
def knapsack_unbounded(weights, values, capacity):
    dp = [0] * (capacity + 1)
    
    for w in range(1, capacity + 1):
        for i in range(len(weights)):
            if weights[i] <= w:
                dp[w] = max(dp[w], dp[w - weights[i]] + values[i])
    
    return dp[capacity]

# Example usage
weights = [1, 2, 3]
values = [10, 20, 30]
capacity = 5
print("Unbounded Knapsack maximum value:", knapsack_unbounded(weights, values, capacity

))
```

#### Time Complexity

- **Time Complexity**: \( O(n \times W) \)

- **Space Complexity**: \( O(W) \)

#### Applications

- Resource allocation with unlimited supply
- Budget planning

## Dynamic Programming Approach

The Dynamic Programming approach is used for solving the 0/1 Knapsack Problem, Multiple Knapsack Problem, and Bounded Knapsack Problem.

### General Steps

1. **Define State**:
   - Define the state based on subproblems and their solutions.

2. **State Transition**:
   - Define how to transition from one state to another.

3. **Base Cases**:
   - Define the initial conditions.

4. **Build the DP Table**:
   - Solve the problem iteratively using the DP table.

## Greedy Approach

The Greedy approach is used for the Fractional Knapsack Problem.

### General Steps

1. **Calculate Ratios**:
   - Compute the ratio of value to weight for each item.

2. **Sort Items**:
   - Sort items based on the computed ratio.

3. **Select Items**:
   - Add items to the knapsack based on the sorted order until the knapsack is full.

## Example

Here’s a basic example for the 0/1 Knapsack Problem:

```python
weights = [2, 3, 4, 5]
values = [3, 4, 5, 6]
capacity = 5
print("0/1 Knapsack maximum value:", knapsack_01(weights, values, capacity))
```

## Time Complexity

| Problem Type          | Time Complexity| Space Complexity  |
|-----------------------|----------------|-------------------|
| 0/1 Knapsack          | O(n×W)         |      O(n×W)       |
| Fractional Knapsack   | O(nlog n)      |      O(n)         |
| Multiple Knapsack     | O(n×m×W)       |      O(n×m×W)     |
| Bounded Knapsack      | O(n×W×Q)       |      O(W)         |
| Unbounded Knapsack    | O(n×W)         |      O(W)         |

## Applications

- **Resource Allocation**: Budget management, investment decisions.
- **Logistics and Planning**: Urban planning, transportation systems.
- **Finance**: Portfolio optimization, financial arbitrage.

