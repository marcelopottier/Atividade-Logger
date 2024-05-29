
public class Main {

    public static void main(String[] args) {
    LoggerFactory loggerFactory = new LoggerFactory("arquivo.txt");

    LoggerFactory.Loggerconsole("Mensagem de DEBUG",Level.DEBUG);
    LoggerFactory.Loggerconsole("Mensagem de ERRO",Level.ERROR);
    LoggerFactory.Loggerconsole("Mensagem de AVISO",Level.WARNING);
    LoggerFactory.Loggerconsole("Mensagem NORMAL",Level.NORMAL);
    }
}
