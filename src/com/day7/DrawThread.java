package com.day7;

import java.util.Objects;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account, double drawAmount) {
       super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }


    @Override
    public  void run() {
        synchronized (account){
            if (account.getBanlance() >= drawAmount) {
                System.out.println(Thread.currentThread().getName()+ "取出金额" + drawAmount + "元" );

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBanlance( account.getBanlance() - drawAmount);
                System.out.println( "余额=" + account.getBanlance() );

            } else {
                System.out.println("余额不足");
            }

        }

    }
}


class Account {
    private String accountNo;
    private double banlance;

    public Account(String accountNo, double banlance) {
        this.accountNo = accountNo;
        this.banlance = banlance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.banlance, banlance) == 0 &&
                Objects.equals(accountNo, account.accountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo, banlance);
    }
}


class A{}
