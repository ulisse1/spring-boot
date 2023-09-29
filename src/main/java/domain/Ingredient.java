/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author ulised
 */

import lombok.Data;


@Data
public class Ingredient {
    
    private final String id;
    private final String name;
    private final Type type;
    
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
    }
    
    
}
