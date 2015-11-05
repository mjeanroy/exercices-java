/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionComptesBancaires;

import java.math.BigDecimal;

/**
 *
 * @author Massil
 */
public class OperationCompte {
    
    
    
    public void virement(AbstractCompte source , AbstractCompte destination , BigDecimal montant)throws ConflitDeCompteException, SoldeInsuffisantException
    {
        if(source.equals(destination))
            throw new ConflitDeCompteException("Les comptes sont similaires");
        if(source.getSolde().compareTo(montant)< 0)
        {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }
        source.setSolde(source.getSolde().subtract(montant));
        destination.setSolde(destination.getSolde().add(montant));
        
    }
}
