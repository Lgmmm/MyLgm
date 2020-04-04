package com.day7.Lock同步锁;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


class Account {
    //客户id
    private String accountNo;
    //客户余额
    private double banlance;

    //同步锁
    private ReentrantLock re = new ReentrantLock();




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

    public void draw(double drawAmount) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        re.lock();
        if (getBanlance() >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取出金额" + drawAmount);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBanlance(getBanlance() - drawAmount);
            System.out.println(Thread.currentThread().getName() + "余额" + getBanlance());
        } else {
            System.out.println("余额不足");
        }
        re.unlock();

    }
}


