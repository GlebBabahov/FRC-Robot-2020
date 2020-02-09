package us.ilite.robot;

import com.flybotix.hfr.codex.CodexMetadata;
import com.flybotix.hfr.codex.RobotCodex;
import com.flybotix.hfr.util.log.ILog;
import com.flybotix.hfr.util.log.Logger;
import edu.wpi.first.wpilibj.DriverStation;
import us.ilite.common.Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static us.ilite.robot.CSVLogger.kCSVLoggerQueue;

public class CSVWriter {

    public static final String USB_DIR = "/u";
    public static final String USER_DIR = System.getProperty("user.home");
    private static final String LOG_PATH_FORMAT = "/logs/%s/%s-%s-%s.csv";

    private final ILog mLog = Logger.createLog(CSVWriter.class);

    private RobotCodex<?> mCodex;
    private BufferedWriter writer;

    public CSVWriter(RobotCodex<?> pCodex) {
        mCodex = pCodex;

        File file = file();
        Data.handleCreation( file );
        try {
            writer = new BufferedWriter( new FileWriter( file ) );
        } catch (IOException pE) {
            pE.printStackTrace();
        }
    }

    public void log( String s ) {
        try {
            writer.append( s );
            writer.newLine();
        } catch (IOException pE) {
            pE.printStackTrace();
        }
    }

    public void writeHeader() {
        kCSVLoggerQueue.add( new Log( mCodex.getCSVHeader(), mCodex.meta().gid() ) );
    }

    public CodexMetadata<?> getMetaDataOfAssociatedCodex() {
        return mCodex.meta();
    }

    public File file() {

        // Don't default to home dir to avoid filling up memory
//        String dir = "";
//        if(Files.notExists(new File(USB_DIR).toPath())) {
//            dir = USER_DIR;
//        } else {
//            dir = USB_DIR;
//        }

        String dir = USB_DIR;

        String eventName = DriverStation.getInstance().getEventName();
        if ( eventName.length() <= 0 ) {
            // event name format: MM-DD-YYYY_HH-MM-SS
            eventName =  new SimpleDateFormat("MM-dd-YYYY_HH-mm-ss").format(Calendar.getInstance().getTime());
        }

        File file = null;
        if ( mCodex.meta().getEnum().getSimpleName().equals("ELogitech310")) {
            if ( mCodex.meta().gid() == Robot.DATA.driverinput.meta().gid() ) {
                file = new File(String.format( dir + LOG_PATH_FORMAT,
                        eventName,
                        "DriverInput",
                        DriverStation.getInstance().getMatchType().name(),
                        Integer.toString(DriverStation.getInstance().getMatchNumber())
                ));
            } else {
                file = new File(String.format( dir + LOG_PATH_FORMAT,
                        eventName,
                        "OperatorInput",
                        DriverStation.getInstance().getMatchType().name(),
                        Integer.toString(DriverStation.getInstance().getMatchNumber())
                ));
            }
        }
        else {
            file = new File(String.format( dir + LOG_PATH_FORMAT,
                    eventName,
                    mCodex.meta().getEnum().getSimpleName(),
                    DriverStation.getInstance().getMatchType().name(),
                    Integer.toString(DriverStation.getInstance().getMatchNumber())
            ));
        }

        mLog.error("Creating log file at ", file.toPath());

        return file;
    }

    public void closeWriter() {
        try {
            writer.flush();
            writer.close();
        } catch (IOException pE) {
            pE.printStackTrace();
        }
    }

}