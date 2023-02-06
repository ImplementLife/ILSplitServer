package com.impllife.data.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "il_user")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String googleId;
    private String name;
    private String pass;
    private String phone;
    private String email;
    private String bankCardNum;
    private boolean isPremium;

    @OneToMany(orphanRemoval = true)
    private List<People> peoples;

    @OneToMany(orphanRemoval = true)
    private List<Group> groups;

    @OneToMany(orphanRemoval = true)
    private List<Requisition> requisitions;

    @OneToMany(orphanRemoval = true)
    private List<Transaction> transactions;

    @OneToMany(orphanRemoval = true)
    private List<Billing> billings;

    private String act; //delete it))

    //region Get/Set

    public List<People> getPeoples() {
        return peoples;
    }
    public void setPeoples(List<People> peoples) {
        this.peoples = peoples;
    }

    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getGoogleId() {
        return googleId;
    }
    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPremium() {
        return isPremium;
    }
    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String getAct() {
        return act;
    }
    public void setAct(String act) {
        this.act = act;
    }

    public List<Requisition> getRequisitions() {
        return requisitions;
    }
    public void setRequisitions(List<Requisition> requisitions) {
        this.requisitions = requisitions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Billing> getBillings() {
        return billings;
    }
    public void setBillings(List<Billing> billings) {
        this.billings = billings;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }
    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    //endregion

}
