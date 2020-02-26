package kr.ih.lover.biz.vo;

public class FloorVO {

	private String seq;
	private String id;
	private String state;
	private String startState;
	private String subYn;
	private String stateImg;
	
	public String getStartState() {
		return startState;
	}
	public void setStartState(String startState) {
		this.startState = startState;
	}
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSubYn() {
		return subYn;
	}
	public void setSubYn(String subYn) {
		this.subYn = subYn;
	}
	public String getStateImg() {
		return stateImg;
	}
	public void setStateImg(String stateImg) {
		this.stateImg = stateImg;
	}
	@Override
	public String toString() {
		return "FloorVO [seq=" + seq + ", id=" + id + ", state=" + state + ", startState=" + startState + ", subYn="
				+ subYn + ", stateImg=" + stateImg + "]";
	}
	public FloorVO(String seq, String id, String state, String startState, String subYn, String stateImg) {
		super();
		this.seq = seq;
		this.id = id;
		this.state = state;
		this.startState = startState;
		this.subYn = subYn;
		this.stateImg = stateImg;
	}

	public FloorVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
