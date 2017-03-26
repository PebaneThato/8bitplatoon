/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "cic")
public class Cic implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cicid")
    private Long cicId;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cictype")
    private String cictype;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "subject")
    private String subject;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "body")
    private String body;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sourcesystem")
    private String sourcesystem;

    @Basic(optional = false)
    @NotNull
    @Column(name = "cictimestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cictimestamp;

    @JoinColumn(name = "entityid")
    @ManyToOne(fetch = FetchType.EAGER)
    private com.eightbitplatoon.entity.Entity cicEntity;

    public Cic() {
    }

    public Cic(Long cicId) {
        this.cicId = cicId;
    }

    public Cic(Long cicId, String cictype, String subject, String body, String sourcesystem, Date cictimestamp) {
        this.cicId = cicId;
        this.cictype = cictype;
        this.subject = subject;
        this.body = body;
        this.sourcesystem = sourcesystem;
        this.cictimestamp = cictimestamp;
    }

    public Long getCicId() {
        return cicId;
    }

    public void setCicId(Long cicId) {
        this.cicId = cicId;
    }

    public String getCictype() {
        return cictype;
    }

    public void setCictype(String cictype) {
        this.cictype = cictype;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourcesystem() {
        return sourcesystem;
    }

    public void setSourcesystem(String sourcesystem) {
        this.sourcesystem = sourcesystem;
    }

    public Date getCictimestamp() {
        return cictimestamp;
    }

    public void setCictimestamp(Date cictimestamp) {
        this.cictimestamp = cictimestamp;
    }

    public com.eightbitplatoon.entity.Entity getEntityid() {
        return cicEntity;
    }

    public void setEntityid(com.eightbitplatoon.entity.Entity cicEntity) {
        this.cicEntity = cicEntity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cicId != null ? cicId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cic)) {
            return false;
        }
        Cic other = (Cic) object;
        if ((this.cicId == null && other.cicId != null) || (this.cicId != null && !this.cicId.equals(other.cicId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cic[ " + cicId + " " + cictype + " " + subject + " " + body + " " + sourcesystem + " " + cictimestamp + "]";
    }

}
