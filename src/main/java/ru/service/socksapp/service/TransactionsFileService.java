package ru.service.socksapp.service;
import java.io.File;

public interface TransactionsFileService {

    boolean cleanTransactionsJsonFile();

    boolean cleanTransactionsTxtFile();

    File getTxtFile();
    File getJsonFile();

    boolean saveToJsonFile(String json);

    boolean saveToTxtFile(String txt);

    String readFromJsonFile();

    File getTransactions();
}
