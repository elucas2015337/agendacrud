package org.elderlucas.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T17:17:48")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Integer> codigoPersona;
    public static volatile SingularAttribute<Persona, String> sexo;
    public static volatile SingularAttribute<Persona, String> nombres;

}