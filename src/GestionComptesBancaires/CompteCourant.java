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
public class CompteCourant extends AbstractCompte{

    public CompteCourant(int numero, String libelle, BigDecimal solde) {
        super(numero, libelle, solde);
    }
    
}
