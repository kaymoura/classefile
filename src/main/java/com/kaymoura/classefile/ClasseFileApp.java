/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.classefile;

import java.io.File;
import java.io.IOException;
import java.util.Date;


/**
 * MÉTODOS CLASSE FILE
 * @author devsys-b on 21/03/2022
 */
public class ClasseFileApp {
    public static void main(String[] args) {
        File file =new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile() + "O arquivo foi criado");
            boolean exists = file.exists();
            System.out.println("Permissão de leitura? " +file.canRead() );
            System.out.println("path " +file.getPath());
            System.out.println("path " +file.getAbsolutePath());
            System.out.println("Diretório? " +file.isDirectory());
            System.out.println("Hidden? " +file.isHidden());
            System.out.println("Last modified? " +new Date(file.lastModified()));
            if(exists) {
                System.out.println("O arquivo não foi criado, talvez ele já exista");
                System.out.println("Deletado " +file.delete());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
