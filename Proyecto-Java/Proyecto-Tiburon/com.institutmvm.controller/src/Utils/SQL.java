package Utils;
import cat.institutmvm.apps.entities.Pajaros;
import cat.institutmvm.apps.entities.Pez;
import cat.institutmvm.apps.entities.Tiburones;

import java.sql.*;

public class SQL {

    Connection connection = null;
    String server = "jdbc:mysql://localhost:3306/";
    String bbdd = "shirosb_db";
    String user = "root";
    String password = "";

    String tabla;
     String db = "shirosb_db";
     String login = "root";
     String pwd = "";
    String url = "jdbc:mysql://localhost:3306/" + db;
    private Connection conexion;

    public void insert(Pajaros a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Pajaros(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Parasitos) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, a.getEspecie());
                preparedstat.setString(2, a.getGenero());
                preparedstat.setString(3,a.getHabitat());
                preparedstat.setString(4,a.getTiempo_navegacion());
                preparedstat.setString(5,a.getHora_llegada());
                preparedstat.setString(6,a.getViento());
                preparedstat.setString(7,a.getNubosidad());
                preparedstat.setString(8,a.getDireccion_viento());
                preparedstat.setFloat(9,a.getSize());
                preparedstat.setFloat(10,a.getEmbarcaciones());
                preparedstat.setBoolean(11,a.getParasitos());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }

    public void insert2(Tiburones a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Tiburones(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Heridas,Profundidad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, a.getEspecie());
                preparedstat.setString(2, a.getGenero());
                preparedstat.setString(3,a.getHabitat());
                preparedstat.setString(4,a.getTiempo_navegacion());
                preparedstat.setString(5,a.getHora_llegada());
                preparedstat.setString(6,a.getViento());
                preparedstat.setString(7,a.getNubosidad());
                preparedstat.setString(8,a.getDireccion_viento());
                preparedstat.setFloat(9,a.getSize());
                preparedstat.setFloat(10,a.getEmbarcaciones());
                preparedstat.setString(11,a.getHeridas());
                preparedstat.setString(12,a.getProfundidad());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }

    public void insert3(Pez a) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Peces(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,N_Anzuelos,Profundidad,T_Anzuelo,P_Anzuelos) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, a.getEspecie());
                preparedstat.setString(2, a.getGenero());
                preparedstat.setString(3,a.getHabitat());
                preparedstat.setString(4,a.getTiempo_navegacion());
                preparedstat.setString(5,a.getHora_llegada());
                preparedstat.setString(6,a.getViento());
                preparedstat.setString(7,a.getNubosidad());
                preparedstat.setString(8,a.getDireccion_viento());
                preparedstat.setFloat(9,a.getSize());
                preparedstat.setFloat(10,a.getEmbarcaciones());
                preparedstat.setInt(11,a.getN_anzuelos());
                preparedstat.setString(12,a.getProfundidad());
                preparedstat.setString(13,a.getT_anzuelo());
                preparedstat.setBoolean(14,a.getP_anzuelos());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }

}
