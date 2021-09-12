package com.SporstBallFactory.BallTypes;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Enums.Location;

public abstract class Ball
    {
        Ball(BallType model, Location location)
        {
            this.model = model;
            this.location = location;
        }

        abstract void construct();

        BallType model = null;
        Location location = null;

        BallType getModel()
        {
            return model;
        }

        void setModel(BallType model)
        {
            this.model = model;
        }

        Location getLocation()
        {
            return location;
        }

        void setLocation(Location location)
        {
            this.location = location;
        }

        @Override
        public String toString()
        {
            return "BallModel - "+model + " located in "+location;
        }

    }
