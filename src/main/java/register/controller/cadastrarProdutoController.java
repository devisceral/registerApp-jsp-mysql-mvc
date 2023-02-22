package register.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class cadastrarProdutoController
 */
public class cadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarProdutoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String descricao = request.getParameter("descricao");
		int quantidade;
		double preco;
		
		if(descricao != null && !descricao.isEmpty()&& request.getParameter("quantidade") != null
			&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
			&& !request.getParameter("preco").isEmpty()){
			
			quantidade = Integer.parseInt(request.getParameter("quantidade"));
			
			preco = Double.parseDouble(request.getParameter("preco"));
			
			System.out.println(descricao);
			System.out.println(quantidade);
			System.out.println(preco);
			boolean online = false;
			
			if(request.getParameter("online") != null && request.getParameter("online").equals("on"))
				online = true;
			System.out.println(online);
	
		}
		
		
		
//		String nome = request.getParameter("descricao");
//		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
//		double preco = Double.parseDouble(request.getParameter("preco"));
//		boolean online = false;
//		
//		if(request.getParameter("online") != null && request.getParameter("online").equals("on"))
//			online = true;
//		
//		System.out.println(nome);
//		System.out.println(quantidade);
//		System.out.println(preco);
//		System.out.println(online);
	}

}
