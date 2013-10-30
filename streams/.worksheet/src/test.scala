object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(22); 
 val x=  List(1,2,3);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(50); ;
  def from(n:Int): Stream[Int] = n #:: from(n+1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(24); ;
  
  val nats = from(0);System.out.println("""nats  : Stream[Int] = """ + $show(nats ));$skip(29); 
  val m4s = nats map (_ * 4);System.out.println("""m4s  : scala.collection.immutable.Stream[Int] = """ + $show(m4s ));$skip(24); val res$0 = 
  (m4s take 100).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(99); 
  
  def sieve(s: Stream[Int]): Stream[Int] =
  	s.head #:: sieve(s.tail filter (_ % s.head != 0));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(33); 
  
  val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(26); val res$1 = 
  primes.take(100).toList;System.out.println("""res1: List[Int] = """ + $show(res$1))}
  
}
