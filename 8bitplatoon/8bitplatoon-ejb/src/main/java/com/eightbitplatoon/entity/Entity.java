/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pc
 */
@javax.persistence.Entity
@Table(name = "entity")
public class Entity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "entityid")
    private Long entityId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "entityname")
    private String entityName;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "emailaddress")
    private String emailAddress;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cicEntity" ,fetch = FetchType.LAZY)
    private Set<Cic> comunications;

    public Entity() {
    }

    public Entity(Long entityId) {
        this.entityId = entityId;
    }

    public Entity(Long entityId, String entityName, String emailAddress) {
        this.entityId = entityId;
        this.entityName = entityName;
        this.emailAddress = emailAddress;
    }

    public Long getEntityid() {
        return entityId;
    }

    public void setEntityid(Long entityid) {
        this.entityId = entityid;
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
    public Set<Cic> getCicCollection() {
        return comunications;
    }

    public void setCicCollection(Set<Cic> comunications) {
        this.comunications = comunications;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityId != null ? entityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity)) {
            return false;
        }
        Entity other = (Entity) object;
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eightbitplatoon.entity.Entity[ entityid=" + entityId + " ]";
    }
    
}
