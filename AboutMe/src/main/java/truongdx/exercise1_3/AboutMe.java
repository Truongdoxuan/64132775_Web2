package truongdx.exercise1_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public AboutMe() {
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
        out.println("<title>About Me</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; color: #333; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".container { background: #fff; padding: 20px 40px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); max-width: 800px; display: flex; align-items: center; }");
        out.println(".content { flex: 1; }");
        out.println(".profile-image {width: auto; height: 150px; object-fit: cover; }");
        out.println("h1 { color: #007bff; margin-bottom: 20px; }");
        out.println("p { font-size: 18px; line-height: 1.6; margin: 10px 0; }");
        out.println(".social-links { margin-top: 20px; }");
        out.println(".social-links a { margin-right: 15px; text-decoration: none; color: #007bff; display: flex; align-items: center; }");
        out.println(".social-links img { width: 24px; height: 24px; margin-right: 8px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<div class='content'>");
        out.println("<h1>Thông Tin Cá Nhân</h1>");
        out.println("<p><strong>Họ và tên:</strong> Đỗ Xuân Trường</p>");
        out.println("<p><strong>Mã sinh viên:</strong> 64132775</p>");
        out.println("<p><strong>Trường:</strong> Đại học Nha Trang</p>");
        out.println("<p><strong>Ngành/Khoa:</strong> Công nghệ thông tin</p>");
        out.println("<p><strong>Sở thích:</strong> Du lịch, trò chuyện với mọi người</p>");
        
        //social link
        out.println("<div class='social-links'>");
        out.println("<a href='https://www.facebook.com/people/Xuan-Truong/pfbid0mcbEwgxkSZMdgCA3qHMrLkAFQPHZ7B9QJwUNNgUYVARQJm3yjMC6qbHUFErChXj7l/' target='_blank'>");
        out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/5/51/Facebook_f_logo_%282019%29.svg' alt='Facebook Logo'>Facebook</a>");
        out.println("<br/><a href='https://github.com/Truongdoxuan' target='_blank'>");
        out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg' alt='GitHub Logo'>GitHub</a>");
        out.println("</div>");
        out.println("</div>");

        //image
        out.println("<img src='https://img.tripi.vn/cdn-cgi/image/width=900,height=900/https://gcs.tripi.vn/public-tripi/tripi-feed/img/474094aUF/anh-dep-doremon_033145831.png' class='profile-image'>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
