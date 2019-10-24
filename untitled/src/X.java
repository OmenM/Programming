class X
{
    void calculate(int a, int b)
    {
        System.out.println("CLASS X");
    }

}
class Y extends X
{
   @Override
    void calculate(int a, int b)
   {
       System.out.println("CLASS Y");
   }
}
class Z extends Y
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("CLASS Z");
    }

}

