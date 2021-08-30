case class Point(a:Int, b:Int) {

  def x: Int = a
  def y: Int = b

  def + (that:Point) = Point(this.x+that.x, this.y+that.y)
  def move (dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)
  def distance (that:Point) = Point((this.x-that.x).abs, (this.y-that.y).abs)
  def invert () = Point(y, x)

}

object Run_Point extends App {

  val p1 = Point(1,4)
  val p2 = Point(2,6)
  println("Point 1 : " + p1)
  println("Point 2 : " + p2)

  val p3 = p1.move(2,3)
  println("Point 1 when moved at (2,3) : " + p3)

  val p4 = p1+p2
  println("Addition of Point 1 and Point 2   : " + p4)

  val p5 = p1.distance(p2)
  println("Distance between Point 1 and Point 2 : " + p5)
  
  val p6 = p1.invert()
  println("Point 1 when inverted : " + p6)
}