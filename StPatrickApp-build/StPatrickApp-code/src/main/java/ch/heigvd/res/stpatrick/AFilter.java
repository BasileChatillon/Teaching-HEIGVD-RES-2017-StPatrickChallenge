/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Basile Chatillon
 */
public class AFilter extends FilterWriter {
    public AFilter(Writer out) {
        super(out);
    }
    
    @Override
    public void write(int c) throws IOException {
        if(c != 'a' && c != 'A'){
            out.write(c);
        }   
    }
}
