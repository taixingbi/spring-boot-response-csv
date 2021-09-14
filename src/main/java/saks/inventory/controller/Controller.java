package saks.inventory.controller;
import saks.inventory.model.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;


@RestController
public class Controller {
    @RequestMapping("/offer/inventory")
    public String index(HttpServletResponse response) {

        String csvFileName = "books.csv";
        response.setContentType("text/csv");

        // creates mock data
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
            csvFileName);
        response.setHeader(headerKey, headerValue);


        String data = "id,name,amount\n1,3,3\n2,44,5";
        return data;    
    }
}


//  Book book1 = new Book("Effective Java", "Java Best Practices",
//     "Joshua Bloch", "Addision-Wesley", "0321356683", "05/08/2008",
//     38);

// Book book2 = new Book("Head First Java", "Java for Beginners",
//     "Kathy Sierra & Bert Bates", "O'Reilly Media", "0321356683",
//     "02/09/2005", 30);