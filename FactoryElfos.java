/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElfosvsOrcos;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class FactoryElfos implements AbstractReinos{
    
    @Override
    public Elfo getElfo(String tipo) {
        switch (tipo) {
            case "arquero":
                return new Arquero();
            case "mago":
                return new Mago();
            case "reyelfo":
                return new ReyElfo();
        }
        return null;
    }

    @Override
    
    public Orco getOrco(String tipo) {
        return null;
    }
}
