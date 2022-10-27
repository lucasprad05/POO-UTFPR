
package exc1;

import java.util.ArrayList;

public class Principal {

    public void iniciar(){
        ArrayList<ICliente> lista = new ArrayList<>();
        ICliente conta = new ContaCorrente(32678, 1000f, 50f);
        lista.add(conta);
        
        conta = new ContaSalario(1800f, 250f, 4281819);
        lista.add(conta);
        
        conta = new ContaPoupanca(17500f, "17/12/2018");
        lista.add(conta);
        
        for(ICliente i:lista){
            System.out.println(i);
        }
        
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
}
