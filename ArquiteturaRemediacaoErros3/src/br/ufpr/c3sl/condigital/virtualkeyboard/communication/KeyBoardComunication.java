package br.ufpr.c3sl.condigital.virtualkeyboard.communication;

import java.util.Observable;

public class KeyBoardComunication extends Observable {

//	private static KeyBoardComunication kc;
	
	
//	public static KeyBoardComunication getInstance(){
//		if (kc == null){
//			kc = new KeyBoardComunication();
//		}
//			return kc;	
//	}
	
	public void send(){
		setChanged();
		notifyObservers();
	}
}