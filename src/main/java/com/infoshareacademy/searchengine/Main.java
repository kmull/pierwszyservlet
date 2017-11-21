package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

public class Main {

    public static void main(String[] args) {
        UsersRepositoryDao repositoryDao = new UsersRepositoryDaoBean();

        for (User user : repositoryDao.getUserList()) {
            System.out.println("imie: " + user.getName() +
                    "\nnazwisko: " + user.getSurname() +
                    "\nwiek: " + user.getAge() +
                    "\nlogin: " + user.getLogin() +
                    "\n");
        }
    }
}
