package Dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iproductoable;
import model.TblProductocl3;

public class ClassCrudProducto  implements Iproductoable {

	public void RegistrarProducto(TblProductocl3 tblproducto) {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("LPII_CL3_TABACOVASQUEZJOSE");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// registramos
		em.persist(tblproducto);
		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}

	public void ActualizarProducto(TblProductocl3 tblproducto) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProducto(TblProductocl3 tblproducto) {
		// TODO Auto-generated method stub
		
	}

	public List<TblProductocl3> ListarProducto() {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("LPII_CL3_TABACOVASQUEZJOSE");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// LISTAR
		List<TblProductocl3> listar = em.createQuery("select a from TblProductocl3 a ", TblProductocl3.class).getResultList();

		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		return listar;
	}

	public TblProductocl3 BuscarProducto(TblProductocl3 tblproducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
