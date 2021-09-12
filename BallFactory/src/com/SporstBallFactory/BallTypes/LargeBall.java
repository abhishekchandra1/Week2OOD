package com.SporstBallFactory.BallTypes;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Enums.Location;

public class LargeBall extends Ball {
        public LargeBall(Location location)
        {
            super(BallType.Large, location);
            construct();
        }
        @Override
        protected void construct()
        {
            System.out.println("Connecting to Large Ball");
        }
    }
