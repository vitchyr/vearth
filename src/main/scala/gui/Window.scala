package vearth.gui
import java.awt.image.BufferedImage
import java.awt.{Graphics2D,Color,Font,BasicStroke}
import java.awt.geom._
import scala.swing._
import scala.swing.BorderPanel.Position._
import vearth.animal.Drawable
/**
 * @author vitchyr
 */

class Window (width: Int, height: Int) extends SimpleSwingApplication { 
  var custom_canvas = new Canvas {
      preferredSize = new Dimension(width, height)
    }
  def addDrawable(d: Drawable) = custom_canvas.addDrawable(d)
  
  var panel = new Panel {
      preferredSize = new Dimension(100, 100)
  }
  def top = new MainFrame {
    title = "Vearth"
    contents = new BorderPanel {
      layout(custom_canvas) = Center
    }
    size = new Dimension(width, height)
  }
  
  val canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
  def clear() = {
    // get Graphics2D for the image
    val g = canvas.createGraphics()
    
    // clear background
    g.setColor(Color.BLACK)
    g.fillRect(0, 0, canvas.getWidth, canvas.getHeight)
    
    custom_canvas.clear()
  }
  def draw (x: Int, y: Int, radius: Int) = {
    // get Graphics2D for the image
    val g = canvas.createGraphics()
    
    // enable anti-aliased rendering (prettier lines and circles)
    // Comment it out to see what this does!
    g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, 
                       java.awt.RenderingHints.VALUE_ANTIALIAS_ON)

    // draw circle for each ant
    g.setColor(Color.RED)
    g.fill(new Ellipse2D.Double(x, y, radius, radius))
    
    // done with drawing
    g.dispose()
    javax.imageio.ImageIO.write(canvas, "png", new java.io.File("drawing.png"))
  }
  
  def draw() = custom_canvas.repaint()
}
