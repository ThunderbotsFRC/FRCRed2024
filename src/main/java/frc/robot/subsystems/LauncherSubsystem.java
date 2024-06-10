package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase {

    Spark topMotor = new Spark(Constants.pwmTopLauncher);
    Spark bottomMotor = new Spark(Constants.pwmBottomLauncher);
    Spark intakeMotor = new Spark(Constants.pwmIntake);

    public void Spool() {
        intakeMotor.set(1.0);
    }

    public void Launch() {
        topMotor.set(1);
        bottomMotor.set(-1);
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