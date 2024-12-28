/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMPLE;

import EXAMPLE.controller.Controller;
import EXAMPLE.economics.Economics;
import EXAMPLE.view.View;

/**
 *
 * @author ABUBAKAR
 */
public class maintest{
    public static void main(String[] args) {
        // Instantiate Model, View, and Controller
        Economics model = new Economics();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Set economic data using the controller
        controller.setSupply(1000);  // Setting supply
        controller.setDemand(800);  // Setting demand

        // Update the view to display the data
        controller.updateView();
    }
}
