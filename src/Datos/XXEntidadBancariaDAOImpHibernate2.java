/* ANTIGUO IMP HIBERNATE, AHORA ESTE CODIGO ESTA EN GENERIC DAO HIBERNATE 
 * 
 * 
 * package Datos;

import Negocio.EntidadBancaria;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/*import org.hibernate.cfg.Configuration;
 import org.hibernate.service.ServiceRegistry;
 import org.hibernate.service.ServiceRegistryBuilder;
////////////////////////BORRAR TODOOOOOOOOOOOOOOOO ///////////////////////
public class EntidadBancariaDAOImpHibernate2 implements EntidadBancariaDAO {

    // """ Inicializamos Hibernate"""
    private SessionFactory sessionFactory;

    public EntidadBancariaDAOImpHibernate2(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public EntidadBancaria read(Integer idEntidadBancaria) {
        Session session = sessionFactory.openSession();

        EntidadBancaria entidadBancaria;

        try {
            session.beginTransaction();
            entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, idEntidadBancaria); //selecciono idEntidadBancaria que quiero dentro del objeto
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close(); // Las sesiones no se cierran aqui, se cierran fuera !! Aqui solo con try/catch
            }
        }

        return entidadBancaria;
    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            session.save(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }

    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            session.update(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }

    }

    @Override
    public void delete(Integer idEntidadBancaria) {

        EntidadBancaria entidadBancaria;
        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, idEntidadBancaria);
            session.delete(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }
    }

    @Override
    public List<EntidadBancaria> findAll() {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT entidadbancaria FROM EntidadBancaria entidadbancaria");
        List list = query.list();
        session.close();
  
        return list;
    }
    

    @Override
    public List<EntidadBancaria> findByCodigo(String codigo) {

        Session session = sessionFactory.openSession();

         //List<EntidadBancaria> list = new ArrayList();
        
        Query query = session.createQuery("SELECT entidadbancaria FROM EntidadBancaria entidadbancaria WHERE idEntidad=?");
        query.setString(0, codigo);
        List list = query.list();
        session.close();

        return list;
    }

    @Override
    public List<EntidadBancaria> findByNombre(String nombreBusqueda) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT entidadbancaria FROM EntidadBancaria entidadbancaria WHERE nombre LIKE ?");
        query.setString(0, "%" + nombreBusqueda + "%");
        List list = query.list();
        session.close();

        return list;
    }
   
}
*/
