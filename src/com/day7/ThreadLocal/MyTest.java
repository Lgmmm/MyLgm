package com.day7.ThreadLocal;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class MyTest extends Thread {
    private Account account;

    public MyTest(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                account.setName(getName());
            }

            System.out.println(account.getName() + "账户i值" + i);
        }

    }

    public static void main(String[] args) {
        Account account = new Account("初始名");
        new MyTest("线程甲", account).start();
        new MyTest("线程乙", account).start();
    }
}
