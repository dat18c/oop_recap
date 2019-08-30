package com.kea.ooprecap;

public class Printer extends Machine
{

    //udskriftmetode
    public void print(String text, int count)
    {
        //iterer count gange
        for (int i=0;i<count;i++)
        {
            //udskriv text
            System.out.println(text);
        }


    }
}
