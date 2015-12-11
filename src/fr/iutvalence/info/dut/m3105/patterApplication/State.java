package fr.iutvalence.info.dut.m3105.patterApplication;

public abstract class State {
	
	private int secondEllapsed;
	
	public abstract void tick(TrafficSignal ts);

	public abstract void buttonPressed(TrafficSignal ts);


}
