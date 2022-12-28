package casestudy.lamlai_casestudy.service.customer.impl;

import casestudy.lamlai_casestudy.model.customer.Customer;
import casestudy.lamlai_casestudy.service.customer.ICustomerServiceIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceIO implements ICustomerServiceIO {
    @Override
    public List<Customer> readFile(String path) {
        List<Customer> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] cus = line.split(",");
                Customer customer = new Customer(cus[0],cus[1],cus[2],cus[3],cus[4],cus[5],cus[6],cus[7],cus[8]);
                list.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void writeFile(String path, List<Customer> customers) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Customer customer : customers) {
                bufferedWriter.write(customer.khuonMauCustomerCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
