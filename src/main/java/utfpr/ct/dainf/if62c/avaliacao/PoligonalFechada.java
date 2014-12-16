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
public class PoligonalFechada extends Poligonal{

    public PoligonalFechada(int n) {
        super(n);
    }

    @Override
    public double getComprimento() {
        return super.getComprimento() + this.getV()[0].dist(this.getV()[this.getN()-1]); 
    }
    
    
}
