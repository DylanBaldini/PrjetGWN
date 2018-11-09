/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.lang.reflect.Array;
import org.insset.client.service.PourcentageService;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author talend
 */
@SuppressWarnings("serial")
public class PourcentageServicelmpl extends RemoteServiceServlet implements PourcentageService {
    
    @Override
    public Double CalculEcono( Integer montantInit,Integer pourcentage )throws IllegalArgumentException{
  if (FieldVerifier.isValidMontant(montantInit) && FieldVerifier.isValidPourcentage(pourcentage)){
            double pourcentageNumber=(double)pourcentage/100;
            double numberEcono =montantInit * pourcentageNumber;
            
            double prixFinal =montantInit-numberEcono;
            
            double resultatFinal = prixFinal;
            return resultatFinal;
        
    }else {
         throw new IllegalArgumentException("test");
  }
    }
    
}
