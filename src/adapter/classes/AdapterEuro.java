/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.classes;

import adapter.interfaces.IConversor;

/**
 *
 * @author pedro
 */
public class AdapterEuro implements IConversor {


    @Override
    public double ConverterQuantia(double quantia) {

        return Double.parseDouble(String.format("%.2f", quantia/6.3939));
    }
}