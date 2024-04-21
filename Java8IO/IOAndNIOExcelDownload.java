package Java8IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IOAndNIOExcelDownload extends HttpServlet {
    //Downloading Excel Using Java 8 NIO Package
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response headers
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=example.xlsx");

        // Get file path (replace with your actual file path)
        String filePath = "/path/to/your/example.xlsx";
        Path excelPath = Paths.get(filePath);

        try {
            // Copy file data to response output stream using Files.copy()
            Files.copy(excelPath, response.getOutputStream());
        } catch (IOException e) {
            // Handle exception
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}

