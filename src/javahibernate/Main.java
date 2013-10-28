package javahibernate;

//import Datos.EntidadBancariaDAOImpHibernate2; ANTIGUO AHORA ESTA EN GENERIC DAO HIBERNATE
import Datos.EntidadBancariaDAO;
import Datos.EntidadBancariaDAOImpHibernate;
import Datos.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

    public static void main(String[] Args) {
        /*
         SessionFactory sessionFactory;

         Configuration configuration = new Configuration();
         configuration.configure();
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);

         Session session = sessionFactory.openSession();

         //Lectura de Datos            
         session.beginTransaction();
         EntidadBancaria entidadBancariaRead = (EntidadBancaria) session.get(EntidadBancaria.class, 1);
         session.getTransaction().commit();
         //sout


         //Insercion Datos
         EntidadBancaria entidadBancariaInsert = new EntidadBancaria(2, "3", "KutxaBank", "4444", TipoEntidadBancaria.Banco);
         EntidadBancaria entidadBancariaDelete = new EntidadBancaria(6, "3", "KutxaBank2", "4444", TipoEntidadBancaria.Banco);

         session.beginTransaction();
         session.save(entidadBancariaInsert);
         session.save(entidadBancariaDelete);
         session.getTransaction().commit();

         //Actualizacion datos       

         session.beginTransaction();
         EntidadBancaria entidadBancariaActualizar = (EntidadBancaria) session.get(EntidadBancaria.class, 1);
         entidadBancariaActualizar.setCif("131313");
         session.update(entidadBancariaActualizar);
         session.getTransaction().commit();


         // Borrar Datos
         session.beginTransaction();
         session.delete(entidadBancariaDelete);
         session.getTransaction().commit();

         session.close();
         */


//Prueba Metodos del DAO

        /*SessionFactory sessionFactory = null;

         Configuration configuration = new Configuration();
         configuration.configure();
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);

         Session session = sessionFactory.openSession();

         EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate2(sessionFactory);
         */
        //entidadBancariaDAO.delete(16);

        // EntidadBancaria entidadBancaria = new EntidadBancaria(16, "3", "KutxaBank", "4444", TipoEntidadBancaria.Banco);
        //entidadBancariaDAO.insert(entidadBancaria);

         HibernateUtil.buildSessionFactory();
        
         HibernateUtil.openSessionAndBindToThread();
         
        //Session session= HibernateUtil.getSessionFactory().getCurrentSession();
                
        EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate();
        
        entidadBancariaDAO.findAll();

//        entidadBancariaDAO.findByCodigo("16");

        HibernateUtil.closeSessionFactory();

    }
}