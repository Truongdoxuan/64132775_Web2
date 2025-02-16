package truongdx.exercise1_4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BMI() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Tính Chỉ Số BMI</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; color: #333; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; padding: 0; }");
        out.println(".container { background: #fff; padding: 20px 40px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); max-width: 400px; width: 100%; text-align: center; }");
        out.println("h1 { color: #007bff; margin-bottom: 20px; }");
        out.println("input[type='text'], input[type='submit'] { padding: 10px; margin: 10px 0; width: 100%; border: 1px solid #ccc; border-radius: 5px; }");
        out.println("input[type='submit'] { background-color: #007bff; color: #fff; border: none; cursor: pointer; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<h1>Tính Chỉ Số BMI</h1>");
        out.println("<form method='POST' action='/BMI/BMI'>");
        out.println("<label for='height'>Chiều cao (cm):</label>");
        out.println("<input type='text' id='height' name='height'><br>");
        out.println("<label for='weight'>Cân nặng (kg):</label>");
        out.println("<input type='text' id='weight' name='weight'><br>");
        out.println("<input type='submit' value='Tính BMI'>");
        out.println("</form>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");

        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);

        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Kết Quả BMI</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; color: #333; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; padding: 0; }");
        out.println(".container { background: #fff; padding: 20px 40px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); max-width: 400px; width: 100%; text-align: center; }");
        out.println("h1 { color: #007bff; margin-bottom: 20px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<h1>Kết Quả BMI</h1>");
        out.println("<p><strong>Chiều cao:</strong> " + height + " cm</p>");
        out.println("<p><strong>Cân nặng:</strong> " + weight + " kg</p>");
        out.println("<p><strong>BMI của bạn là:</strong> " + String.format("%.2f", bmi) + "</p>");

        String category;
        //nhận xét chỉ số bmi
        if (bmi < 18.5) {
            category = "Gầy";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Bình thường";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Thừa cân";
        } else {
            category = "Béo phì";
        }
        out.println("<p><strong>Phân loại:</strong> " + category + "</p>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
