/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionComptesBancaires;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Massil
 */
public class MainSimulationBanque {
    public static void main(String[] args)
    {
        Client massil = new Client("KADI", "Massil");
        System.out.println(massil);
        CompteCourant courant = new CompteCourant(11111 , "Compte courant", new BigDecimal(1000));
        CompteEpargne epargne = new CompteEpargne(131642, "Comtpe epargne", new BigDecimal(200));
        massil.addCompte(courant);
        massil.addCompte(epargne);
        massil.afficherListeCompte();
        
        OperationCompte op = new OperationCompte();
        try {
            op.virement(courant, epargne, new BigDecimal(1000));
        } catch (VirementException ex) {
            Logger.getLogger(MainSimulationBanque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        massil.afficherListeCompte();
    }
    
}
