
package com.example.demo.models;

import lombok.Data;

/**
 *
 * @author NB-FLABARCA
 */

@Data
public class UsuarioModel {
    
    
    private Long id;
    private String nombre; 
    private String email;
    private Integer prioridad;
}


