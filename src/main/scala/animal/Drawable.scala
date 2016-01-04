package vearth.animal

/**
 * @author vitchyr
 */
trait Drawable {
  protected var _x: Int
  protected var _y: Int
  
  def x = _x
  def y = _y
  def radius: Int
}