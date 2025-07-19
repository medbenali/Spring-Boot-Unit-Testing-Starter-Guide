package com.esprit.junitdemo;

import java.util.List;

public class DemoUtils {

    private String academy = "Esprit Academy";
    private String academyDuplicate = academy;

    private String [] firstThreeLettersOfAlphabet = { "A", "B", "C"};

    private List<String> academyInList = List.of("es", "pr", "it");

    public String getAcademy()
    {
        return academy;
    }

    public String getAcademyDuplicate()
    {
        return academyDuplicate;
    }

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public List<String> getAcademyInList() {
        return academyInList;
    }

    public Boolean isGreater(int n1, int n2)
    {
        if (n1 > n2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {

    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public Object checkNull(Object obj)
    {

        if (obj != null)
        {
            return obj;
        }
        return null;


    }
}