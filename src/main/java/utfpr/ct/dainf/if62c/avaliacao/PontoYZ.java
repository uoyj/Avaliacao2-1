/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1138685
 */
public class PontoYZ extends Ponto2D {
    
    public PontoYZ() {
        super(0,0,0);
    }

    
    public PontoYZ(double y, double z) {
        super(0, y, z);
    }
    
    @Override
    public String toString() {
        return String.format(getNome() + "(" + this.getY() + "," + this.getZ() + ")");
    }
}
