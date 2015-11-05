/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionComptesBancaires;

/**
 *
 * @author Massil
 */
public class SoldeInsuffisantException extends VirementException{

    public SoldeInsuffisantException(String message) {
        super(message);
    }
    
}
