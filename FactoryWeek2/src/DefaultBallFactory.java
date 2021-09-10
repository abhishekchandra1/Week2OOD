class DefaultballFactory
{
    public static ball buildball(ballType model)
    {
        ball ball = null;
        switch (model) {
            case Small -> ball = new Smallball(Location.DEFAULT);
            case Medium -> ball = new Mediumball(Location.DEFAULT);
            case Large -> ball = new Largeball(Location.DEFAULT);
            default -> {
            }
        }
        return ball;
    }
}
