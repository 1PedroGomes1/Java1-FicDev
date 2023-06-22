package com.mycompany.capitulo13maven2;

import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlunoDao {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Aluno aluno = new Aluno();
            aluno.setNome("Fernanda");
            Transaction transaction = session.beginTransaction();
            session.persist(aluno);
            transaction.commit();
            TypedQuery< Aluno> query = session.createQuery("FROM Aluno", Aluno.class);
            List<Aluno> alunos;
            alunos = query.getResultList();
            for (Aluno alunoI : alunos) {
                System.out.println(alunoI.getNome());
            }
        }
    }
}
