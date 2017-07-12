/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Deepa
 */
@Entity
@Table(name = "events", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Events_1.findAll", query = "SELECT e FROM Events_1 e")
    , @NamedQuery(name = "Events_1.findByEventname", query = "SELECT e FROM Events_1 e WHERE e.eventname = :eventname")
    , @NamedQuery(name = "Events_1.findByDepartment", query = "SELECT e FROM Events_1 e WHERE e.department = :department")
    , @NamedQuery(name = "Events_1.findByAmount", query = "SELECT e FROM Events_1 e WHERE e.amount = :amount")
    , @NamedQuery(name = "Events_1.findByEventdate", query = "SELECT e FROM Events_1 e WHERE e.eventdate = :eventdate")})
public class Events_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "eventname")
    private String eventname;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "amount")
    private long amount;
    @Basic(optional = false)
    @Column(name = "eventdate")
    @Temporal(TemporalType.DATE)
    private Date eventdate;

    public Events_1() {
    }

    public Events_1(String eventname) {
        this.eventname = eventname;
    }

    public Events_1(String eventname, String department, long amount, Date eventdate) {
        this.eventname = eventname;
        this.department = department;
        this.amount = amount;
        this.eventdate = eventdate;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        String oldEventname = this.eventname;
        this.eventname = eventname;
        changeSupport.firePropertyChange("eventname", oldEventname, eventname);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        long oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        Date oldEventdate = this.eventdate;
        this.eventdate = eventdate;
        changeSupport.firePropertyChange("eventdate", oldEventdate, eventdate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventname != null ? eventname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events_1)) {
            return false;
        }
        Events_1 other = (Events_1) object;
        if ((this.eventname == null && other.eventname != null) || (this.eventname != null && !this.eventname.equals(other.eventname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Events_1[ eventname=" + eventname + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
