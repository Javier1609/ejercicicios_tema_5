package ejercicio_12;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Introduce el número de fechas:");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over

        List<Date> fechas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la fecha " + (i + 1) + " en formato dd/MM/yyyy:");
            String fechaStr = scanner.nextLine();
            try {
                Date fecha = formato.parse(fechaStr);
                fechas.add(fecha);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Por favor, usa dd/MM/yyyy");
                i--;  // retry this iteration
            }
        }

        Collections.sort(fechas);

        System.out.println("Fechas en orden cronológico:");
        for (Date fecha : fechas) {
            System.out.println(formato.format(fecha));
        }
    }
}