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
public interface Compte {
    public BigDecimal getSolde();
    public void setSolde(BigDecimal solde);
}
