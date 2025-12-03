package curso_programacao;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while(line != null) {

                String delimitedProducts = line.replaceAll("(\\d+)(\\s|$)", "$1;");
                delimitedProducts = delimitedProducts.replaceAll(";$", ""); // Remove o ; final se existir

                String[] products = delimitedProducts.split(";");

                for(String product: products) {

                    String[] productsFields = product.split(",");

                    String name = productsFields[0];
                    Double value = Double.parseDouble(productsFields[1].trim());
                    Integer quantity = Integer.parseInt(productsFields[2].trim());

                    list.add(new Product(name, value, quantity));

                }

                line = br.readLine();
            }

            File path = new File(strPath); //pega o arquivo
            File outDir = new File(path.getParent() + "/out");
            if (!outDir.exists()) {
                outDir.mkdirs();
            }

            File newFile = new File (outDir,"summary.csv");

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                for(Product product: list) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.totalPrice()));
                    bw.newLine();
                }
                bw.close();
                System.out.println("File created in: " + newFile.getAbsolutePath());
            }
            catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}