package mainPackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Movimientos {

    public void agregarProdcuto(Producto producto) {
        Acceso conexion = new Acceso();

        try {
            Statement consulta = conexion.getConexion().createStatement();
            String sql = "INSERT INTO productos VALUES('" + producto.idProducto + "', '" + producto.Nombre+ "', '" +producto.Marca+ "', '" + producto.Cantidad+  "')";
            consulta.executeUpdate(sql);
            System.out.println("Producto Registrado");
            consulta.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println("Error en el proceso de agregar " + ex.getMessage());
        }

    }

    public ArrayList<Producto> obtenerProducto() {
        ArrayList<Producto> arrProducto = new ArrayList<>();
        Acceso conexion = new Acceso();
        String sql = "SELECT * FROM productos";

        PreparedStatement st;
        try {
            st = conexion.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto(rs.getInt("idproducto"), rs.getString("Nombre"), rs.getString("Marca"), rs.getString("Cantidad"));
                arrProducto.add(prod);
            }
            rs.close();
            st.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el producto " + ex.getMessage());
        }

        return arrProducto;
    }
}
