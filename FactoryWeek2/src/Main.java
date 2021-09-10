public class Main
{
    public static void main(String[] args)
    {
        System.out.println(ballFactory.buildball(ballType.Small));
        System.out.println(ballFactory.buildball(ballType.Medium));
        System.out.println(ballFactory.buildball(ballType.Large));
    }
}