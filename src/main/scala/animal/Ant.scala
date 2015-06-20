package vearth.animal

/**
 * @author vitchyr
 */
import vearth.World

/** An ant is anything that actively moves. */
trait Ant extends Drawable {
  protected val world: World
  protected var _isAlive: Boolean = true
  def isAlive = _isAlive
  def update() = {
    move()
  }
  val width = world.width
  val height = world.height
  override def toString() = {
    val hash = this.hashCode()
    s"<Ant $hash> @ ($x, $y)"
  }
  /** Functions to implement */
  def move()
}