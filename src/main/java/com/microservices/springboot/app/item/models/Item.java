package com.microservices.springboot.app.item.models;

import lombok.Data;

@Data
public class Item {
	private Producto producto;
	private Integer cantidad;

	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Item() {
	}

	public Double getTotal() {
		return producto.getPrecio() * cantidad.doubleValue();
	}
}
