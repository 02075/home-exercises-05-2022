package io.codelex.typesandvariables.practice;

public class nuber5 {

    public static void main(String[] args) {

        table();

    }

    public static void table() {
        String[] name = {"es","johndoe2","engjelis","johndoe4","johndoe5","sinepe","johndoe7","johndoe8"};
        String[] subj = {"subj1","subj2","subj3","subj4","subj5","subj6","subj7","subj8"};
        System.out.println("+-----------------------------------------------------+");
        for (int i = 0; i < 8; i++) {
            System.out.println("| "+i+" |                          "+subj[i]+" |       " + name[i] + " |");
        }
        System.out.println("+-----------------------------------------------------+");

    }

}
