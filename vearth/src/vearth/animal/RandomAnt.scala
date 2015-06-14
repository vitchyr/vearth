package vearth.animal
import vearth.World
import scala.util.Random
/**
 * @author vitchyr
 * 
 * An ant that randomly moves around.
 */
class RandomAnt (var x: Int, var y: Int, protected val world: World) extends Ant{
  def move() = {
    /* Given a coordinate and its max value, return the min and max values that
     * the coordinate can change by
     */
    def getMinMax(p: Int, max: Int): (Int, Int) = {
      if (p == max) {
        return (-1, 0)
      }
      else if (p == 0) {
        return (0, 1)
      }
      return (-1, 1)
    }
    
    val (minDX, maxDX) = getMinMax(x, width)
    val (minDY, maxDY) = getMinMax(y, height)
    x += Random.nextInt(maxDX) + minDX
    y += Random.nextInt(maxDY) + minDY
  }
  
  def radius = 5
}