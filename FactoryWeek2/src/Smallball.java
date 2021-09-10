class Smallball extends ball
{
    Smallball(Location location)
    {
        super(ballType.Small, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Connecting to Small ball ");
    }
}
