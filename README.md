# Dart Game Simulation

## Description
This project simulates a dart-throwing game on a square dartboard. The dartboard is divided into six regions (A, B, C, D, E, F) with specific coordinate-based boundaries, and an additional "Undecided" region for boundary cases. The program generates random coordinates for each dart throw, determines the region where the dart lands, and calculates statistics for the number and percentage of hits in each region.

## Rules
1. The dartboard is a square area with boundaries at x = -1, x = 1, y = -1, and y = 1.
2. Darts are thrown at random coordinates `(x, y)` within the board.
3. Each dart's region is determined based on its coordinates:
   - **A**: x ≥ 0, y ≥ 0, and x + y < 1
   - **B**: x ≥ 0, y ≥ 0, and x + y ≥ 1
   - **C**: x < 0, y ≥ 0
   - **D**: x < 0, y < 0, and x < y
   - **E**: x < 0, y < 0, and x ≥ y
   - **F**: x ≥ 0, y < 0
   - **Undecided**: Boundary cases (e.g., x + y = 1, x = y, x or y = 0)
4. The program calculates and displays statistics for the number and percentage of darts in each region.

## Input
The user provides the number of darts to throw.

## Output
- The coordinates of each dart throw and the corresponding region.
- Statistics for each region, including:
  - Number of darts in the region.
  - Percentage of total darts in the region.

## Sample Run
DART GAME! Enter the number of darts to be thrown: 5 Dart 1: Coordinates: (0.2, 0.1) Region: A Dart 2: Coordinates: (0.7, -0.2) Region: F Dart 3: Coordinates: (0.1, -0.8) Region: F Dart 4: Coordinates: (-0.1, -0.1) Region: Undecided Dart 5: Coordinates: (-0.9, 0.6) Region: C Region statistics: A: 1 darts, 20.0% B: 0 darts, 0.0% C: 1 darts, 20.0% D: 0 darts, 0.0% E: 0 darts, 0.0% F: 2 darts, 40.0% Undecided: 1 darts, 20.0%
