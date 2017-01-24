package Controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculaEApresentaDadosCalculadosDoImpostoDeRenda
 */
@WebServlet("/CalculaEApresentaDadosCalculadosDoImpostoDeRenda")
public class CalculaEApresentaDadosCalculadosDoImpostoDeRenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Nome=request.getParameter("idNome");
		String Salario=request.getParameter("idSalario");
		String Deducao=request.getParameter("idDeducao");
		String Imposto=request.getParameter("idImposto");
		
		System.out.println("Nome do Funcionario "+Nome);
		System.out.println("Dedução do Funcionario "+Deducao);
		System.out.println("Salario do Funcionario "+Salario);
		System.out.println("Imposto Calculado do Funcionario "+Imposto);
		
		request.getSession().setAttribute("idNome", Nome);
		request.getSession().setAttribute("idSalario", Salario);
		request.getSession().setAttribute("idDeducao", Deducao);
		request.getSession().setAttribute("idImposto", Imposto);
		
		response.sendRedirect("jsp/ApresentaDadosCalculados.jsp");
		
	}

}
