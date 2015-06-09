"""
Author: Vitchyr Pong
"""
class World:
    def __init__(width, height):
        self.width = width
        self.height = height
        self.animals = []

    def add_animals(self, animals):
        """
        Add an animal or list of animals to this world.
        """
        if isinstance(animals, list):
            self.animals += animals
        else:
            self.animals.append(animals)

    def trace(self, x, y, theta):
        return colors.BLACK
