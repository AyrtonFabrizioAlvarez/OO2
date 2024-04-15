package ar.edu.info.unlp.ejercicioDemo;

public class AdapterVideoStream implements Media{
	private VideoStream streaming;
	
	public AdapterVideoStream() {
		this.streaming = new VideoStream();
	}
	
	public String play() {
		return this.streaming.reproduce();
	}
}
