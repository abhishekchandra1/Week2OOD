abstract class ball
{
    ball(ballType model, Location location)
    {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    ballType model;
    Location location;

    @Override
    public String toString()
    {
        return "ballModel - "+model + " located in "+location;
    }
}

