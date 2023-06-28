package entity;

import entityenum.positionName;

public class Position {
	private int PositionID;
	private positionName PositionName;
	@Override
	public String toString() {
		return "Position [PositionID=" + PositionID + ", PositionName=" + PositionName + "]";
	}
	public int getPositionID() {
		return PositionID;
	}
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public positionName getPositionName() {
		return PositionName;
	}
	public void setPositionName(positionName positionName) {
		PositionName = positionName;
	}
	
	

}
