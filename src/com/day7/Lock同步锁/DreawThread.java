package com.day7.Lock同步锁;

/**
 * Created by lgm
 * on 2020/4/1.
 * 模仿银行账户取钱发生的同步
 */
public class DreawThread extends Thread {

    private Account account;
    //取出金额
    private double drawAmount;

    public DreawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        account.draw(drawAmount);
    }

    public static void main(String[] args) {
        Account account = new Account("aa", 1000);
        DreawThread thread = new DreawThread("甲",account, 800);
        DreawThread thread2 = new DreawThread("乙",account, 800);
        thread.start();
        thread2.start();
    }
}
