package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Agenda {
	
	private Set <Contacto> cts ;
	
	
	public Agenda() {
		cts= new TreeSet<>();
	}
	
	public void addCont(Contacto c) {
		cts.add(c);
	}
	
	public void dedCont(Contacto c) {
		cts.remove(c);
	}
	
	public void addTlfCt(String tlf, Contacto c) {
		if(cts.contains(c)) {
			c.addTlf(tlf);
		}
	}

	@Override
	public String toString() {
		return "Agenda [cts=" + cts + "]";
	}
	
	
}
