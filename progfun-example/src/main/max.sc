object max {
 def max(xs: List[Int]): Int = {
    if (xs.isEmpty) throw new NoSuchElementException()
    else if( xs.head >= max(xs.tail) ) xs.head
      else max(xs.tail)
    
}                                                 //> max: (xs: List[Int])Int
  

  max(List(1,2,3))                                //> java.util.NoSuchElementException
                                                  //| 	at max$$anonfun$main$1.max$1(max.scala:3)
                                                  //| 	at max$$anonfun$main$1.max$1(max.scala:4)
                                                  //| 	at max$$anonfun$main$1.max$1(max.scala:4)
                                                  //| 	at max$$anonfun$main$1.max$1(max.scala:4)
                                                  //| 	at max$$anonfun$main$1.apply$mcV$sp(max.scala:10)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at max$.main(max.scala:1)
                                                  //| 	at max.main(max.scala)

}