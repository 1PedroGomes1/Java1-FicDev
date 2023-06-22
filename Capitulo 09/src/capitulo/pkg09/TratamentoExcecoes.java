import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainTest {
    @Test
    public void testMain() {
        // Arrange
        // Criar um arquivo de teste com algum conteúdo
        String testFileName = "test.txt";
        String testContent = "Conteúdo de teste";
        createTestFile(testFileName, testContent);

        // Act
        Main.main(new String[]{});

        // Assert
        // Nenhuma exceção foi lançada
    }

    @Test
    public void testClose() {
        // Arrange
        BufferedReader br = null;

        // Act
        Exception exception = Assertions.assertThrows(IOException.class, () -> {
            Main.close(br);
        });

        // Assert
        Assertions.assertNotNull(exception);
        Assertions.assertEquals(IOException.class, exception.getClass());
    }

    // Método auxiliar para criar um arquivo de teste com um determinado conteúdo
    private void createTestFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
