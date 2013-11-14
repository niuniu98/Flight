package org.jboss.as.quickstarts.kitchensink.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, Long> id;
	public static volatile SingularAttribute<Item, String> flight_num;
	public static volatile SingularAttribute<Item, String> seat_num;
	public static volatile SingularAttribute<Item, String> seat_id;

}

