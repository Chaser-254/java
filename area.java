class Test
{
    static float findArea(float a, float b, float c)
    {

        if (a < 0 || b < 0 || c <0 || (a+b <= c) ||
            a+c <=b || b+c <=a)
        {
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
        float s = (a+b+c)/2;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
         
    public static void main(String[] args)
    {
        float a = 3.0f;
        float b = 4.0f;
        float c = 5.0f;
     
        System.out.println("Area is " + findArea(a, b, c));
    }

    static float findArea(float r, int h, float pie)
    {
        float area = (pie(r*r) + 2(pie(r*r*h));
      return area;
    }
    public static void main(String[] args)
    {
        float r = 1.4f;
        int h = 40;
        float pie = 1.3142f;

        system.out.println("Area is" + findArea(r,h,pie));
    }
    static float FindArea(float r,int h, float pie)
    {
        float area = pie(3/4 * r * r *h);
        return area;
    }
    public static void main(String[] args)
    {
        float r = 0.7;
        int h = 14;
        float pie = 1.3142f;

        system.out.println("Area is" + findArea(r, h, pie));
    }
}