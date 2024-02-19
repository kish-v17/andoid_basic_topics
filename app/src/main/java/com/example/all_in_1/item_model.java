package com.example.all_in_1;

public class item_model {
    String name,mail;
    int img;

    public item_model(String name, String mail, int img) {
        this.name = name;
        this.mail = mail;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
