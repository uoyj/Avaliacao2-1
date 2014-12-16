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
public class PontoXZ extends Ponto2D {
    
    public PontoXZ() {
        super(0,0,0);
    }

    
    public PontoXZ(double x, double z) {
        super(x, 0, z);
    }
    
    @Override
    public String toString() {
        return String.format(getNome() + "(" + this.getX() + "," + this.getZ() + ")");
    }
}
