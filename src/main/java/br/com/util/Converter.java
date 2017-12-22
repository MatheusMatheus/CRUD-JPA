package br.com.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Converter {
	public static java.sql.Date localDateToSQLDate(LocalDate data) {
		if(data == null)
			return null;
		return java.sql.Date.valueOf(data);
	}
	
	public static LocalDate sqlDateToLocalDate(java.sql.Date data) {
		if(data == null)
			return null;
		return data.toLocalDate();
	}
	
	public static LocalDate stringToLocalDate(String data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			return LocalDate.parse(data, formatter);
		} catch (DateTimeParseException e) {
			return LocalDate.now();
		} 
	}
}
