package hello.servlet.basic.response;

import org.springframework.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //[status-line]
        response.setStatus(HttpServletResponse.SC_OK);

        //[response-headers]
        response.setHeader("Content-Type","text/plain;charset=utf-8");
        // 캐시 무효화 코드
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        // 임의의 헤더를 만들 수 있음
        response.setHeader("my-header","hello");

        // [Header 편의 메서드]
//        content(response);
//        cookie(response);
        redirect(response);

        PrintWriter writer = response.getWriter();
        writer.println("하이요");
    }

    private void redirect(HttpServletResponse response) throws IOException {

        // 302code -> 리다이렉트가 된다
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Location", "/basic/hello-form.html");
        // 이렇게 코드를 수정할 수 있다.
        response.sendRedirect("/basic/hello-form.html");

    }

    private void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie", "good");
        // 이 쿠키는 600초 동안 유효하다
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }
}
