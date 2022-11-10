package com.tukks.cogito.entity;

import java.util.List;

import javax.persistence.*;

import com.tukks.cogito.dto.ThingType;
import com.tukks.cogito.entity.superclass.BaseTable;
import com.tukks.cogito.entity.tag.Tag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "THINGS",
	discriminatorType = DiscriminatorType.STRING)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Jacksonized
@EqualsAndHashCode(callSuper = true)
public class ThingsEntity extends BaseTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private ThingType thingType;

	protected String title;

	private String comment;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Tag> tags;

}