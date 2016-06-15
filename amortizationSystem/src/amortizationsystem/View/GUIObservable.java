/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.View;

import amortizationsystem.Controller.GUIController;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public interface GUIObservable {
    public ArrayList<String> getValues();
    public void registerObserver(GUIController newController);
    public void notifyObservers();
}
