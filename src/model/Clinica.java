package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Clinica {
	
	private static int count = 0;
	private static HashMap<String,Mascota> mascotas = new HashMap<String,Mascota>();
	
	public static void addMascota(String name,String edad,String desc) {
		synchronized(mascotas) {
			try {
				final String id = count+"";
				mascotas.put(id,new Mascota(id,name,Integer.parseInt(edad),desc));
				count++;
			}catch(NumberFormatException nfe) {}
		}
	}
	
	public static void updateMascota(String id,String name,String edad,String desc) {
		synchronized(mascotas) {
			mascotas.put(id,new Mascota(id,name,Integer.parseInt(edad),desc));
		}
	}
	
	public static Mascota getMascota(String id) {
		return id==null?new Mascota():mascotas.get(id);
	}
	
	public static List<Mascota> search(String tosearch){
		final String vsearch = tosearch.trim();
		ArrayList<Mascota> l = new ArrayList<Mascota>();
		synchronized(mascotas) {
			Iterator<String> keys = mascotas.keySet().iterator();
			while(keys.hasNext()) {
				Mascota mascota = mascotas.get(keys.next());
				if(vsearch.isEmpty()||mascota.getName().contains(vsearch)||mascota.getDescripcion().contains(vsearch))
					l.add(mascota);
			}
		}
		return l;
	}
	
	public static void removeMascota(String id) {
		synchronized(mascotas) {
			mascotas.remove(id);
		}
	}
	
}
