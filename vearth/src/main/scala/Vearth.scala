/**
 * @author vitchyr
 */
package vearth

import scala.util.Random
import vearth.animal.{Ant, RandomAnt}

object Vearth {
  val Width = 800
  val Height = 600
  def walkAnimals(numAnts: Int) = {
    val random = new Random()
    val world = new World(Width, Height)
    val ants: List[Ant] =
      for (i <- List.range(0, numAnts))
        yield new RandomAnt(random.nextInt(Width), random.nextInt(Height), world)
    world addAnts ants
    world.run
  }
  
  def main(args: Array[String]): Unit = {
    val numAnts = 10
    walkAnimals(numAnts)
  }
}