package br.ufrn.imd.reserva.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.reserva.modelo.Reserva;
import br.ufrn.imd.reserva.modelo.Sala;

@Stateless
public class SalaRepositorio {
	
	@PersistenceContext
	private EntityManager em;
	
	public Sala adicionar(Sala Sala) {
		 if(Sala.getId() == 0) {
			 em.persist(Sala);
		 } else {
			 em.merge(Sala);
		 }
		 return Sala;
	}
	
	public void remover(Sala Sala) {
		Sala = em.find(Sala.class, Sala.getId());
		em.remove(Sala);
	}
	
	@SuppressWarnings("unchecked")
	public List<Sala> listarSalas() {
		try {
			return (List<Sala>) em.createQuery("select s from Sala s").getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Sala> listarSalasPorCodigo(String codigo) {
		try {
			Query q = em.createQuery("select s from Sala s "
					+ "where s.codigo = :codigo");
			q.setParameter("codigo", codigo);
			return (List<Sala>) q.getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	
	}
}
