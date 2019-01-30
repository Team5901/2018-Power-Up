// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5901.hepa.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc5901.hepa.commands.AutonomousStraight;
import org.usfirst.frc5901.hepa.commands.AutonomousTurn;
import org.usfirst.frc5901.hepa.commands.StopDrive;
import org.usfirst.frc5901.hepa.subsystems.*;

/**
 *
 */
public class AutonomousPositon2RightSwitch extends CommandGroup {


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
    public AutonomousPositon2RightSwitch() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS
    	
    	addSequential(new AutonomousStraight(0.5,52), 0.7); // actually 25, but we are cutting early so its faster
    	addSequential(new StopDrive(),.2);
    	addSequential(new AutonomousTurn(55), 0.6);
    	addSequential(new StopDrive(),.2);
    	addSequential(new AutonomousStraight(0.5,70),0.6);
    	addSequential(new StopDrive(),.2);
    	addSequential(new AutonomousTurn(-55), 0.6);
    	addSequential(new StopDrive(),.2);
    	addParallel(new SqueezeOnly(),3);
    	addSequential(new RaiseToSwitch(),3);
    	addSequential(new AutonomousStraight(0.5,60), 1);
    	addSequential(new StopDrive(),.2);
    	addParallel(new LowerArm(),1);
    	addSequential(new Cubeout(),1);
    	addSequential(new AutonomousBackwards(0.3,80),2);
    	addSequential(new StopDrive(),.2);
    	addSequential(new AutonomousTurn(-55), 0.8);
    	addSequential(new StopDrive(),.2);
    	addSequential(new AutoAim(),1);
    	addSequential(new StopDrive(),.2);
    	
    } 
}
