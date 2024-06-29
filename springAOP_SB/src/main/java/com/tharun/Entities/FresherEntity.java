package com.tharun.Entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="freshers")
public class FresherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fresher_seq_generator")
	@SequenceGenerator(name = "fresher_seq_generator",initialValue = 198823,allocationSize = 1)
	@Column(name="id")
	private Integer fresherId;
	@Column(name="name",nullable = false)
	private String fresherName;
	@Column(name="dateOfJoining")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Past
	@NotNull
	private Date fresherDoj;
	@Column(name="primrySkill")
	@NotEmpty
	private String fresherPrimarySkill;
	
}
