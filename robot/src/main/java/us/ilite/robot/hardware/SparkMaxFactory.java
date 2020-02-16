package us.ilite.robot.hardware;

import com.flybotix.hfr.util.log.ILog;
import com.flybotix.hfr.util.log.Logger;
import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMaxLowLevel.PeriodicFrame;

/**
 * This is a factory class for the Spark MAX motor controller that re-configures
 * all settings to our defaults. Note that settings must be explicitly flashed
 * to the Spark MAX in order to persisten across power cycles.
 *
 */
public class SparkMaxFactory {
    private static final ILog mLogger = Logger.createLog(SparkMaxFactory.class);
    public static class Configuration {
        public int CAN_TIMEOUT = 100;
        public int CONTROL_FRAME_PERIOD = 10;
        public IdleMode IDLE_MODE = IdleMode.kBrake;
        public int STATUS_0_PERIOD_MS = 10;
        public int STATUS_1_PERIOD_MS = 20;
        public int STATUS_2_PERIOD_MS = 50;
        public double RAMP_RATE = 0.0;
        public int SMART_CURRENT_LIMIT = 80;
        public double SECONDARY_CURRENT_LIMIT = 0.0;
        public MotorType MOTOR_TYPE = MotorType.kBrushless;
    }

    private static final Configuration kDefaultConfiguration = new Configuration();
    private static final Configuration kFollowConfiguration = new Configuration();

    static {
        // kFollowConfiguration.CONTROL_FRAME_PERIOD = 100;
    }

    public static CANSparkMax createDefaultSparkMax(int pId, MotorType pMotorType) {
        return createSparkMax(pId, kDefaultConfiguration);
    }

    public static CANSparkMax createFollowerSparkMax(int pId, CANSparkMax pMaster, MotorType pMotorType) {
        CANSparkMax spark = createSparkMax(pId, kFollowConfiguration);
        spark.follow(pMaster);
        return spark;
    }

    public static CANSparkMax createSparkMax(int pId, Configuration pConfiguration) {
        CANSparkMax spark = new CANSparkMax(pId, pConfiguration.MOTOR_TYPE);
        CANError error = spark.restoreFactoryDefaults();

        mLogger.warn("CHRIS: ID: " + pId +", got error state= " + error);
        if(error == CANError.kOk) {
            spark.setCANTimeout(pConfiguration.CAN_TIMEOUT);
            spark.setIdleMode(pConfiguration.IDLE_MODE);
            spark.setPeriodicFramePeriod(PeriodicFrame.kStatus0, pConfiguration.STATUS_0_PERIOD_MS);
            spark.setPeriodicFramePeriod(PeriodicFrame.kStatus1, pConfiguration.STATUS_1_PERIOD_MS);
            spark.setPeriodicFramePeriod(PeriodicFrame.kStatus2, pConfiguration.STATUS_2_PERIOD_MS);
            spark.setSecondaryCurrentLimit(pConfiguration.SECONDARY_CURRENT_LIMIT);
            spark.setSmartCurrentLimit(pConfiguration.SMART_CURRENT_LIMIT);
        } else {
            mLogger.warn("CHRIS: GOT AN ERROR: " + error);

            return null;
        }

        return spark;
    }

}
