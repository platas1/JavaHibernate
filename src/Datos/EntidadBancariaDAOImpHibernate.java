package Datos;

import Negocio.EntidadBancaria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

 public class EntidadBancariaDAOImpHibernate extends GenericDAOImpHibernate<EntidadBancaria,Integer> implements EntidadBancariaDAO {
/*
     
         public List<EntidadBancaria> findByCodigo(String codigo) {

        Session session = sessionFactory.getCurrentSession();

        //List<T> list = new ArrayList();

        Query query = session.createQuery("SELECT * FROM entidadbancaria WHERE codigo=?");
        query.setString(0, codigo);
        List list = query.list();
        //session.close();

        return list;
    }

    public List<EntidadBancaria> findByNombre(String nombreBusqueda) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT * FROM entidadbancaria WHERE nombre LIKE ?");
        query.setString(0, "%" + nombreBusqueda + "%");
        List list = query.list();
        //session.close();

        return list;
    }
     
     */
 }


