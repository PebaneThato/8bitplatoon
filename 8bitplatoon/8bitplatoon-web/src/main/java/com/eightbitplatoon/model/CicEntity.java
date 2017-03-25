package com.eightbitplatoon.model;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class CicEntity{

    @XmlElement(namespace = "cic", required = true)
    private String entityName;
    
    @XmlElement(namespace = "cic", required = true)
    private String emailAddress;
    
    @XmlElement(namespace = "cic", required = true)
    private Set<CicWeb> comunications;

    public CicEntity() {
    }

    public CicEntity(String entityName, String emailAddress) {
        this.entityName = entityName;
        this.emailAddress = emailAddress;
    }

    public String getEntityname() {
        return entityName;
    }

    public void setEntityname(String entityname) {
        this.entityName = entityname;
    }

    public String getEmailaddress() {
        return emailAddress;
    }

    public void setEmailaddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @XmlTransient
    public Set<CicWeb> getCicCollection() {
        return comunications;
    }

    public void setCicCollection(Set<CicWeb> comunications) {
        this.comunications = comunications;
    }

    @Override
    public String toString() {
        return "Entity[ entityid=" + entityName + " " + emailAddress +" ]";
    }
    
}
