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
public class FactoryOrcos implements AbstractReinos{
    @Override
    public Elfo getElfo(String tipo) {
        return null;
    }

    @Override
    
    public Orco getOrco(String tipo) {
        switch (tipo) {
            case "lanzador":
                return new Lanzador();
            case "hechicero":
                return new Hechicero();
            case "bestiamayor":
                return new BestiaMayor();
        }
        return null;
    }
    
}
