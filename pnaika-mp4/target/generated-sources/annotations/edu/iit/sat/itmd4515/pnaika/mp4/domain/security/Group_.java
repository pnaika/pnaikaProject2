package edu.iit.sat.itmd4515.pnaika.mp4.domain.security;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Group.class)
public class Group_ { 

    public static volatile SingularAttribute<Group, String> groupName;
    public static volatile SingularAttribute<Group, String> groupDesc;
    public static volatile ListAttribute<Group, User> users;

}