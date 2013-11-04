object pascal {
  def pascal(c: Int, r: Int): Int = {
  	if( c < 0 || r<c) 0
  	else if( c==r || c==0) 1
  	else pascal(c-1,r-1) + pascal(c,r-1)
  }                                               //> pascal: (c: Int, r: Int)Int
  
  pascal(0,2)                                     //> res0: Int = 1
}