package org.firstinspires.ftc.team_Teleop_Reformat.auto_command_groups;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.TeamCode_reformatted.commands.ToggleClaws;
import org.firstinspires.ftc.team_Teleop_Reformat.commands.UseLiftByTime;
import org.firstinspires.ftc.team_Teleop_Reformat.commands.Wait;
import org.firstinspires.ftc.team_Teleop_Reformat.auto_command_groups.AutonomousCommandGroup;
import org.firstinspires.ftc.team_Teleop_Reformat.commands.BlueJewl;
import org.firstinspires.ftc.team_Teleop_Reformat.commands.GyroTurn;
import org.firstinspires.ftc.team_Teleop_Reformat.commands.TimedDriveStraight;

/**
 * Created by Coby on 12/14/2017.
 */
@Autonomous(name = "blue angled position", group = "")
public class BlueRight extends AutonomousCommandGroup {
    @Override
    public void addCommands() {
        addSequential(new ToggleClaws(false));
        addSequential( new BlueJewl());
        addSequential(new UseLiftByTime(.5, 700));
        addSequential(new Wait(1000));
        addSequential(new TimedDriveStraight(1000, -.25));
        addSequential(new Wait(1000));
        addSequential(new GyroTurn(robot, 150, .55));
        addSequential(new Wait(1000));
        addSequential(new TimedDriveStraight(1000, .6));

        addSequential(new ToggleClaws(true));
        addSequential(new TimedDriveStraight(250, -.6));
        addSequential(new Wait(1000));
        addSequential(new ToggleClaws(false));
        addSequential(new UseLiftByTime(-.5, 500));
        addSequential(new Wait(500));
        addSequential(new TimedDriveStraight(500, .6));
        addSequential(new Wait(500));
        addSequential(new TimedDriveStraight(200, -.5));
    }
}
