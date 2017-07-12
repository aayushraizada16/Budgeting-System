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
@Table(name = "otherexpenses", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Otherexpenses_1.findAll", query = "SELECT o FROM Otherexpenses_1 o")
    , @NamedQuery(name = "Otherexpenses_1.findByAmount", query = "SELECT o FROM Otherexpenses_1 o WHERE o.amount = :amount")
    , @NamedQuery(name = "Otherexpenses_1.findByMaintanence", query = "SELECT o FROM Otherexpenses_1 o WHERE o.maintanence = :maintanence")
    , @NamedQuery(name = "Otherexpenses_1.findByDate", query = "SELECT o FROM Otherexpenses_1 o WHERE o.date = :date")})
public class Otherexpenses_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "amount")
    private long amount;
    @Id
    @Basic(optional = false)
    @Column(name = "maintanence")
    private String maintanence;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Otherexpenses_1() {
    }

    public Otherexpenses_1(String maintanence) {
        this.maintanence = maintanence;
    }

    public Otherexpenses_1(String maintanence, long amount, Date date) {
        this.maintanence = maintanence;
        this.amount = amount;
        this.date = date;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        long oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getMaintanence() {
        return maintanence;
    }

    public void setMaintanence(String maintanence) {
        String oldMaintanence = this.maintanence;
        this.maintanence = maintanence;
        changeSupport.firePropertyChange("maintanence", oldMaintanence, maintanence);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maintanence != null ? maintanence.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Otherexpenses_1)) {
            return false;
        }
        Otherexpenses_1 other = (Otherexpenses_1) object;
        if ((this.maintanence == null && other.maintanence != null) || (this.maintanence != null && !this.maintanence.equals(other.maintanence))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Otherexpenses_1[ maintanence=" + maintanence + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
