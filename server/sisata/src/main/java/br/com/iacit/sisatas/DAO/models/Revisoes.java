package br.com.iacit.sisatas.DAO.models;

import java.io.Serializable;
import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Revisoes")
public class Revisoes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rev_id;
	@Column(nullable = false, length = 30)
	private String rev_assunto;
	@Column(nullable = false)
	private DateFormat rev_prazo;
	@Column(nullable = false)
	private DateFormat rev_data;

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_usu_id", referencedColumnName = "usu_id") // OK
	private Usuarios resposavelRevisoes;

	@ManyToOne(optional = true)
	@JoinColumn(name = "fk_ata_id", referencedColumnName = "ata_id") // OK
	private Atas contemRevisoes;
}
