package us.ilite.common;

import com.flybotix.hfr.codex.RobotCodex;
import com.flybotix.hfr.util.log.ILog;
import com.flybotix.hfr.util.log.Logger;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.util.Color;
import us.ilite.common.types.*;
import us.ilite.common.types.drive.EDriveData;
import us.ilite.common.types.input.ELogitech310;
import us.ilite.common.types.sensor.EGyro;
import us.ilite.common.types.sensor.EPowerDistPanel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

/**
 * Think of this class link an in-memory database optimized for 1 row.  If you need multiple rows, simply manage multiple
 * instances of this class.  Just like all databases, access to data should be universal but without assumptions of
 * null-ness, order of operations, etc.
 */
public class Data {

    private final ILog mLogger = Logger.createLog(Data.class);
    public Color DJ_COLOR;

    //Add new codexes here as we need more

    public static final double NULL_CODEX_VALUE = 0.0;
    public final RobotCodex<EGyro> imu = new RobotCodex(Double.NaN, EGyro.class);
    public final RobotCodex<ELogitech310> driverinput = new RobotCodex(NULL_CODEX_VALUE, ELogitech310.class);
    public final RobotCodex<ELogitech310> operatorinput = new RobotCodex(NULL_CODEX_VALUE, ELogitech310.class);
    public final RobotCodex<EPowerDistPanel> pdp = new RobotCodex(NULL_CODEX_VALUE, EPowerDistPanel.class);
    public final RobotCodex<ELimelightData> limelight = new RobotCodex(NULL_CODEX_VALUE, ELimelightData.class);
    public final RobotCodex<ERawLimelightData> rawLimelight = new RobotCodex(NULL_CODEX_VALUE, ERawLimelightData.class);
    public final RobotCodex<ELimelightData> selectedTarget = new RobotCodex(NULL_CODEX_VALUE, ELimelightData.class);
    public final RobotCodex<EHangerModuleData> hanger = new RobotCodex(NULL_CODEX_VALUE, EHangerModuleData.class);
    public final RobotCodex<EDriveData> drivetrain = new RobotCodex(NULL_CODEX_VALUE, EDriveData.class);
    public final RobotCodex<EPowerCellData> powercell = new RobotCodex(NULL_CODEX_VALUE, EPowerCellData.class);
    public final RobotCodex<EShooterSystemData> flywheel = new RobotCodex(NULL_CODEX_VALUE, EShooterSystemData.class);
    public final RobotCodex<EColorData> color = new RobotCodex(NULL_CODEX_VALUE, EColorData.class);

    public final RobotCodex[] mAllCodexes = new RobotCodex[]{
            imu,
            drivetrain,
            driverinput,
            operatorinput,
            pdp,
            powercell,
            hanger,
            limelight,
            color,
    };

    public final Map<String, RobotCodex> mMappedCodex = new HashMap<>();

    public final RobotCodex[] mLoggedCodexes = new RobotCodex[]{
            imu,
            drivetrain,
            driverinput,
            operatorinput,
            flywheel,
            pdp,
            powercell,
            hanger,
            limelight,
    };

    //Stores writers per codex needed for CSV logging


    /**
     * Create a Data object based on whether or not it is being used for logging
     *
     * @param pLogging
     */
    public Data(boolean pLogging) {
        int i = 0;
        for (RobotCodex rc : mLoggedCodexes) {
            mMappedCodex.put(rc.meta().getEnum().getSimpleName(), rc);
            rc.meta().setGlobalId(i);
            i++;
        }
    }

    public Data() {
        this(true);
    }

    /**
     * Makes the log file if it doesn't already exist
     */
    public static void handleCreation(File pFile) {
        //Makes every folder before the file if the CSV's parent folder doesn't exist
        if (Files.notExists(pFile.toPath())) {
            pFile.getAbsoluteFile().getParentFile().mkdirs();
        }

        //Creates the .CSV if it doesn't exist
        if (!pFile.exists()) {
            try {
                pFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static char recieveColorFmsRelay() {
        //For testing make sure to comment out the method and
        //return a single char for the symbol of the color.
        String gameData;
        gameData = DriverStation.getInstance().getGameSpecificMessage();
        if (gameData.length() > 0) {
            return gameData.charAt(0);
        } else {
            return '\u1000';
        }

    }
}