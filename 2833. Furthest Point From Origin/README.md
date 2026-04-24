# 2833. Furthest Point From Origin

## Intuitive Approach

When I iterate through the string `moves`, each character represents a move:
* `L` means move one step to the left
* `R` means move one step to the right
* `_` means I can choose the direction later

First, I calcualte the position based on fixed moves:
* If I see `L`, I decrease the position by 1
* If I see `R`, I increase the position by 1

For `_`, I count how many such moves I have using a `blanks` variable.
I do this because later I can decide their direction to maximize the distance from the origin.

After processing all moves, I already know the current position from `L` and `R`.

To get the furthest distance, I use all `_` moves in the direction that increase the distance.
So I simply add the number of blanks to the absolute value of the current poisition.

using: `abs(position) + blanks`

