import java.util.logging.Logger;

class Teste {
    private static final Logger LOGGER = Logger.getLogger(Teste.class.getName());
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        LOGGER.info("Olá mundo by LOGGER!");
    }
}