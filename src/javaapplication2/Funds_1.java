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
@Table(name = "funds", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funds_1.findAll", query = "SELECT f FROM Funds_1 f")
    , @NamedQuery(name = "Funds_1.findByFundname", query = "SELECT f FROM Funds_1 f WHERE f.fundname = :fundname")
    , @NamedQuery(name = "Funds_1.findByAmount", query = "SELECT f FROM Funds_1 f WHERE f.amount = :amount")
    , @NamedQuery(name = "Funds_1.findByFunddate", query = "SELECT f FROM Funds_1 f WHERE f.funddate = :funddate")
    , @NamedQuery(name = "Funds_1.findByContact", query = "SELECT f FROM Funds_1 f WHERE f.contact = :contact")})
public class Funds_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fundname")
    private String fundname;
    @Basic(optional = false)
    @Column(name = "amount")
    private long amount;
    @Basic(optional = false)
    @Column(name = "funddate")
    @Temporal(TemporalType.DATE)
    private Date funddate;
    @Basic(optional = false)
    @Column(name = "contact")
    private long contact;

    public Funds_1() {
    }

    public Funds_1(String fundname) {
        this.fundname = fundname;
    }

    public Funds_1(String fundname, long amount, Date funddate, long contact) {
        this.fundname = fundname;
        this.amount = amount;
        this.funddate = funddate;
        this.contact = contact;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        String oldFundname = this.fundname;
        this.fundname = fundname;
        changeSupport.firePropertyChange("fundname", oldFundname, fundname);
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        long oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Date getFunddate() {
        return funddate;
    }

    public void setFunddate(Date funddate) {
        Date oldFunddate = this.funddate;
        this.funddate = funddate;
        changeSupport.firePropertyChange("funddate", oldFunddate, funddate);
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        long oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fundname != null ? fundname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funds_1)) {
            return false;
        }
        Funds_1 other = (Funds_1) object;
        if ((this.fundname == null && other.fundname != null) || (this.fundname != null && !this.fundname.equals(other.fundname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Funds_1[ fundname=" + fundname + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
