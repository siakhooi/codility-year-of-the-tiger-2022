# Codility Challenge: Year of the Tiger 2022

## TricoloredTowers

- Difficulty: Medium
- Find the maximum number of towers with same color order that can be obtained from an initial group of tricolored towers if at most one swap of adjacent colors can be performed in every tower.
- <https://app.codility.com/programmers/challenges/year_of_the_tiger_2022/>
- <https://app.codility.com/programmers/task/tricolored_towers/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%, Performance <100%.
- File naming convention
  - Code `A`: `YearOfTheTiger2022A.java`
  - etc

### Gold Award

| File | Complexity | Result | Report                                                                            |
| ---- | ---------- | ------ | --------------------------------------------------------------------------------- |
| `A`  | `O(N)`     | `Good` | [E335J3](https://app.codility.com/cert/view/certE335J3-U7Z75MB8ZJA3HNN7/details/) |

### Solutions from Codility (Implementation in Java)

| File | Complexity                              | Result | Report                                                              |
| ---- | --------------------------------------- | ------ | ------------------------------------------------------------------- |
| `B1` | `O(3**N * N) or O(N**2) or O(N * A**3)` | `Fail` | [DV9VG9](https://app.codility.com/demo/results/trainingDV9VG9-F3V/) |
| `B2` | `O(3**N * N) or O(N**2) or O(N * A**3)` | `Fail` | [U32Y62](https://app.codility.com/demo/results/trainingU32Y62-5WX/) |
| `B3` | `O(3**N * N) or O(N**2) or O(N * A**3)` | `Fail` | [QWCH5K](https://app.codility.com/demo/results/trainingQWCH5K-PS6/) |
| `B4` | `O(N * A**3)`                           | `OK`   | [C5KMU2](https://app.codility.com/demo/results/trainingC5KMU2-FR2/) |

- `B3`, `B4` are same solutions, using different implementations.
