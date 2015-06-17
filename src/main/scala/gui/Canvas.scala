package vearth.gui

/**
 * @author vitchyr
 */
import scala.swing.Panel
import java.awt.{ Graphics2D, Color }
import vearth.animal.Drawable

class Canvas extends Panel {
  var centerColor = Color.yellow
  
  var drawables = List[Drawable]()

  override def paintComponent(g: Graphics2D) {
    
    // Start by erasing this Canvas
    g.clearRect(0, 0, size.width, size.height)
    // clear background
    //g.setColor(Color.BLACK)
    //g.fillRect(0, 0, canvas.getWidth, canvas.getHeight)
    
    // enable anti-aliased rendering (prettier lines and circles)
    // Comment it out to see what this does!
    g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, 
                       java.awt.RenderingHints.VALUE_ANTIALIAS_ON)
    
    // Draw things that change on top of background
    g.setColor(Color.RED)
    for (d <- drawables) {
      g.fillOval(d.x, d.y, d.radius, d.radius)
    }
  }
  def clear() = drawables = List[Drawable]()
  def addDrawable(d: Drawable) = drawables.::_
}