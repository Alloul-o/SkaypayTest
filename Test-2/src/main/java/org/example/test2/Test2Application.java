package org.example.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class Test2Application {

	public static void main(String[] args) throws ParseException {
		Service service = new Service();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		service.setRoom(1, RoomType.STANDARD, 1000);
		service.setRoom(2, RoomType.JUNIOR, 2000);
		service.setRoom(3, RoomType.SUITE, 3000);

		service.setUser(1, 5000);
		service.setUser(2, 10000);

		service.bookRoom(1, 2, sdf.parse("30/06/2026"), sdf.parse("07/07/2026"));
		service.bookRoom(1, 2, sdf.parse("07/07/2026"), sdf.parse("30/06/2026"));
		service.bookRoom(1, 1, sdf.parse("07/07/2026"), sdf.parse("08/07/2026"));
		service.bookRoom(2, 1, sdf.parse("07/07/2026"), sdf.parse("09/07/2026"));
		service.bookRoom(2, 3, sdf.parse("07/07/2026"), sdf.parse("08/07/2026"));

		service.setRoom(1, RoomType.SUITE, 10000);

		service.printAll();
		service.printAllUsers();
	}

}
