package com.SporstBallFactory;

import com.SporstBallFactory.Enums.BallType;
import com.SporstBallFactory.Factories.BallFactory;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(BallFactory.buildGlass(BallType.Small));
        System.out.println(BallFactory.buildGlass(BallType.Medium));
        System.out.println(BallFactory.buildGlass(BallType.Large));
    }
}