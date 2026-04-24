class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        position = 0
        blanks = 0

        for n in moves:
            if n == "L":
                position -= 1
            elif n == "R":
                position += 1
            else:
                blanks += 1
        
        return abs(position) + blanks