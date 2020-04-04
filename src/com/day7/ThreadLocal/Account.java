package com.day7.ThreadLocal;

/**
 * Created by lgm
 * on 2020/4/1.
 */
public class Account {
    private ThreadLocal<String> local =new ThreadLocal<>();

    public Account(String str) {
        this.local.set(str);
    }

    public String getName(){
      return this.local.get();
    }

    public void setName(String name){
        this.local.set(name);
    }
}
