package vearth.gui
import java.awt.image.BufferedImage
import java.awt.{Graphics2D,Color,Font,BasicStroke}
import java.awt.geom._
import scala.swing._
/**
 * @author vitchyr
 */

class Window (width: Int, height: Int) {
  var canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
  def clear() = {
    // get Graphics2D for the image
    val g = canvas.createGraphics()
    
    // clear background
    g.setColor(Color.BLACK)
    g.fillRect(0, 0, canvas.getWidth, canvas.getHeight)
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
}