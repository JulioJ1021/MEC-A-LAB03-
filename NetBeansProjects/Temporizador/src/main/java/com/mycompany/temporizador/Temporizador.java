package com.mycompany.temporizador;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
/**
 *
 * @author julio
 */
class Crono{
    int horas, minutos, segundos, tiempo;
    Crono(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.tiempo = horas * 3600 + minutos * 60 + segundos;
    }

    void mostrar() {
        int hr = tiempo / 3600;
        int mts = (tiempo % 3600)/60;
        int sg = tiempo % 60;
        Ceros(hr);
        System.out.print(hr + ":");
        Ceros(mts);
        System.out.print(mts + ":");
        Ceros(sg);
        System.out.println(sg);
        tiempo--;
    }

    private void Ceros(int t) {
        if(t<10)
            System.out.print("0");
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
public class Temporizador {
        static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        Timer timer = new Timer();        
        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Segundos: ");
        int segundos = sc.nextInt();
        Crono tempo = new Crono (horas, minutos, segundos);
        TimerTask imprimir;
            imprimir = new TimerTask() {
                @Override
                public void run() {
                    tempo.mostrar();
                    if(tempo.getTiempo() == 0){
                        System.out.println("Fin del tiempo");
                        timer.cancel();
                    }
                }
            };
        timer.scheduleAtFixedRate(imprimir, 0, 1000);
    }
}
