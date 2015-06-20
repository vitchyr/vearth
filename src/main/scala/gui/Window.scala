package vearth.gui
import scala.swing._
import scala.swing.BorderPanel.Position._
import scala.collection.mutable.ListBuffer

import vearth.animal.Drawable
/**
 * @author vitchyr
 */

/** The Window is the GUI that the user sees. */
class Window (width: Int, height: Int) extends SimpleSwingApplication { 
  val custom_canvas = new WorldCanvas {
    preferredSize = new Dimension(width, height)
  }

  def top = new MainFrame {
    title = "Vearth"
    contents = new BorderPanel {
      layout(custom_canvas) = Center
    }
    size = new Dimension(width, height)
  }
  
  def draw(ds: List[Drawable]) = {
    custom_canvas.drawables = ds
    custom_canvas.repaint()
  }
}
