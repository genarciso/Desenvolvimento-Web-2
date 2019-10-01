package br.ufrn.imd.reserva.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.reserva.modelo.Reserva;

@Stateless
public class ReservaRepositorio {
	
	@PersistenceContext
	private EntityManager em;
	
	public Reserva adicionar(Reserva Reserva) {
		 if(Reserva.getId() == 0) {
			 em.persist(Reserva);
		 } else {
			 em.merge(Reserva);
		 }
		 return Reserva;
	}
	
	public void remover(Reserva Reserva) {
		Reserva = em.find(Reserva.class, Reserva.getId());
		em.remove(Reserva);
	}
	
	@SuppressWarnings("unchecked")
	public List<Reserva> listarReservas() {
		try {
			return (List<Reserva>) em.createQuery("select r from Reserva r").getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Reserva> listarReservasPorUsuario(String login) {
		try {
			Query q = em.createQuery("select r from Reserva r "
					+ "where r.usuario.login = :login");
			q.setParameter("login", login);
			return (List<Reserva>) q.getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public Reserva buscarReserva(String codigo) {
		try {
			String consulta = "select r from Reserva r where r.codigo = :codigo";
			Query query = em.createQuery(consulta);
			query.setParameter("codigo", codigo);
			return (Reserva) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}
	
}
