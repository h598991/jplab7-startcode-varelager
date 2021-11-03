package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		double laveste=1000000000;
		int billigste=-1;
		int lengde = varer.length;
		for (int i=0; i<lengde; i++) {
			if(varer[i].getPris()<laveste) {
				laveste=varer[i].getPris();
				billigste=i;
			}
		}
		return varer[billigste];

	}
	
	public static double totalPris(Vare[] varer) {		
		
		double sum=0;
		for(int i=0; i<varer.length; i++) {
			sum+=varer[i].getPris();
		}
		return sum;

	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int length=varer.length;
		int[] varenumre=new int[length];
		for (int i=0; i<length; i++) {
			varenumre[i]=varer[i].getVarenr();
		}
		return varenumre;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		int length=varer.length-1;
		double[] differanser = new double[length];
		for (int i=0; i<length; i++) {
			differanser[i]=varer[i+1].getPris()-varer[i].getPris();
		}
		return differanser;
		

	}
}
