package com.mycompany.cronometro;

/**
 *
 * @author julio
 */
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Tempo{
    int horas, minutos, segundos;
    Tempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    void Temporizador(){
        Timer timer = new Timer();
        TimerTask imprimir = new TimerTask() {
            @Override
            public void run() {
                System.out.println();
            }
        };
        int tiempo = Conversor();
        for(int c = tiempo; c > 0; c--){           
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
            try {
                Thread.sleep(1000);
            }catch(Exception e) {
		System.out.println(e);
            }
            //timer.schedule(imprimir, 1000);
        }
        System.out.println("Fin del tiempo");
    }
    int Conversor(){
        return this.horas * 3600 + this.minutos * 60 + this.segundos;
    }
    void Ceros(int t){
        if(t<10)
            System.out.print("0");
    }
}

public class Cronometro
{
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Horas: ");
		int horas = sc.nextInt();
		System.out.print("Minutos: ");
		int minutos = sc.nextInt();
		System.out.print("Segundos: ");
		int segundos = sc.nextInt();
		Tempo crono = new Tempo (horas, minutos, segundos);
		crono.Temporizador();
		
	}
}

