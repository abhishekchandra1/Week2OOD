package com.SporstBallFactory.BallTypes;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Enums.Location;

public class MediumBall extends Ball
    {
        public MediumBall(Location location)
        {
            super(BallType.Medium,location );
            construct();
        }

        @Override
        void construct()
        {
            System.out.println("Connecting to Medium Ball");
        }
}
