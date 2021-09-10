class ballFactory
{
    private ballFactory()
    {

    }
    public static ball buildball(ballType type)
    {
        ball ball = null;
// We are adding
// read location property somewhere from configuration
// and use location specific car factory
// Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        switch(location)
        {
            case USA:
                ball = USAballFactory.buildball(type);
                break;

            case INDIA:
                ball = INDIAballFactory.buildball(type);
                break;

            default:
                ball = DefaultballFactory.buildball(type);

        }

        return ball;

    }
}
