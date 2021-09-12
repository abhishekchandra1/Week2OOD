package com.SporstBallFactory.Factories;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.BallTypes.Ball;
import com.SporstBallFactory.BallTypes.LargeBall;
import com.SporstBallFactory.Enums.Location;
import com.SporstBallFactory.BallTypes.MediumBall;
import com.SporstBallFactory.BallTypes.SmallBall;

public class DefaultBallFactory {
    public static Ball buildGlass(BallType model) {
        Ball glass = null;
        switch (model) {
            case Small:
                glass = new SmallBall(Location.DEFAULT);
                break;

            case Medium:
                glass = new MediumBall(Location.DEFAULT);
                break;

            case Large:
                glass = new LargeBall(Location.DEFAULT);
                break;

            default:
                break;
        }
        return glass;
    }
}