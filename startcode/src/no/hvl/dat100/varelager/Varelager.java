package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		varer = new Vare[n];
		antall=0;
	}
	
	public Vare[] getVarer() {
		return varer;
	}
	
	public boolean leggTilVare(Vare v) {
		boolean lagtTil=false;
		if (antall<varer.length) {
			varer[antall]=v;
			antall++;
			lagtTil=true;
		}
		return lagtTil;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		boolean lagtTil=false;
		Vare v=new Vare(varenr, navn, pris);
		lagtTil = leggTilVare(v);
		
		return lagtTil;

	}
	
	public Vare finnVare(int varenr) {
			boolean funnet=false;
			int count=0;
			while(!funnet && count<antall) {
				int varenrTmp=varer[count].getVarenr();
				if (varenrTmp==varenr) {
					funnet=true;
				}else {
					count++;
				}
			}
			if (funnet){
				return varer[count];
			}else {
				return null;
			}
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
		System.out.println(SEP);
		for(int i=0; i<antall; i++) {
			System.out.println(varer[i].toString());
		}
		System.out.println(SEP);

	}
	
}
