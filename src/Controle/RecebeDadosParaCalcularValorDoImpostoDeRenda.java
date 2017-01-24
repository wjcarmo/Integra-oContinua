package Controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculaValorDoImpostoDeRenda
 */
@WebServlet("/calculaValorDoImpostoDeRenda")
public class RecebeDadosParaCalcularValorDoImpostoDeRenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Nome=request.getParameter("idNome");
		String Salario=request.getParameter("idSalario");
		String Deducao=request.getParameter("idDeducao");
		
		System.out.println("Nome do Funcionario "+Nome);
		System.out.println("Dedução do Funcionario "+Deducao);
		System.out.println("Salario do Funcionario "+Salario);
		
		request.getSession().setAttribute("idNome", Nome);
		request.getSession().setAttribute("idTelefone", Deducao);
		request.getSession().setAttribute("idSalario", Salario);
		
		response.sendRedirect("Form/FormPainelDeControle.html");
		
		
	}

}
