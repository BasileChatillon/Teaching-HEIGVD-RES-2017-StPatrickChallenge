/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Basile Chatillon
 */
public class NoaDecorator implements IStreamDecoratorController{
    public Reader decorateReader(Reader inputReader){
        return inputReader;
    }
    
    public Writer decorateWriter(Writer outputWriter){
        return new AFilter(outputWriter);
    }
}
