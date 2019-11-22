class A {
    void myMethod(Object o, Double D)
    {
        System.out.println(1);
    }
    void myMethod(Integer I, Number N)
    {
        System.out.println(2);
    }
    static class B extends A {

        void myMethod(Float F, Double D)
        {
            System.out.println(3);
        }

        void myMethod(Double D, Integer I)
        {
            System.out.println(4);
        }
    }
}