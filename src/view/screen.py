"""
Author: Vitchyr Pong
"""

class Screen:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def clear(self):
        pass

    def draw_shape(self, shape, pose):
        x, y, theta = pose
