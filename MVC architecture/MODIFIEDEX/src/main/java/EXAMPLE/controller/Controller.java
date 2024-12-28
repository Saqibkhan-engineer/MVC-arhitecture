/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMPLE.controller;

import EXAMPLE.economics.Economics;
import EXAMPLE.view.View;

/**
 *
 * @author ABUBAKAR
 */
// Controller Class: Manages the interaction between Model and View
public class Controller {
    private Economics model;
    private View view;

    // Constructor
    public Controller(Economics model, View view) {
        this.model = model;
        this.view = view;
    }

    // Set supply in the model
    public void setSupply(int supply) {
        model.setSupply(supply);
    }

    // Set demand in the model
    public void setDemand(int demand) {
        model.setDemand(demand);
    }

    // Update the view to display the data
    public void updateView() {
        view.displayData(model.getSupply(), model.getDemand());
    }
}
