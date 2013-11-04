object CountChange {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(243); 
  def countChange(money: Int, coins: List[Int]): Int = {
  if(money == 0) 1
  else if (money < 0) 0
  else if (coins.isEmpty) 0
  else {
    countChange(money - coins.head, coins) +
    countChange(money, coins.tail)
  }
};System.out.println("""countChange: (money: Int, coins: List[Int])Int""")}


}
