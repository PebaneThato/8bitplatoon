package com.eightbitplatoon.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class CicWeb{

    @XmlElement(namespace = "cic", required = true)
    private String cictype;
    
    @XmlElement(namespace = "cic", required = true)
    private String subject;
    
    @XmlElement(namespace = "cic", required = true)
    private String body;
    
    @XmlElement(namespace = "cic", required = true)
    private String sourcesystem;

    @XmlElement(namespace = "cic", required = true)
    private Date cictimestamp;
    
    private CicEntity cicEntity;

    public CicWeb() {
    }

    public CicWeb(String cictype, String subject, String body, String sourcesystem, Date cictimestamp) {
        this.cictype = cictype;
        this.subject = subject;
        this.body = body;
        this.sourcesystem = sourcesystem;
        this.cictimestamp = cictimestamp;
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

    public CicEntity getEntityid() {
        return cicEntity;
    }

    public void setEntityid(CicEntity cicEntity) {
        this.cicEntity = cicEntity;
    }

    @Override
    public String toString() {
        return "Cic[ cicid=" + cictype + " " + subject +" ]";
    }
    
}
