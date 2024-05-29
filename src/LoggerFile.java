import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile  implements Logger {

    private final String filename;
    private final DateTimeFormatter formato;

    public LoggerFile(String filename) {
        this.filename = filename;
        this.formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void log(Level level, String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        String dateTimeFormatada = dateTime.format(formato);
        String print = String.format("[%s][%s]%s\n", dateTimeFormatada, level.toString(), message);
        try {
            Files.write(Paths.get(filename),
                    print.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}


