package gr

import gr.SomeClass.Child

final case class SomeClass(y: String) {
  def x: String = y
  def ch: Child = Child(y)
}

object SomeClass {
  final case class Child(z: String)

}