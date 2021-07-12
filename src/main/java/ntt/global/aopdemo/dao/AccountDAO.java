package ntt.global.aopdemo.dao;

import ntt.global.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO
{
    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag)
    {
        System.out.println(getClass() + " : Doing my db work: add account \n");
    }

    public String getName()
    {
        System.out.println("In AccountDAO.getName()");
        return name;
    }

    public void setName(String name)
    {
        System.out.println("In AccountDAO.setName()");
        this.name = name;
    }

    public String getServiceCode()
    {
        System.out.println("In AccountDAO.getService()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode)
    {
        System.out.println("In AccountDAO.setServiceCode()");
        this.serviceCode = serviceCode;
    }

    public List<Account> findAccount(boolean b)
    {
        if(b)
        {
            throw new RuntimeException("No soup for you !!");
        }

        List<Account> myAccounts = new ArrayList<>();
        myAccounts.add(new Account("John", "Silver"));
        myAccounts.add(new Account("Madhu", "Platinum"));
        myAccounts.add(new Account("Luca", "Gold"));

        return myAccounts;

    }
}
