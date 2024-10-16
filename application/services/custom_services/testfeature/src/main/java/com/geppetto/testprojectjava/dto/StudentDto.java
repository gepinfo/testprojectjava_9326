package com.geppetto.testprojectjava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String _id;
    
    private String name;
    
    private Number age;
    
    }
