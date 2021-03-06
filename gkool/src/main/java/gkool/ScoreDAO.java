package gkool;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ScoreDAO {
	   // Injected database connection:
    @PersistenceContext 
    private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(ScoreSheet scoreSheet) {
        em.persist(scoreSheet);
    }
 
    // Retrieves all the guests:
    public List<ScoreSheet> getAllScores() {
        TypedQuery<ScoreSheet> query = em.createQuery(
            "SELECT g FROM Guest g ORDER BY g.id", ScoreSheet.class);
        return query.getResultList();
    }

}
