package vearth
/*
 * @author vitchyr
 */

import gui.Window
import vearth.animal.Ant

/** A simulation of a world. */
class World (val width: Int, val height: Int) {
  var ants: List[Ant] = List[Ant]()
  val window = new Window(width, height)

  def addAnts(as: List[Ant]) = ants = ants:::as
  def addAnt(a:Ant) = ants = a::ants

  private def runIteration() = {
    ants foreach (a => a.update())
    val (alive, dead) = ants partition (_.isAlive)
    ants = alive
    window.draw(ants)
  }
  def run = {
    window.main(new Array[String](0));
    while (ants.size > 0) {
      runIteration()
      Thread.sleep(10);                 //1000 milliseconds is one second.
    }
    println("Simulation is done.")
  }
}