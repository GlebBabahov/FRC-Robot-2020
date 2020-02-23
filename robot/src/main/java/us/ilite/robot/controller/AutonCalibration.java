package us.ilite.robot.controller;

import com.team319.trajectory.Path;
import us.ilite.robot.auto.paths.*;

public class AutonCalibration extends BaseAutonController {


    private Path mDefaultPath = new Kate_test_path(); //T_LINE_10_FT(); //T_LINE_F10FT_L90DEG_F5FT_R5FT();
//    private Path mPath = new T_90DEG_12FT(); //T_LINE_10_FT(); //T_LINE_F10FT_L90DEG_F5FT_R5FT();
//    private Path mPath = new T_LINE_10_FT(); //T_LINE_F10FT_L90DEG_F5FT_R5FT();


    public AutonCalibration() {
        super(new Kate_test_path(), false);
        // Time to go through path plus any delay
    }

    @Override
    protected void updateImpl(double pNow) {
        super.updateImpl(pNow);
//        // Add a time check to prevent errors when things go wrong
//        if(mActivePath != null && pNow - mPathStartTime <= mMaxAllowedPathTime) {
//            int index = BobUtils.getIndexForCumulativeTime(mActivePath, pNow, mPathStartTime);
//            if(index >= 0) {
//                db.drivetrain.set(EDriveData.STATE, EDriveState.PATH_FOLLOWING_BASIC);
//                db.drivetrain.set(EDriveData.L_PATH_FT_s, mActivePath.getValue(index, Path.SegmentValue.LEFT_VELOCITY));
//                db.drivetrain.set(EDriveData.R_PATH_FT_s, mActivePath.getValue(index, Path.SegmentValue.RIGHT_VELOCITY));
//            } else {b
//                e();
//                System.out.println("==== SUCCESSFULLY END AUTONOMOUS PATH ====");
//                e();
//                mActivePath = null;
//            }
//        } else if(mActivePath != null && pNow - mPathStartTime > mMaxAllowedPathTime) {
//            e();
//            System.out.println("==== END AUTONOMOUS PATH DUE TO TIME OVERRUN ====");
//            e();
//        }
    }

}
