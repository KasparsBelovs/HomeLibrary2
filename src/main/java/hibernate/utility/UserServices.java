package hibernate.utility;

import hibernate.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserServices {

    public UserServices() {

    }

    public User getUserById(int id) {
        Session session = DBConfig.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    public void updateUser(int id) {
        Transaction transaction = null;
        try {
            Session session = DBConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            User user = getUserById(id);
            user.setFirstName("from text field");
            user.setLastName("from text field");
            user.setPhone("from text field");
            user.setEmail("from text field");
            user.setAddress("from text field");
            session.update(user);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User createUser() {
        User user = new User();
        Transaction transaction = null;
        try {
            Session session = DBConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    public List<User> getAllUsers(){
        List<User> allUsers;
        Session session = DBConfig.getSessionFactory().openSession();
        allUsers = session.createQuery("from User", User.class).getResultList();
        for (int i = 0; i < allUsers.size(); i++){
            allUsers.get(i).setNrInList(i+1);
        }
        session.close();
        return allUsers;
    }

    public void deleteUser(int id){
        Transaction transaction = null;
        try{
            Session session = DBConfig.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            User user = getUserById(id);
            session.delete(user);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
