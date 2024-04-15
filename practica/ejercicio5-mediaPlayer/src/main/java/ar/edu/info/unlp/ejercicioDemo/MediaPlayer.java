package ar.edu.info.unlp.ejercicioDemo;


public class MediaPlayer {
	private Media medias;
	
	public MediaPlayer() {
	}
	
	public void setMedia(Media media) {
		this.medias = media;
	}
	
	public String play() {
		return this.medias.play();
	}
}
