package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class UltrasonicSubsystem extends SubsystemBase {

    Ultrasonic X = new Ultrasonic(Constants.pwmXDistPing,Constants.pwmXDistEcho);
    Ultrasonic Y = new Ultrasonic(Constants.pwmYDistPing,Constants.pwmYDistEcho);
    
    //y: 31 11/16 x: 28 3/16 INCHES
    double xDim = 28.1875;
    double yDim = 31.6875;

    public UltrasonicSubsystem() {
        Ultrasonic.setAutomaticMode(true);
    }

    public double[] RobotPosition() {
        double xDist = X.getRangeInches() + xDim;
        double yDist = Y.getRangeInches() + yDim;
        return new double[] {xDist,yDist};
    }

    public Boolean TooCloseOnAxis(String axis) {
        switch(axis) {
            case "X":
                if (X.getRangeInches() <= 1.0d) {
                    return true;
                }
                else {
                    return false;
                }
            case "Y":
                if (Y.getRangeInches() <= 1.0d) {
                    return true;
                }
                else {
                    return false;
                }
            default:
                throw new IllegalStateException("Unknown axis: \"" + axis + "\" (axis must be either \"X\" or \"Y\")");
        }
    }


    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation

    }
}