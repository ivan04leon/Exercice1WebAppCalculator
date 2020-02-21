package org.generation.calculadora.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class calculadoraController
 */
@WebServlet(description="Servlet de calculadora, suma y resta", urlPatterns= {"/calculadoraController", "/suma"})
public class calculadoraController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	public calculadoraController() {
		super();
	}

}
