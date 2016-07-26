package mehrdimensionaleArrays;

/**
 * Die Klasse ZweidimensionalesArray modelliert eine 2-dimensionale
 * Anordung ganzer Zahlen (ein zweidimensionales Array ganzer Zahlen).
 * 
 * @author jrg
 * @version 07/2016
 */


public class ZweidimensionalesArray {	

    // Instanzvariable - speichert ein 2-dimensionales Array ganzer Zahlen.
	
     private int array2d [][] ;

    /**
     * Ein Bequemlichkeitskonstruktor fuer Objekte der Klasse ZweidimensionalesArray.
     * Erzeugt ein zweidimensionales Array und intialisiert dessen Elemente mit Werten
     * nach Wahl des Programmierers.
     */
    public ZweidimensionalesArray()
    {
    	array2d = new int[][] {{1,4,6,7},{9,12,14,6},{9,4,5,2}};
    	
    }
    

    /**
     * Ein Konstruktur fuer eine neue ZweidimensionalesArray. Es wird ein Array mit
     * Initialisierungswerten uebergeben. Diese werden in das in dieser Klasse
     * definierte Datenfeld kopiert.
     * @param initArray Ein Array, das die Initialisierungswertwerte 
     * fuer dieses Objekt enthaelt.
     */
    public ZweidimensionalesArray(int [][] initArray)
    {
    	
    	if (initArray != null){
    		int array[][] = new int [initArray.length][initArray[0].length];
	    	for (int i =0; i< initArray.length; i++) {
	    		for (int j=0; j<initArray[i].length; j++) {
	    			array[i][j]=initArray[i][j];	
	    		}
	    	}
    	}
    	else {
    		throw new IndexOutOfBoundsException("übergebenes Array ist leer!");
    	}
    	
    }
    
	/**
     * Ueberschreibt toString().
     * Erzeugt eine Zeichenkette, welche die Werte des Arrays enthaelt, getrennt 
     * durch Leerzeichen. Am Ende jeder Zeile des Arrays enthaelt die Zeichenkette
     * ein Sonderzeichen fuer einen Zeilensprung. 
     * @return Zeichenkette, die den Zustand dieses Objektes beschreibt.
     */
     public String toString()
    {
    	 String out="";
    	 if (array2d != null){
 	    	for (int i =0; i< array2d.length; i++) {
 	    		for (int j=0; j<array2d[i].length; j++) {
 	    			out+=array2d[i][j]+" ";	
 	    		}
 	    		out+=array2d[i]+" \n";
 	    	}
 	    	return out;
     	}
     	else {
     		throw new IndexOutOfBoundsException("übergebenes Array ist leer!");
     	}
    	 
    	 
    }

    /**
     * Gibt das Array auf der Konsole aus. Formatierung wie bei toString()
     */
    public void ausgeben()
    {
//        System.out.println();
    }

    /**
     * Gibt das Element der angegebenen Zeile und Spalte zurueck.
     * @param zeile Der Zeilenindex des gesuchten Elements.
     * @param spalte Der Spaltenindes des gesuchten Elements.
     * @return Der Wert des gesuchten Elements.
     */
    public int gibElement(int zeile, int spalte)
    {
        return 0;
    }     
    

    public static void main(String[] args) {
    	int array2d2 [][] = null;//{{1,4,6,7},{9,12},{9,4,5,2}};
    	ZweidimensionalesArray zda = new ZweidimensionalesArray();
    	
    	try {ZweidimensionalesArray zda2 = new ZweidimensionalesArray(array2d2);}
    	catch (IndexOutOfBoundsException e) {System.err.println(e.getMessage());}

    	System.out.println(zda.toString());
    	
    	zda.ausgeben();
		
	}

}
