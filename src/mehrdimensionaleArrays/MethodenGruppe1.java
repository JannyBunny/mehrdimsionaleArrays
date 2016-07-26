package mehrdimensionaleArrays;

public interface MethodenGruppe1 {
	
    /**
     * Gibt die Zeile des angegebenen Index zurueck.
     * @param zeile Der Zeilenindex der gewuenschten Zeile.
     * @return Die Zeile als eindimensionales Array.
     */    
    int[] gibZeile(int index);
    
    /**
     * Gibt die Summe der Elemente der Zeile des angegebenen Index zurueck.
     * @param zeile Der Zeilenindex der gewuenschten Zeile.
     * @return Die Zeile als eindimensionales Array.
     */    
    int gibSummeZeile(int index);
	
	/**
     * Prueft, ob das Array quadratisch ist.
     * @return true, falls es quadratisch ist, false sonst.
     */
     boolean istQuadratisch();
     
     /**
      * Gibt den Spaltenindex der Spalte zurueck, in der sich das groesste Element 
      * des Arrays befindet.
      * @return Der Spaltenindex des groessten Elements des Arrays.
      */
     int gibSpalteGroesstesElement();
     
     /**
      * Gibt die Elemente der Nebendiagonale in einem eindimensionalen Array zurueck.
      * (Die Nebendiagonale wird von den Elementen gebildet, die auf einer Linie liegen,
      * die mit dem letzten Element der ersten Zeile beginnt und mit dem ersten 
      * Element der letzten Zeile endet. Voraussetzung Array ist quadratisch.)
      * Prueft, ob das Array quadratisch ist. Wenn dies der Fall ist,
      * werden die Elemente der Nebendiagonalen in ein eindimensionales Array 
      * gespeichert und dieses wird zurueck gegeben. 
      * Andernfalls wird eine ArrayNichtQuadratischException geworfen.
      * @return Die letzte Zeile als eindimensionales Array.
      * @throws ArrayNichtQuadratischException Falls das Array nicht quadratisch ist.
      */
     int[] gibNebenDiagonale();

}
