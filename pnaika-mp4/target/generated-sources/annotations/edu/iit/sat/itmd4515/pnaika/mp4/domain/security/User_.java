package edu.iit.sat.itmd4515.pnaika.mp4.domain.security;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.Group;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Group> groups;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> enabled;

}