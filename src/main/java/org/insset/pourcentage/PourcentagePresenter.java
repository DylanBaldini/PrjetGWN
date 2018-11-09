/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.web.bindery.requestfactory.server.Logging;
import static java.lang.System.out;
import static org.apache.xalan.xsltc.compiler.util.Type.Int;
import org.insset.client.message.Messages;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.PourcentageService;
import org.insset.client.service.PourcentageServiceAsync;
import org.insset.shared.FieldVerifier;



/**
 *
 * @author talend
 */
public class PourcentagePresenter  extends Composite{
    
    
     @UiField
    public ResetButton boutonReset;
    @UiField
    public SubmitButton boutonCalcul;
    @UiField
    public TextBox pourcentage;
    @UiField
    public TextBox montantInit;
    @UiField
    public TextBox montantEconomiser;
    
     @UiField
    public Label affichage;
    
    @UiField
    public Label errorLabelPourcentage;
    
   
//    
//    /**
//     * The message displayed to the user when the server cannot be reached or
//     * returns an error.
//     */
//    private static final String SERVER_ERROR = "An error occurred while "
//            + "attempting to contact the server. Please check your network "
//            + "connection and try again.";
//
//    /**
//     * Create a remote service proxy to talk to the server-side Greeting
//     * service.
//     */
   private final PourcentageServiceAsync service = GWT.create(PourcentageService.class);
//
  private final Messages messages = GWT.create(Messages.class);
//
    interface AddUiBinder extends UiBinder<HTMLPanel, PourcentagePresenter> {
    }

    
    /**
     * Create UiBinder for the view
     */
    private static AddUiBinder ourUiBinder = GWT.create(AddUiBinder.class);
//
//    /**
//     * Constructeur
//     */
    public PourcentagePresenter() {
        //bind de la page
        initWidget(ourUiBinder.createAndBindUi(this));
               initHandler();
    }
    public static void main(String[] args){System.out.println("test");}
// /**
//     * Methode qui innitialise les handler pour les cliques sur les boutons
//     */
    protected void initHandler() {
        boutonReset.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                pourcentage.setText("");
                errorLabelPourcentage.setText("");
                montantInit.setText("");
                montantEconomiser.setText("");
                


            }
        });
        boutonCalcul.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
//               String resultatEcono =CalculEcono(montantInit , pourcentage);
                convertPourcentage();
            }

        });
    }
    
   private void convertPourcentage() {
       int numberInit = Integer.parseInt(montantInit.getText());
         int numberpourcentage = Integer.parseInt(pourcentage.getText());
       
       
        if (!FieldVerifier.isValidMontant(numberInit) && !FieldVerifier.isValidPourcentage(numberpourcentage)) {
            errorLabelPourcentage.addStyleName("serverResponseLabelError");
            errorLabelPourcentage.setText("Format incorect");
            return;
        }
        service.CalculEcono(numberInit,numberpourcentage, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(Integer result) {
               errorLabelPourcentage.setText(" ");
//                new DialogBoxInssetPresenter("Convertion Roman to arabe", valR.getText(), String.valueOf(result));
            }
        });
    }
   
}

