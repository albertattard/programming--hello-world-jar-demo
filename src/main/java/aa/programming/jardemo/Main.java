package aa.programming.jardemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(final String[] args) {
        try (BufferedReader reader = getReader()) {
            for (String line = null; (line = reader.readLine()) != null; ) {
                System.out.println(line);
            }
        } catch (final IOException e) {
            System.out.println("Failed to read the banner!!");
        }
    }

    private static BufferedReader getReader() throws FileNotFoundException {
        final InputStream inputStream = Main.class.getResourceAsStream("/banner.txt");
        if (inputStream == null) {
            throw new FileNotFoundException("The banner.txt file was not found in the classpath");
        }

        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
