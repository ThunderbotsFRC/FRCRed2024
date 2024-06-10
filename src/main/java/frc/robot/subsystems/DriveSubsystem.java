

//this subsystem will contain all the different methods needed to make the drivetrain drive. 
// I plan on adding basic arcadeDrive functionality, as Sean (the driver) prefers it over curvatureDrive.
// This is also the place where I will instantiate the motor controllers and controller groups. 


//initial subsystem setup and imports. 
package frc.robot.subsystems; 

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import com.ctre.phoenix6.*;

public class DriveSubsystem extends SubsystemBase {
    /*create a new DriveSubsytem*/

    //construct new spark objects 
    Spark s_leftFront = new Spark(Constants.pwmLeftFront);
    Spark s_leftBack = new Spark(Constants.pwmLeftBack);
    Spark s_rightFront = new Spark(Constants.pwmRightFront);
    Spark s_rightBack = new Spark(Constants.pwmRightBack);
    //Spark s_armBase = new Spark(Constants.);
 

    

    //values of joystick inputs 
    double leftJoy = 0;
    double rightJoy = 0;

    public DriveSubsystem() {
        //code here

        //start diffDrive
    }

    public void drive(double x, double y, double r) {
        s_leftFront.set(MathUtil.clamp(-x + y + r,0,1));
        s_rightFront.set(MathUtil.clamp(x - y + r,0,1));
        s_leftBack.set(MathUtil.clamp(-x + y + r,0,1));
        s_rightBack.set(MathUtil.clamp(x - y + r,0,1));
    }

    @Override
    public void periodic() {
        //this method updated periodically, once per scheduler run..

    }

    @Override
    public void simulationPeriodic() {
        //I doubt I'll get to simulation at this point, but any monitoring would go here. 
    }
}

