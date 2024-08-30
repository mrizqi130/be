package com.example.demo_22;

import com.example.demo_22.dto.TransactionRequest;
import com.example.demo_22.dto.TransactionResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestController
@RequestMapping("/api/developer/core")
public class TransactionController {

    @PostMapping("/trx-v2")
    public ResponseEntity<TransactionResponse> processTransaction(
            @RequestHeader("Authorization") String authorizationToken,
            @RequestBody TransactionRequest request) {

        // For simplicity, we assume the token is valid
        // In a real application, you would validate the token

        // Build the response body
        TransactionResponse response = new TransactionResponse();
        response.setRc("00");
        response.setStatusCode(200);
        response.setStatus("success");
        response.setMessage("Transaksi Berhasil");

        TransactionResponse.Data data = new TransactionResponse.Data();
        data.setTXID("tdiopenapi08976");
        data.setId_trx_code(30707300);

        response.setData(data);

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Powered-By", "Express");
        headers.set("Access-Control-Allow-Origin", "*");
        headers.set("Content-Type", "application/json; charset=utf-8");
        headers.set("Content-Length", "135"); // Adjust accordingly if necessary
        headers.set("ETag", "W/\"87-K5BkScWzlkJtySZ+gHrKrnaXQfg\"");
        headers.set("Date", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH)));
        headers.set("Connection", "keep-alive");
        headers.set("Keep-Alive", "timeout=5");

        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }
}