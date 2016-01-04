package vearth.gui

/**
 * @author vitchyr
 */
import scala.swing.Panel
import java.awt.{ Graphics2D, Color }
import vearth.animal.Drawable

/** The world canvas is where the simulation is shown. */
class WorldCanvas extends Panel {  
  var drawables = List[Drawable]();
  override def paintComponent(g: Graphics2D) {
    // Clear background
    g.setColor(Color.BLACK)
    g.fillRect(0, 0, this.size.width, this.size.height)
    
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
}