interface Circle
{
    //Characteristics (public static final)
    float PI = 3.14f;  

    //Behavior  (public abstract)
    float Area(float Radius);
    float Circumfarance(float Radius);
}

class Marvellous implements Circle
{
    //Error due to missng body of area and circumfarance

}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();

    }
      
}