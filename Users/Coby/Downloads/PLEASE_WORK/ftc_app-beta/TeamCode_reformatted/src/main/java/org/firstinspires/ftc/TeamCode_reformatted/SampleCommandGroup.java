package org.firstinspires.ftc.TeamCode_reformatted;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.TeamCode_reformatted.commands.RedJewl;
import org.firstinspires.ftc.TeamCode_reformatted.commands.TimeDriveTurn;
import org.firstinspires.ftc.TeamCode_reformatted.commands.TimedDriveStraight;
import org.firstinspires.ftc.TeamCode_reformatted.commands.Wait;

/**
 * Created by Coby on 12/4/2017.
 */
@Autonomous(name ="sample command group", group = "test")
public class SampleCommandGroup extends AutonomousCommandGroup {
    public SampleCommandGroup(){
        addSequential(new Wait(5000));

        addSequential(new RedJewl());
        addSequential(new TimedDriveStraight(2000, .6));
        addSequential(new Wait(5000));
        addSequential(new TimeDriveTurn(1000, .6));
    }
}