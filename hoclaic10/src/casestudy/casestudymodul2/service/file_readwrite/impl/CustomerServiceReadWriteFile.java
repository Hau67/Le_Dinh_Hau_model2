package casestudy.casestudymodul2.service.file_readwrite.impl;

import casestudy.casestudymodul2.model.Customer;
import casestudy.casestudymodul2.service.file_readwrite.ICustomerServiceReadWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceReadWriteFile implements ICustomerServiceReadWriteFile {
    @Override
    public List<Customer> readFile(String path) throws IOException {
        List<Customer> list = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null ){
            String[] cst = line.split(",");
            Customer customer = new Customer(cst[0],cst[1],cst[2],cst[3],cst[4],cst[5],Integer.parseInt(cst[6]),cst[7],cst[8]);
            list.add(customer);
        }


        return list;
    }

    @Override
    public void writeFile(String path, List<Customer> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Customer customer: list) {
            bufferedWriter.write(customer.khuonMauCSVCustomer());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();

    }
}
