package vearth.animal

/**
 * @author vitchyr
 */
import vearth.World

trait Ant extends Drawable {
  protected val world: World
  protected var _isAlive: Boolean = true
  def isAlive = _isAlive
  def update() = {
    move()
  }
  val width = world.width
  val height = world.height
  
  override def toString() = s"Ant @ ($x, $y)"
  /** Functions to implement */
  def move()
}