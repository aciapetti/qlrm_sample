package it.deepcyber.sample.data.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Getter
@Setter
@Table(name = "investigations")
@ToString(includeFieldNames = true)
@GenericGenerator(name = "uuid2", strategy = "uuid2")
public class Investigation implements Serializable {
	
	private static final long serialVersionUID = 8984145977370105303L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
	@Column(name = "id", nullable = false)
	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;

	@Column(name = "name", nullable = false, unique = true, columnDefinition = "bytea")
	private String name;
	
	@Column(name = "description", nullable = true, columnDefinition = "bytea")
	private String description;
	
	@Column(name = "enable", nullable = false)
	private Boolean enable;
	
}

