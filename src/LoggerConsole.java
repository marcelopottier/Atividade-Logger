import java.time.LocalDateTime;

public class LoggerConsole implements Logger {
    @Override
    public void log(Level level, String message) {
        String dateTime=LocalDateTime.now().toString();
        String color;

        if(level == Level.DEBUG){
            color="\u001B[32m";
        }
        else if(level == Level.WARNING){
            color="\u001B[33m";
        }
        else if(level == Level.ERROR){
            color="\u001B[31m";
        }
        else{
            color="\u001B[0m";
        }
        System.out.println(color+dateTime+"["+level+"]"+message+"\u001B[0m");
    }
}
