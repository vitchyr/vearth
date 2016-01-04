package animal

/**
 * @author vitchyr
 */
import vearth.World
import vearth.animal.Ant

/** Eye create a 1D image of the world. */
class Eye(protected val world: World, protected val ant: Ant) extends Sensor {
  def getInput = {
    
  }
}