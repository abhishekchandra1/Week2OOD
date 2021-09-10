class Mediumball extends ball
{
    Mediumball(Location location)
    {
        super(ballType.Medium,location );
        construct();
    }

    @Override
    void construct()
    {
        System.out.println("Connecting to Medium ball");
    }
}
