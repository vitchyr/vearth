"""
Author: Vitchyr Pong
"""
class Animal:
    def __init__(self, name, x, y, theta):
        """
        Parameters
            name - The name of this animal
            x - The x position of the animal
            y - The y position of the animal
            theta - The angle of the animal w.r.t x+ axis
        """
        self.name = name
        self.position = [x, y]
        self.theta = theta

    def update(self, sense_input):
        """
        Give this animal some sensory input and let it update.
        """
        pass

    def get_action(self):
        """
        Get this animal's action.
        """
        pass
