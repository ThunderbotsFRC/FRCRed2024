// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;

//imports


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    //controller stuff
    public final static int controllerPort = 0;

    //PWM port locations 

    //Drivetrain controller pwm ports (on RoboRIO)
    public final static int CANLeftFront = 4;
    public final static int CANLeftBack = 3; 
    public final static int CANRightFront = 1; 
    public final static int CANRightBack = 2; 

    //actuator ports
    public final static int pwmBottomLauncher = 4;
    public final static int pwmTopLauncher = 5;
    public final static int pwmIntake = 6;

    //Ultrasonic Ports
    public final static int pwmXDistPing = 7;
    public final static int pwmXDistEcho = 8;
    public final static int pwmYDistPing = 9;
    public final static int pwmYDistEcho = 10;
}
