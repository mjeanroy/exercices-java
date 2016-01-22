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
public class AbstractCompte implements Compte{

    private int numero;
    private String libelle;
    private BigDecimal solde;

    public AbstractCompte(int numero, String libelle, BigDecimal solde) {
        this.numero = numero;
        this.libelle = libelle;
        this.solde = solde;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractCompte other = (AbstractCompte) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public BigDecimal getSolde() {
        return solde;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }
    
    @Override
    public String toString()
    {
        String rs = "[Numero: " + numero + " ; Libelle: " + libelle + " ; Solde: " + solde +"]";
        return rs;
    }
}
