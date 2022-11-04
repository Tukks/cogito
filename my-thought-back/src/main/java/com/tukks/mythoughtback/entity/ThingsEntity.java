package com.tukks.mythoughtback.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.tukks.mythoughtback.dto.ThingType;
import com.tukks.mythoughtback.entity.superclass.BaseTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "THINGS",
	discriminatorType = DiscriminatorType.STRING)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ThingsEntity extends BaseTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private ThingType thingType;

	private String title;

	private String comment;

}