package com.prvt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayerMain {

	private static ArrayList<Albums> albums = new ArrayList<>();

	public static void main(String[] args) {
		Albums album = new Albums("Album", "AC/DC");
		album.addSong("Highway", 4.5);
		album.addSong("TNT", 3.5);
		album.addSong("To the hell", 5.2);
		albums.add(album);

		album = new Albums("Album", "Eminem");
		album.addSong("rap God", 5.4);
		album.addSong("godzilla", 3.4);
		album.addSong("not afraid", 4.4);
		albums.add(album);

		LinkedList<Song> playlist1 = new LinkedList<>();
		albums.get(0).addToPLaylist("TNT", playlist1);
		albums.get(0).addToPLaylist("Highway", playlist1);
		albums.get(1).addToPLaylist("godzilla", playlist1);
		play(playlist1);
	}

	private static void play(LinkedList<Song> playlist) {
		Scanner scan = new Scanner(System.in);
		boolean quite = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.size() == 0) {
			System.out.println("this playlist has no song");
		} else {
			System.out.println("now plaing " + listIterator.next().toString());
			printmenu();
		}
		while (!quite) {
			int action = scan.nextInt();
			scan.nextLine();

			switch (action) {
			case 0:
				System.out.println("playlist. is complete");
				quite = true;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("now playing" + listIterator.next().toString());
				} else {
					System.out.println("no song awailable next");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.hasPrevious();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("now playing" + listIterator.previous());
				} else {
					System.out.println("at first song");
					forward = false;
				}
				break;
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("now playing" + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("we are on first");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("now playing " + listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("we reached to end of list");
					}
				}
				break;
			case 4:
				printlist(playlist);
				break;
			case 5:
				System.err.println("offer 25 percent on get 1 month subscription at 99 rs only");
				break;
			case 6:
				if(playlist.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing" + listIterator.next().toString());
					}else {
						if(listIterator.hasPrevious()) {
							System.out.println("now playing" + listIterator.previous().toString());
						}
					}
				}
			}
		}

	}

	private static void printmenu() {
		System.out.println("All the available option\n");
		System.out.println("0 - To quit \n" + "1 - play next \n" + "2- play previous \n" + "3- replay  \n"
				+ "4 - show all song  \n" + "5 - buy premium" + "6 - delete from playlist");
	}

	private static void printlist(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("-----------------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------");
	}

}
// 33.43 // main 36