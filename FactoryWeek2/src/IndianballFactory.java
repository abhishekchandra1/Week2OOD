class INDIAballFactory
{
    static ball buildball(ballType model)
    {
        ball ball = null;
        switch (model) {
            case Small -> ball = new Smallball(Location.INDIA);
            case Medium -> ball = new Mediumball(Location.INDIA);
            case Large -> ball = new Largeball(Location.INDIA);
            default -> {
            }
        }
        return ball;
    }
}
