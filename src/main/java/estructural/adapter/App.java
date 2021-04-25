package estructural.adapter;

import estructural.adapter.bankadapter.CrediBankAdapter;
import estructural.adapter.bankadapter.DataCreditoAdapter;
import estructural.adapter.bankadapter.IBankAdapter;

public class App {

    public static void main(String[] args) {
//        String tipo = "PAS";
//        String numero = "4127621366";
        String tipo = "CI";
        String numero = "834364";
        IBankAdapter crediBank = new CrediBankAdapter();
        System.out.println("El solicitante es valido en credibank: "+
                ((crediBank.isUsuarioValido(tipo, numero).isUsuarioValido())
                    ? "SI"
                    : "NO")
        );

        IBankAdapter dataCredito = new DataCreditoAdapter();
        System.out.println("El solicitante es valido en datacredito: "+
                ((dataCredito.isUsuarioValido(tipo, numero).isUsuarioValido())
                        ? "SI"
                        : "NO")
        );
    }

}
