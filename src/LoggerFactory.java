
public class LoggerFactory {
    private static LoggerConsole Loggerconsole;
    private static LoggerFile LoggerFile;

    public LoggerFactory (String FileName){
        this.Loggerconsole = new LoggerConsole();
        this.LoggerFile = new LoggerFile(FileName);
    }

    public static void Loggerconsole(String message, Level level){
        Loggerconsole.log(level,message);
    }
    public static void LoggerFile(String message, Level level){
        LoggerFile.log(level,message);
    }
}
