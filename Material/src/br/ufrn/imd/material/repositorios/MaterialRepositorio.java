package br.ufrn.imd.material.repositorios;

import java.util.List; 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.material.dominio.Material;

@Stateless
public class MaterialRepositorio {
	
	@PersistenceContext
	private EntityManager em;
	
	public Material adicionar(Material material) {
		 if(material.getId() == 0) {
			 em.persist(material);
		 } else {
			 em.merge(material);
		 }
		 return material;
	}
	
	public void remover(Material material) {
		material = em.find(Material.class, material.getId());
		em.remove(material);
	}
	
	@SuppressWarnings("unchecked")
	public List<Material> listarMateriais() {
		try {
			return (List<Material>) em.createQuery("select m from Material m").getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Material> listarMateriaisPorUsuario(String login) {
		try {
			Query q = em.createQuery("select m from Material m "
					+ "where m.usuarioCadastro.login = :login");
			q.setParameter("login", login);
			return (List<Material>) q.getResultList();
			
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public Material buscarMaterial(String codigo) {
		try {
			String consulta = "select m from Material m where m.codigo = :codigo";
			Query query = em.createQuery(consulta);
			query.setParameter("codigo", codigo);
			return (Material) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}
}	
