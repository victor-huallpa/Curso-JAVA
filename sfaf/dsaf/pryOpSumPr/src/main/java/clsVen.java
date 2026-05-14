import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;

public class clsVen {
    private final List<clsPr> lista =new ArrayList<>();

    public void agrePr(clsPr p){
        lista.add(p);
    }

    public clsPr getPr(int id){
        return lista.get(id);
    }
    public double calTotal(clsPr p){
        return p.getTotal();
    }
    public double calTotal (clsPr p1, clsPr p2){
        return p1.getTotal() + p2.getTotal();
    }
    public double calTotal(clsPr p, double dscto){
        return p.getTotal() - dscto;
    }
    public  double calTotal(){
        double suma = 0.0;
        for (clsPr p : lista){
            suma += p.getTotal();
        }
        return suma;
    }

    public void mostPr(){
        for (clsPr p : lista){
            System.out.println(p.getNom()+"-> S/. " + p.getTotal());
        }
    }


}
