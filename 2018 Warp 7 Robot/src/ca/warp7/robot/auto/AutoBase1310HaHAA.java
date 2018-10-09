package ca.warp7.robot.auto;

import edu.wpi.first.wpilibj.DriverStation;

public class AutoBase1310HaHAA {
	public void autonomousPeriodic(String gameData) {
		if (gameData.equals("RRR")) {
			scale_right();
		} else if (gameData.equals("LLL")) {
			scale_left();
		} else if (gameData.equals("LRL")) {
			scale_right();
		} else if (gameData.equals("RLR")) {
			scale_left();
		}
	}

	private void scale_left() {
		// TODO Auto-generated method stub
		
	}

	private void scale_right() {
		// TODO Auto-generated method stub
		
	}
}

class SharedAuto{
	double encoderZeroVal = 0;
	
	DriverStation driverstationInst = DriverStation.getInstance();
	
	public SharedAuto() {
		
	}
	
	
	
	public double getTime() {
		return driverstationInst.getMatchTime();
	}
	
	//public double getDistance() {
		//return getMethod - encoderZeroVal
	//}
	
	public void zeroDistance() {
		//encoderZeroVal = getDistance() + encoderZeroVal;
	}
	
}