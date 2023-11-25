package Interfaces;

import java.util.List;

import model.TblProductocl3;;

public interface Iproductoable {
	
	public void RegistrarProducto(TblProductocl3 tblproducto);
	public void ActualizarProducto(TblProductocl3 tblproducto);
	public void EliminarProducto(TblProductocl3 tblproducto);
	public List<TblProductocl3> ListarProducto();
	public  TblProductocl3 BuscarProducto (TblProductocl3 tblproducto);


}
