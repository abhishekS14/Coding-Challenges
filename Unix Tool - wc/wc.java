import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class wc {
    public static void main(String[] args) {

        String flag = args[0];
        final String fileName = args[1];
        final File file = new File(fileName);

        switch (flag) {
            case "-c" :
                getFileBytes(file);
                break;
            case "-l" :
                getFileLines(file);
                break;
            case "-w" :
                getFileWords(file);
                break;
            case "-m" :
                getFileCharacters(file);
                break;
            case "help" :
                getHelp();
                break;
            default:
                System.out.println("Invalid flag. Check help");

        }

    }

    private static void getHelp() {
    }

    private static void getFileCharacters(File file) {
    }

    private static void getFileWords(File file) {
    }

    private static void getFileLines(File file) {
    }

    private static void getFileBytes(File file) {
        System.out.println(file.length());
    }

}