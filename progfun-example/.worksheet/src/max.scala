object max {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(178); 
 def max(xs: List[Int]): Int = {
    if (xs.isEmpty) throw new NoSuchElementException()
    else if( xs.head >= max(xs.tail) ) xs.head
      else max(xs.tail)
    
};System.out.println("""max: (xs: List[Int])Int""");$skip(24); val res$0 = 
  

  max(List(1,2,3));System.out.println("""res0: Int = """ + $show(res$0))}

}
