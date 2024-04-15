package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class MediaPlayerTest {
	
	MediaPlayer media;
	AdapterVideoStream adapter;
	VideoFile video;
	Audio audio;
	
	@BeforeEach
	void setUp() throws Exception {
		media = new MediaPlayer();
		adapter = new AdapterVideoStream();
		video = new VideoFile();
		audio = new Audio();
	}
	
    @Test
    public void testAudio() {
        media.setMedia(audio);
        assertEquals("Reproduciendo un Audio", media.play());
    }
    @Test
    public void testVideo() {
        media.setMedia(video);
        assertEquals("Reproduciendo un Video", media.play());
    }
    @Test
    public void testVideoStream() {
        media.setMedia(adapter);
        assertEquals("Reproduciendo un VideoStreaming", media.play());
    }
    
}
