//#Patterns: MultipleStringLiteralsChecker

class MultipleStringLiteralsChecker {

  //#Info: MultipleStringLiteralsChecker
  var a = "foobar"
  var b = "foobar"
  var c = "foobar"
  val d = "foobar"

  def e = "foobar"

  def f(f: String = "foobar") = 5
  //#Info: MultipleStringLiteralsChecker
  var a1 = "bar"
  val d1 = "bar"

  def e1 = "bar"

  def f1(f: String = "bar") = "foobar"

  //#Info: MultipleStringLiteralsChecker
  val a2 = "1"
  val b2 = "1"



  //interpolation
  //#Info: MultipleStringLiteralsChecker
  var ia = s"interpolated"
  var ia2 = "interpolated"

  //#Info: MultipleStringLiteralsChecker
  var ib = t"t_inerpolated"
  var ib2 = "t_inerpolated"
}
