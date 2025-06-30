package com.simple;

public class Ipl {
	public void teamCreation(String q, String w,int e,int r) {
		Player p=new Player();
		
		p.setName(q);
		p.setProfile(w);
		p.setTopscore(e);
		p.setWkt(r);
		
		String namee=p.name;
		String profilee=p.profile;
		int topp=p.topscore;
		int wkte=p.wkt;
		
		System.err.println(namee);
		System.out.println(profilee);
		System.out.println(topp);
		System.out.println(wkte);

	}

}
