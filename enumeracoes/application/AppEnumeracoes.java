package application;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class AppEnumeracoes {
	
	public static void main(String[] args) {
		/*
		 * Enumerações
		 * - tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas;
		 * - palavra chave em Java: enum;
		 * - vantagem: melhor semântica, código mais legível e auxiliado pelo compilador;
		 */
		
		Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
	
	
	
	
}
