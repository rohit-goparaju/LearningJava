package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AdapterDesignPatternTest {
	@Test
	public void test() {
		AdapterDesignPattern mediaAdapter = new AdapterDesignPattern();
		assertTrue(mediaAdapter.play("mp4", "song").equals("Playing Mp4 file: song"));
		assertTrue(mediaAdapter.play("vlc", "song").equals("Playing Vlc file: song"));
		assertTrue(mediaAdapter.play("mp3", "song").equals("File type mp3 not supported."));
	}
}
