package us.ilite.common.types.drive;

import com.flybotix.hfr.codex.CodexOf;

public enum EDriveData implements CodexOf<Double> {

    // Sensor inputs
    LEFT_POS_INCHES, RIGHT_POS_INCHES,
    LEFT_VEL_IPS, RIGHT_VEL_IPS,
    LEFT_VEL_TICKS, RIGHT_VEL_TICKS,
    LEFT_CURRENT, RIGHT_CURRENT,
    LEFT_VOLTAGE, RIGHT_VOLTAGE,
    IS_CURRENT_LIMITING,


    // Commanded Outputs
    LEFT_DEMAND, RIGHT_DEMAND,
    DESIRED_TURN_PCT, DESIRED_THROTTLE_PCT,DESIRED_NEUTRAL_MODE,
    DESIRED_STATE,
    DESIRED_AZIMUTH,
//    LEFT_ACCEL, RIGHT_ACCEL,
//    LEFT_FEEDFORWARD, RIGHT_FEEDFORWARD,

    // Raw Outputs
    LEFT_MESSAGE_OUTPUT, RIGHT_MESSAGE_OUTPUT,
    LEFT_MESSAGE_CONTROL_MODE, RIGHT_MESSAGE_CONTROL_MODE,
    LEFT_MESSAGE_NEUTRAL_MODE, RIGHT_MESSAGE_NEUTRAL_MODE;

}
