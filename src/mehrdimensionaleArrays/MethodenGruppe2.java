package mehrdimensionaleArrays;

public interface MethodenGruppe2 {
	
    /**
     * Gibt die letzte Zeile des Arrays zurueck.
     * @return Die letzte Zeile als eindimensionales Array.
     */    
    int[] gibLetzteZeile(); 
 
    /**
     * Gibt die Summe der Elemente der angegebenen Spalte zurueck.
     * Die Methode prueft ob Elemente in der angegebene Spalte vorhanden sind
     * und berechnet die Summe der vorhandenen Elemente.  
     * @param spalte Der Spaltenindex der gewuenschten Spalte.
     * @return Die Summe der Elemente der angegebenen Spalte.
     */
    int gibSummeSpalte(int spalte);
    
    /**
     * Gibt das groesste in dem Array gespeicherte Element (die groesste Zahl)
     * zurueck.
     * @return Das groesste im Array gespeicherte Element.
     */
    int gibGroesstesElement();
    
	/**
     * Prueft, ob das Array rechteckig ist.
     * @return true, falls es rechteckig ist, false sonst.
     */
    boolean istRechteckig();
    
    /**
     * Gibt die Summe der Elemente der Diagonalen zurueck. (Die Diagonale wird
     * von den Elementen gebildet, die auf einer Linie liegen, die mit dem ersten 
     * Element der ersten Zeile beginnt und mit dem letzten Element der letzten 
     * Zeile endet. Voraussetzung Array ist quadratisch.)
     * Prueft, ob das Array quadratisch ist. Wenn dies der Fall ist,
     * wird die Summe der Elemente der Diagonalen berechnet und zurück 
     * gegeben. Andernfalls wird eine ArrayNichtQuadratischException
     * geworfen.
     * @return Die Summe der Diagonalen.
     * @throws ArrayNichtQuadratischException Falls das Array nicht quadratisch ist.
     */
    int summeDiagonale();
    
    /**
     * Gibt die Elemente der Diagonalen in einem eindimensionalen Array zurueck.
     * (Die Diagonale wird von den Elementen gebildet, die auf einer Linie liegen,
     * die mit dem ersten Element der ersten Zeile beginnt und mit dem letzten
     * Element der letzten Zeile endet. Voraussetzung Array ist quadratisch.)
     * Prueft, ob das Array quadratisch ist. Wenn dies der Fall ist,
     * werden die Elemente der Diagonalen in ein eindimensionales Array gespeichert
     * und dieses wird zurueck gegeben. 
     * Andernfalls wird eine ArrayNichtQuadratischException geworfen.
     * @return Die letzte Zeile als eindimensionales Array.
     * @throws ArrayNichtQuadratischException Falls das Array nicht quadratisch ist.
     */
    int[] gibDiagonale();
    
}
