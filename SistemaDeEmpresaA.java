package sistemadeempresaa;

import java.util.ArrayList;

public class SistemaDeEmpresaA {

    public static void main(String[] args) {
        
        Predio P = new Predio("A", 2);
        P.addSala(new Sala(40));
        Empresa E = new Empresa();
        E.setNomeEmpresa("Gu-Jão-Brasil");
        Sala S = new Sala(2,2);
        E.getNomeEmpresa();
        

    }

}
