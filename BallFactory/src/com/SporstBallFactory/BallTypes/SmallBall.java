package com.SporstBallFactory.BallTypes;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Enums.Location;

public class SmallBall extends Ball {
        public SmallBall(Location location)
        {
            super(BallType.Small, location);
            construct();
        }
        protected void construct()
        {
            System.out.println("Connecting to Small Ball ");
        }
    }

