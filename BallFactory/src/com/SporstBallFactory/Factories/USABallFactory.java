package com.SporstBallFactory.Factories;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.BallTypes.LargeBall;
import com.SporstBallFactory.Enums.Location;
import com.SporstBallFactory.BallTypes.MediumBall;
import com.SporstBallFactory.BallTypes.SmallBall;
import com.SporstBallFactory.BallTypes.Ball;

public class USABallFactory {
        public static Ball buildGlass(BallType model)
        {
            Ball ball = null;
            switch (model)
            {
                case Small:
                    ball = new SmallBall(Location.USA);
                    break;

                case Medium:
                    ball = new MediumBall(Location.USA);
                    break;

                case Large:
                    ball = new LargeBall(Location.USA);
                    break;

                default:
                    break;

            }
            return ball;
        }
}
