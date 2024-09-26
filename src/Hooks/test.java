class test{
   static int  isSame(String s) {
      int a=  s.charAt(s.length()-1)-'0';
      System.out.println(s.length()-1);
    if(s.length()-2 == a)
    {
        return 1;
    }
    else return 0;
  }   
  public static void main(String args[])
  {
    int i = isSame("geeks5");
    System.out.println(i);
  }
    
}