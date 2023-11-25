package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Dao.ClassCrudProducto;

import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 //Realizamos la respectiva instancia de las clases...
		String accion=request.getParameter("accion");
		//aplicamos una condicion
		if (accion !=null){
			
			switch (accion){
			case "registrar":
				request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request ,  response);
				break;
		
			}
			
		
			
		}else {
		
			TblProductocl3 tblproducto= new TblProductocl3();
			ClassCrudProducto crudproducto = new ClassCrudProducto();
		//Recuperamos el listado
		List<TblProductocl3> listado=crudproducto.ListarProducto();
		
		//enviamos a la vista
	    request.setAttribute("listado", listado);
	    //redireccionamos a vista
	    request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
		}//fin de else
	
	
	}//FIN DEL METODO DOGET

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				//en el metodo dopost del servlet....
				//recuperamos los valores del formulario que ingresa el usuario final...
						String nombre=request.getParameter("nombre");
						double precio=Double.parseDouble(request.getParameter("precio"));
						int stock=Integer.parseInt(request.getParameter("stock"));
						double preciocomp=Double.parseDouble(request.getParameter("preciocomp"));
						String estado=request.getParameter("estado");
						String descripcion=request.getParameter("descripcion");
						//instanciamos la respectivas clases..
						TblProductocl3 tblproducto=new TblProductocl3();
						ClassCrudProducto crud=new ClassCrudProducto();
						//asignamos los respectivos valores...
						tblproducto.setNombrecl3(nombre);
						tblproducto.setPrecioventacl3(precio);
						tblproducto.setStock(stock);
						tblproducto.setPreciocompcl3(preciocomp);
						//tblauto.setPrecio(precio);
						tblproducto.setEstadocl3(estado);
						tblproducto.setDescripcl3(descripcion);
						//invocamos al metodo registrar...
						crud.RegistrarProducto(tblproducto);	
						//recuperamos el listado de autos...
						List<TblProductocl3> listadoauto=crud.ListarProducto();
						//enviamos a la vista
						request.setAttribute("listado",listadoauto);
						//redireccionamos
						request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
						
			
			
			
			}//fin de metodo

}
