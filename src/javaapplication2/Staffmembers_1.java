/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Deepa
 */
@Entity
@Table(name = "staffmembers", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staffmembers_1.findAll", query = "SELECT s FROM Staffmembers_1 s")
    , @NamedQuery(name = "Staffmembers_1.findByStaffname", query = "SELECT s FROM Staffmembers_1 s WHERE s.staffname = :staffname")
    , @NamedQuery(name = "Staffmembers_1.findByStaffid", query = "SELECT s FROM Staffmembers_1 s WHERE s.staffid = :staffid")
    , @NamedQuery(name = "Staffmembers_1.findByDepartment", query = "SELECT s FROM Staffmembers_1 s WHERE s.department = :department")
    , @NamedQuery(name = "Staffmembers_1.findByContact", query = "SELECT s FROM Staffmembers_1 s WHERE s.contact = :contact")
    , @NamedQuery(name = "Staffmembers_1.findBySalary", query = "SELECT s FROM Staffmembers_1 s WHERE s.salary = :salary")})
public class Staffmembers_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "staffname")
    private String staffname;
    @Basic(optional = false)
    @Column(name = "staffid")
    private String staffid;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "contact")
    private long contact;
    @Basic(optional = false)
    @Column(name = "salary")
    private long salary;

    public Staffmembers_1() {
    }

    public Staffmembers_1(String staffname) {
        this.staffname = staffname;
    }

    public Staffmembers_1(String staffname, String staffid, String department, long contact, long salary) {
        this.staffname = staffname;
        this.staffid = staffid;
        this.department = department;
        this.contact = contact;
        this.salary = salary;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        String oldStaffname = this.staffname;
        this.staffname = staffname;
        changeSupport.firePropertyChange("staffname", oldStaffname, staffname);
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        String oldStaffid = this.staffid;
        this.staffid = staffid;
        changeSupport.firePropertyChange("staffid", oldStaffid, staffid);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        long oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        long oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffname != null ? staffname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staffmembers_1)) {
            return false;
        }
        Staffmembers_1 other = (Staffmembers_1) object;
        if ((this.staffname == null && other.staffname != null) || (this.staffname != null && !this.staffname.equals(other.staffname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Staffmembers_1[ staffname=" + staffname + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
