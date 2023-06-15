package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.movie.Controller.ZTaiKhoan;
import com.movie.beans.PhongChieu;
import com.movie.beans.TaiKhoan;

@WebServlet("/TaiKhoanServlet")
public class TaiKhoanServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ZTaiKhoan tk = new ZTaiKhoan();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		String url = "";
		String command=request.getParameter("command");
		try {
			switch(command) {
			case "delete":
				tk.deleteTaiKhoan((Integer.parseInt(id)));
				url = "/Views/TrangTaiKhoan.jsp";
				break;
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau = request.getParameter("matKhau");
		//String quyenHan = request.getParameter("quyenHan");
		String id = request.getParameter("id");
		String command=request.getParameter("command");
		String url = "";
		try {
			switch(command) {
			case "update":
				tk.UpdateTaiKhoan(new TaiKhoan((Integer.parseInt(id)),tenDangNhap, matKhau));
					url = "/Views/TrangTaiKhoan.jsp";
					break;
			
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

}
