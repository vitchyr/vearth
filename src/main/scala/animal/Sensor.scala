package animal

/**
 * @author vitchyr
 */
import vearth.World
import vearth.animal.Ant

/** A sensor is anything that gets information from the world. E.g. eyes. */
trait Sensor {
  protected val world: World
  protected val ant: Ant
  def getInput
}