class USAballFactory
{
    public static ball buildball(ballType model)
    {
        ball ball = null;
        switch (model) {
            case Small -> ball = new Smallball(Location.USA);
            case Medium -> ball = new Mediumball(Location.USA);
            case Large -> ball = new Largeball(Location.USA);
            default -> {
            }
        }
        return ball;
    }
}