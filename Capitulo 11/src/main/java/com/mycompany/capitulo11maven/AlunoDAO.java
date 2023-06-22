import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDAO {
    public void atualizarCoeficiente(int id, double novoCoeficiente) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Aluno aluno = session.get(Aluno.class, id);
            if (aluno != null) {
                aluno.setCoeficiente(novoCoeficiente);
                session.update(aluno);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
