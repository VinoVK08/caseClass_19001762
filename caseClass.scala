// 19001762

object caseClass extends App {
  val p1 = Point(-4,5)
  val p2 = Point(-6,3)
  println("P1: " +p1)
  println("P2: " +p2)
  println("Addition of point p1 and p2 : " +  (p1+p2))
  println("After moving point p1, 2 unit distance in x axis and y axis: " + p1.move(2,2))
  println("Distance between p1 and p2: " + p2.distance(p1))
  println("Invert of p1: " + p1.invert)

}

case class Point(x:Int, y:Int){
  def +(p:Point) = Point(this.x + p.x, this.y + p.y )
  def move (dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)
  def distance (p:Point):Double= {
    val  num = (Math.abs(p.x) - Math.abs(this.x))* (Math.abs(p.x) - Math.abs(this.x)) + (Math.abs(p.y) - Math.abs(this.y))*(Math.abs(p.y) - Math.abs(this.y))
     return Math.sqrt(num)
   }
  def invert = Point(this.y, this.x)

}
