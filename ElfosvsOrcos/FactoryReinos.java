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
public class FactoryReinos {
    public static AbstractReinos getFactory(String tipo){
        switch (tipo){
            case "elfos":
                return  new FactoryElfos();
            case "orcos":
                return new FactoryOrcos();
        }
        return null;
    }
}
