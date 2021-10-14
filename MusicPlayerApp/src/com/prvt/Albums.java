package com.prvt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Albums {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	// ****************************************************constructor************************************************
	public Albums() {
	}

	public Albums(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
//		this.songs = songs;
	}

	// ****************************************************methods********************************************************
	//FIND SONG
	private Song findSong(String title) {
		for (Song checkedSong : songs) {
			if (checkedSong.getsTitle().equals(title)) return checkedSong;
		}
		return null;
	}
	//ADD SONG
	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			System.out.println("Succesfully Added" + title + ", " + duration + "with duration");
			return true;
		} else {
			System.out.println("Already Exist");
			return false;
		}
	}
	//Add To Playlist
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		int index = trackNumber -1 ;
		if(index > 0 && index <= songs.size()) {
			playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("this album doesnt have a track.. eith this number " + trackNumber);
		return false;
	}
	//Add To Playlist
	public boolean addToPLaylist(String title, LinkedList<Song> playList) {
		for(Song checkedSong : this.songs) {
			if(checkedSong.getsTitle().equals(title)) {
				playList.add(checkedSong);
				return true;
			}
		}
		System.out.println("No such song" + title);
		return false;
		
	}
}
