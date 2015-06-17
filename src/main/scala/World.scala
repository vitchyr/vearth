package vearth
/*
 * @author vitchyr
 */

import gui.Window
import vearth.animal.Ant

class World (val width: Int, val height: Int) {
  var ants: List[Ant] = List[Ant]()
  val window = new Window(width, height)

  def addAnts(as: List[Ant]) = {
    ants = ants:::as
  }
  def addAnt(a:Ant) = {
    ants = a::ants
  }
  private def runIteration() = {
    ants foreach (a => a.update())
    ants = ants filter (_.isAlive)
    window.clear()
    ants foreach (a => window.addDrawable(a))
    ants foreach (a => println(a))
    window.draw()
  }
  def run = {
    runIteration()
    /*
    while (true) {
      runIteration()
    }
    */
  }
}