"""
Author: Vitchyr Pong
"""
from model.ant import random_ant
from world import World
from view.screen import Screen

class Engine:
    def __init__(self, width, height):
        self.world = World(width, height)
        self.gui = Screen(width, height)

    def run(self):
        while True:
            # Compute all the inputs at once, so every animal sees the same
            # snapshot of the world.
            animals = self.world.animals
            animal_inputs = [a.get_input(self.world) for a in animals]
            for i, a in enumerate(animals):
                a.update(animal_inputs[i])

            # TODO: handle interactions

            self.gui.clear()
            for a in animals:
                shape = a.get_shape()
                pose = a.get_pose()
                self.gui.draw(shape, pose)

def main():
    # GUI constants
    WIDTH = 500
    HEIGHT = 250

    # Vanimal constants
    NUM_ANTS = 10

    ants = [random_ant(WIDTH, HEIGHT) for i in range(NUM_ANTS)]

    world = Earth(WIDTH, HEIGHT)
    world.add_animals(ants)
    world.run()

if __name__ == "__main__":
    main()
