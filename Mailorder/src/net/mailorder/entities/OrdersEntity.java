package net.mailorder.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "mailorder")
public class OrdersEntity {
    private Integer id;
    private String fname;
    private String lname;
    private String addr1;
    private String addr2;
    private String addrCity;
    private String addrPost;
    private String toAddr1;
    private String toAddr2;
    private String toAddrCity;
    private String toAddrPost;
    private String tracking;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fname", nullable = true, length = 16)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "lname", nullable = true, length = 16)
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "addr1", nullable = true, length = 32)
    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    @Basic
    @Column(name = "addr2", nullable = true, length = 32)
    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    @Basic
    @Column(name = "addrCity", nullable = true, length = 32)
    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    @Basic
    @Column(name = "addrPost", nullable = true, length = 16)
    public String getAddrPost() {
        return addrPost;
    }

    public void setAddrPost(String addrPost) {
        this.addrPost = addrPost;
    }

    @Basic
    @Column(name = "toAddr1", nullable = true, length = 32)
    public String getToAddr1() {
        return toAddr1;
    }

    public void setToAddr1(String toAddr1) {
        this.toAddr1 = toAddr1;
    }

    @Basic
    @Column(name = "toAddr2", nullable = true, length = 32)
    public String getToAddr2() {
        return toAddr2;
    }

    public void setToAddr2(String toAddr2) {
        this.toAddr2 = toAddr2;
    }

    @Basic
    @Column(name = "toAddrCity", nullable = true, length = 32)
    public String getToAddrCity() {
        return toAddrCity;
    }

    public void setToAddrCity(String toAddrCity) {
        this.toAddrCity = toAddrCity;
    }

    @Basic
    @Column(name = "toAddrPost", nullable = true, length = 16)
    public String getToAddrPost() {
        return toAddrPost;
    }

    public void setToAddrPost(String toAddrPost) {
        this.toAddrPost = toAddrPost;
    }

    @Basic
    @Column(name = "tracking", nullable = false, length = 16)
    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(fname, that.fname) &&
                Objects.equals(lname, that.lname) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(addrCity, that.addrCity) &&
                Objects.equals(addrPost, that.addrPost) &&
                Objects.equals(toAddr1, that.toAddr1) &&
                Objects.equals(toAddr2, that.toAddr2) &&
                Objects.equals(toAddrCity, that.toAddrCity) &&
                Objects.equals(toAddrPost, that.toAddrPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, lname, addr1, addr2, addrCity, addrPost, toAddr1, toAddr2, toAddrCity, toAddrPost);
    }
}
