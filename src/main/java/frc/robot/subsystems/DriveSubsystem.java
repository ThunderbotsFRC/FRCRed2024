

//this subsystem will contain all the different methods needed to make the drivetrain drive. 
// I plan on adding basic arcadeDrive functionality, as Sean (the driver) prefers it over curvatureDrive.
// This is also the place where I will instantiate the motor controllers and controller groups. 


//initial subsystem setup and imports. 
package frc.robot.subsystems; 

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class DriveSubsystem extends SubsystemBase {
    /*create a new DriveSubsytem*/

    //construct new spark objects 
    WPI_VictorSPX leftFront = new WPI_VictorSPX(Constants.CANLeftFront); //dummy
    WPI_VictorSPX leftBack = new WPI_VictorSPX(Constants.CANLeftBack); //dumber
    WPI_VictorSPX rightFront = new WPI_VictorSPX(Constants.CANRightFront); //dumbest
    WPI_VictorSPX rightBack = new WPI_VictorSPX(Constants.CANRightBack); //dumbo
    //Spark s_armBase = new Spark(Constants.)pwmRightFront;

    public DriveSubsystem() {
        //code here
        
        //start diffDrive
    }

    public void drive(double speedX, double speedY, double speedR) {
        leftFront.set(MathUtil.clamp(-speedY - speedX - speedR, -1, 1));
        rightFront.set(MathUtil.clamp(speedY - speedX - speedR, -1, 1));
        leftBack.set(MathUtil.clamp(speedY + speedX - speedR, -1, 1));
        rightBack.set(MathUtil.clamp(-speedY + speedX - speedR, -1, 1));
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

