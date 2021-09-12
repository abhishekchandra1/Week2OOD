package com.SporstBallFactory.Factories;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Enums.Location;
import com.SporstBallFactory.BallTypes.Ball;

public class BallFactory {
//    private GlassFactory()
//    {
//
//    }
// We are adding
// read location property somewhere from configuration
// and use location specific car factory
// Currently I'm just using INDIA as Location
        public static Ball buildGlass(BallType type)
        {
            Ball glass = null;
        Location location = Location.INDIA;

        switch(location)
        {
            case USA:
                glass = USABallFactory.buildGlass(type);
                break;

            case INDIA:
                glass = INDIABallFactory.buildGlass(type);
                break;

            default:
                glass = DefaultBallFactory.buildGlass(type);

        }

        return glass;

    }
}