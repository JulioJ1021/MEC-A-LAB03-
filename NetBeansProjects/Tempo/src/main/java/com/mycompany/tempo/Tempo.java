/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempo;

/**
 *
 * @author julio
 */
public class Tempo {
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
