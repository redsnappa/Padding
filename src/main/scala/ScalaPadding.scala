/**
 * Created by dan on 15/08/2015.
 */
object ScalaPadding {

  def pad(str:String):String = str match {
    case "" => "000000000000"
    case null =>  "000000000000"
    case _ => padIt(str.reverse)
  }

  def padIt(str:String):String = {

    val (digitTail,start) = str.span(_.isDigit)
    if(digitTail.length >= 12) str.reverse
    else{
      val paddingSize = 12 - digitTail.length
      val padding = "0" * paddingSize
      (digitTail + padding + start).reverse
    }


  }

}
