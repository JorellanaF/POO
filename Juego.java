package ElfosvsOrcos;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /////// iMPLEMENTAR ABSTRACTrEINOS
        AbstractReinos factory;
        
        System.out.println("");
        System.out.println("Turno de los Elfos");
        System.out.println("");
        
        factory =  FactoryReinos.getFactory("elfos");
        Elfo elfo = factory.getElfo("arquero");
        elfo.Attack();
        
        factory =  FactoryReinos.getFactory("elfos");
        Elfo elfo1 = factory.getElfo("mago");
        elfo.Attack();
        
        factory =  FactoryReinos.getFactory("elfos");
        Elfo elfo2 = factory.getElfo("reyelfo");
        elfo.Attack();
        
        System.out.println("");
        System.out.println("Turno de los Orcos");
        System.out.println("");
        
        factory =  FactoryReinos.getFactory("orcos");
        Orco orco = factory.getOrco("lanzador");
        orco.Attack();

        factory =  FactoryReinos.getFactory("orcos");
        Orco orco1 = factory.getOrco("hechicero");
        orco.Attack();    
        
        factory =  FactoryReinos.getFactory("orcos");
        Orco orco2 = factory.getOrco("bestiamayor");
        orco.Attack();
    }
    
}
