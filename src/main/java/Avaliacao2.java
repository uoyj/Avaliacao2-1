
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        PoligonalFechada P = new PoligonalFechada(3);
        
        P.set(0, new PontoXZ(-3, 2));
        P.set(1, new PontoXZ(-3, 6));
        P.set(2, new PontoXZ(0, 2));
        
        System.out.println("Comprimento da poligonal = " + P.getComprimento());
        
        
    }
    
}
