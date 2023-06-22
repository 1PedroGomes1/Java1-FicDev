
package capitulo.pkg09;

/**
* Classe para teste de biblioteca e linhas de códigos
* @author Pedro Gomes
* @version 1
* @since Release Java 14

*/


import java.util.logging.Logger;

public class TesteLog {
    public static void main(String[] args) {
        
        // Create a Logger
        Logger logger = Logger.getLogger(TesteLog.class.getName());
        
        // Call info method
        logger.info("This is message 1");
        logger.info("This is message 2");
        logger.info("This is message 3");
        logger.info("This is message 4");
    }
}