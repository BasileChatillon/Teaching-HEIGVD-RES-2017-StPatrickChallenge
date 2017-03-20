
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
