/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import lombok.Data;

/**
 *
 * @author ulised
 */
@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
