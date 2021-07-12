package ntt.global.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO
{
    public void addAccount()
    {
        System.out.println("Membership add account in MembershipDAO \n");
    }

    public boolean  addMember()
    {
        System.out.println("Membership add member in MembershipDAO \n");
        return false;
    }

    public void goToSleep()
    {
        System.out.println("Go to sleep ... \n");
    }
}
