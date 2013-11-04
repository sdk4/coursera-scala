object balance {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(350); 
  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], open: Int): Boolean =
      if (chars.isEmpty) open == 0
      else if (chars.head == '(') balanced(chars.tail,open+1)
      else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
      else balanced(chars.tail,open)
    balanced(chars,0)
};System.out.println("""balance: (chars: List[Char])Boolean""");$skip(30); val res$0 = 
	balance(")(stirng()".toList);System.out.println("""res0: Boolean = """ + $show(res$0))}

}

 