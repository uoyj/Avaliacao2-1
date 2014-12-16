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
public class Poligonal {
    private int n;
    private Ponto2D[] v;
    private boolean ok = false;
    private String plano;
    
    public Poligonal(int n) {
        if (n < 2)
        {
            throw new RuntimeException ("Poligonal deve ter ao menos 2 vértices");
        }
        this.n = n;
        v = new Ponto2D[n];
    }

    public int getN() {
        return n;
    }
    
    public Ponto2D get(int x)
    {
        if (this.n < x || x < 0) return null;
        
        return v[x];              
    }
    
    protected Ponto2D[] getV()
    {
        return v;
    }
    
    public void set(int x, Ponto2D P)
    {
        if(this.n < x) return;
        
        if (!this.ok)
        {
            v[x] = P;
            this.plano = v[x].getNome();
            this.ok = true;
        }
        else
        {
            if(P.getNome().equals(this.plano)) v[x] = P;
            else
            {
                throw new RuntimeException ("Vértices devem estar no mesmo plano");
            }
        }
    }
    
    public double getComprimento()
    {
        double comp = 0;
        
        for(int i = 1; i < this.n ; i++)
        {
            comp += v[i].dist(v[i-1]);
        }
        return comp;
    }
}
