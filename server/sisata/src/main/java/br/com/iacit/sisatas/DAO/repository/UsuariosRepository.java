package br.com.iacit.sisatas.DAO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iacit.sisatas.DAO.models.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String> {

}
