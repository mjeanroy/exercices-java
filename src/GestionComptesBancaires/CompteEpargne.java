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
public class CompteEpargne extends AbstractCompte{

    public CompteEpargne(int numero, String libelle, BigDecimal solde) {
        super(numero, libelle, solde);
    }
    
}
