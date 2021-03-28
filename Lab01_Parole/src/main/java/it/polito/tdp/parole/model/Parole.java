package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Parole {
	
	ArrayList<String> ArrayParole = new ArrayList<String>();
	LinkedList<String> LinkedParole = new LinkedList<String>();
	TreeMap<String,String> MapParole = new TreeMap<String,String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		
		
		
			if(MapParole.get(p)==null) {
				ArrayParole.add(p);
				MapParole.put(p, p);
			//	LinkedParole.add(p);
			}
		
		
	}
	
	public List<String> getElenco() {
		
		ArrayList<String> ArrayParolex = new ArrayList<String>(ArrayParole);
		LinkedList<String> LinkedParolex = new LinkedList<String>(LinkedParole);
		Collections.sort(ArrayParolex);
		
		return ArrayParolex;
		//return LinkedParolex;
	}
	
	public void reset() {
		ArrayParole.clear();
		MapParole.clear();
		//LinkedParole.clear();
	}

	public void remove(String dr) {
		ArrayParole.remove(dr);
		MapParole.remove(dr);
		//LinkedParole.remove(dr);
	}
}
