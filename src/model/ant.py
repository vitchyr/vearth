"""
Author: Vitchyr Pong
"""
from animal import Animal
class Ant(Animal):
    def __init__(self, name, x, y, theta):
        """
        Parameters
            name - The name of this ant
            x - The x position of the ant
            y - The y position of the ant
            theta - The angle of the animal w.r.t x+ axis
        """
        super(Ant, self).__init__(name, x, y)
        self.name = name
        self.position = [x, y]
        self.theta = theta

    def update(self, sense_input):
        """
        Give this ant some sensory input.
        """
        if len(sense_input) != eye.num_pixels:
            raise TypeError("Sense input length is wrong. Expected" +
                "{0} but got {1}".format(eye.num_pixels, len(sense_input)))

    def get_action(self):
        """
        Get this ant's action.
        """
        pass
