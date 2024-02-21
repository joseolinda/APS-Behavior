package dp.cor;

public class Client {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChainCreator.getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "01");
        loggerChain.logMessage(Logger.DEBUG, "02");
        loggerChain.logMessage(Logger.ERROR, "03");
    }    
}
