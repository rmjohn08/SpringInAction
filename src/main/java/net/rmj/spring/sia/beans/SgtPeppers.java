package net.rmj.spring.sia.beans;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt Peppers Lonely ";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + "by " + artist);
		
	}

}
