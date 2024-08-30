package com.example.demo_22;

import com.example.demo_22.dto.CheckRequest;
import com.example.demo_22.dto.CheckResponse;
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
@RequestMapping("/Gateway/oapi")
public class GatewayController {

    @PostMapping("/check")
    public ResponseEntity<CheckResponse> check(
            @RequestHeader("Authorization") String authorizationToken,
            @RequestBody CheckRequest request) {

        // For simplicity, we assume the token is valid
        // In a real application, you would validate the token

        // Build the response body
        CheckResponse checkResponse = new CheckResponse();
        checkResponse.setStatus("00");
        checkResponse.setMessage("Request has been processed successfully");

        CheckResponse.Data data = new CheckResponse.Data();
        data.setResponseCode("2003600");
        data.setResponseMessage("Request has been processed successfully");
        data.setBeneficiaryAccountNo("0080210002622");
        data.setBeneficiaryBankCode("");
        data.setCurrency("IDR");
        data.setPreviousResponseCode("2000000");
        data.setReferenceNumber(request.getReferenceNumber());
        data.setSourceAccountNo("5140102000283");
        data.setTransactionId("30707299");
        data.setLatestTransactionStatus("00");
        data.setTransactionStatusDesc("success");

        checkResponse.setData(data);

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("date", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH)));
        headers.set("server", "uvicorn");
        headers.set("content-length", "432"); // You might want to calculate this dynamically
        headers.set("content-type", "application/json");

        return new ResponseEntity<>(checkResponse, headers, HttpStatus.OK);
    }
}
