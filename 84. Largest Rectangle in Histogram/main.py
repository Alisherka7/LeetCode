from collections import deque
from typing import List


def largest_area_rectangle(heights: List[int]) -> int:
    """
    :param heights:
    :return:
    """
    stack = deque()

    def prev_index():
        """
        :return: rectangle width
        """
        return stack[-1] + 1 if stack else 0

    def peek() -> int:
        return stack[-1]

    pop = stack.pop
    push = stack.append
    can_peek = stack.__len__

    curr_index, area, n = 0, 0, len(heights)

    while curr_index < n:
        if not can_peek() or heights[peek()] <= heights[curr_index]:
            push(curr_index)
            curr_index += 1
        else:
            last_higher_height_idx = pop()
            area = max(area, heights[last_higher_height_idx] * (curr_index - prev_index()))

    while can_peek():
        last_higher_height_idx = pop()
        area = max(area, heights[last_higher_height_idx] * (curr_index - prev_index()))

    return area


class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        return largest_area_rectangle(heights)
